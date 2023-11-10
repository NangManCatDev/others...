import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8222);
        System.out.println("Waiting for client connection.");
        Socket socket = serverSocket.accept();

        InputStream in = socket.getInputStream();
        DataInputStream din = new DataInputStream(in);
        String msg2 = din.readUTF();
        System.out.println("Received message : " + msg2);

        OutputStream out = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out);
        dos.writeUTF(msg2);

        dos.close();
        out.close();
        socket.close();
        serverSocket.close();
    }
}