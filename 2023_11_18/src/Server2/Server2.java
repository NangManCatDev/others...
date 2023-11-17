package Server2;

import java.io.*;
import java.net.*;

public class Server2 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8890);
        System.out.println("Connecting . . . ");
        Socket socket = serverSocket.accept();
        System.out.println("Connection Success.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        while (true) {
        String str = in.readLine();
        if (str == null || str.equals("Client > quit")) {
            System.out.println("EXIT");
            break;
        }
        
        System.out.println(str);
        out.write(str + "\n");
        out.flush();
        }
        out.close();
        in.close();
        socket.close();
        serverSocket.close();
    }
}