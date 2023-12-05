import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
    public static void main(String[] args) {
        ServerSocket sSoc = null;
        Socket soc = null;
        try {
            sSoc = new ServerSocket(10111);
            System.out.println("접속을 기다립니다");
            while (true) {
                soc = sSoc.accept();
                EchoThread et = new EchoThread(soc);
                et.start();
            }

        }catch (Exception e) {
            System.out.println(e);
        }finally {
            try {
                soc.close(); sSoc.close();
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class EchoThread extends Thread {
    private Socket soc;
    public EchoThread(Socket soc) {
        this.soc = soc;
    }
    public void run() {
        InetAddress addr = null;
        PrintWriter pw = null;
        BufferedReader br = null;
        String      inMsg = null;
        try {
            addr = soc.getInetAddress();
            System.out.println(addr.getHostAddress()+":"+soc.getPort()+"접속");
            pw = new PrintWriter(new OutputStreamWriter(soc.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(soc.getInputStream()));

            while (true) {
                inMsg = br.readLine();
                if(inMsg.equalsIgnoreCase("quit")){
                    System.out.println(soc.getPort()+"bye!!");
                    break;
                }
                System.out.println("from"+ soc.getPort() + ":"+inMsg);
                pw.println(inMsg);
                pw.flush();
            }


        }catch (Exception e) {
            System.out.println("서버오류");
        }finally {
            try {
                br.close(); pw.close(); soc.close();
            }catch (Exception e) {
                System.out.println("닫기 오류");
            }
        }
    }
}