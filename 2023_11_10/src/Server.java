import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8222);     // 서버 소켓 생성 및 포트 8222로 설정
        System.out.println("Waiting for client connection.");
        Socket socket = serverSocket.accept();      // 클라이언트의 연결을 기다리고, 연결되면 새로운 소켓을 생성

        InputStream in = socket.getInputStream();       // 클라이언트로부터 데이터를 받기 위한 입력 스트림 생성
        DataInputStream din = new DataInputStream(in);
        String msg2 = din.readUTF();        // 클라이언트로부터 받은 UTF 문자열 읽기
        System.out.println("Received message : " + msg2);

        OutputStream out = socket.getOutputStream();        // 클라이언트에게 받은 메시지를 그대로 돌려보내기 위한 출력 스트림 생성
        DataOutputStream dos = new DataOutputStream(out);
        dos.writeUTF(msg2);

        dos.close();        // 사용한 자원들 닫기
        out.close();
        socket.close();
        serverSocket.close();
    }
}
