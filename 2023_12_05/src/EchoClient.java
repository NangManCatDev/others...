import java.net.*;
import java.io.*;

public class EchoClient {
    public static void main(String[] args) {
        Socket soc = null;
        BufferedReader keyboard = null;
        PrintWriter pw = null;
        BufferedReader br = null;
        String keyinMsg = null;
        String inMsg = null;

        try {
            soc = new Socket("192.168.43.1", 10111);
            keyboard = new BufferedReader(new InputStreamReader(System.in));
            pw = new PrintWriter(new OutputStreamWriter(soc.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(soc.getInputStream()));

            System.out.println("** 종료 : quit");
            while(true) {
                System.out.println("client : ");
                keyinMsg = keyboard.readLine();
                pw.println(keyinMsg);
                pw.flush();

                if(keyinMsg.equalsIgnoreCase("quit"))
                    break;

                inMsg = br.readLine();
                System.out.println("from echo-Server : " + inMsg);
            }
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            try { 
                br.close(); pw.close(); keyboard.close(); soc.close();
            } catch(IOException e) { 
                System.out.println("닫기 오류 .");
            }
        }
    }
}