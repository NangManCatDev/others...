package Server1;
import java.net.*;
import java.io.*;

public class Server1 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8222);     // 서버에 연결하기 위한 소켓 생성, localhost의 8222 포트로 연결
        System.out.println("Waiting for client connection");
        Socket socket = serverSocket.accept();      // 클라이언트의 연결을 기다리고, 연결되면 새로운 소켓을 생성
        byte[] arr = {1,2,3,4,5,6,7,8,9,10};
        OutputStream out = socket.getOutputStream();        // 클라이언트에게 받은 메시지를 그대로 돌려보내기 위한 출력 스트림 생성
        out.write(arr);

        out.close();    // 사용한 자원들 닫기
        socket.close();
        serverSocket.close();
    }
}
