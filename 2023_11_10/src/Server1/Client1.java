package Server1;
import java.net.*;
import java.util.Arrays;
import java.io.*;

public class Client1 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8222);      // 서버에 연결하기 위한 소켓 생성, localhost의 8222 포트로 연결
        System.out.println("Connection Complete." + socket);
        InputStream in = socket.getInputStream();       // 소켓을 통한 데이터 입력 받기 위한 스트림 생성
        byte[] arr = new byte[10];
        in.read(arr);
        System.out.println(Arrays.toString(arr));

        in.close();
        socket.close();
    }
}
