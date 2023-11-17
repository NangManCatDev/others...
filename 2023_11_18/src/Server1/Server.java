package Server1;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("Connecting . . . ");
        Socket socket = serverSocket.accept();
        InetAddress addr = socket.getInetAddress();
        System.out.println(addr.getHostAddress() + "Connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = in.readLine();
        System.out.println(str);

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        out.write(str + "\n");
        out.flush();

        out.close();
        in.close();
        socket.close();
        serverSocket.close();
    }
}