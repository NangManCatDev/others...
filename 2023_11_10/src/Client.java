import java.net.*;
import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8222);      // 서버에 연결하기 위한 소켓 생성, localhost의 8222 포트로 연결
        System.out.println("Enter the message you want");       // 메세지 입력 요청
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();

        OutputStream out = socket.getOutputStream();    // 소켓을 통해 데이터 전송 위한 출력 스트림 생성
        DataOutputStream dos = new DataOutputStream(out);
        dos.writeUTF(msg);      // 입력받은 메시지를 UTF 형식으로 서버에 전송

        InputStream in = socket.getInputStream();       // 입력 스트림 생성
        DataInputStream din = new DataInputStream(in);
        System.out.println("Received message : " + msg );   // 서버에서 받은 메세지 출력

        din.close();
        in.close();
        socket.close();
    }
}
