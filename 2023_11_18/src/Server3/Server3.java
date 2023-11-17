package Server3;

import java.io.*;
import java.net.*;

public class Server3 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8889);
        System.out.println("Connecting . . . ");
        Socket socket = serverSocket.accept();
        System.out.println("Connected");

        BufferedReader stin = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        while (true) {
            String str = in.readLine();
            if (str == null || str.equals("Client > bye")) {
                System.out.println("EXIT");
                break;
            }
            
            System.out.println(str);
            out.write(str + "\n");
            out.flush();

            System.out.print("Enter Message you want : ");
            str = stin.readLine();

            out.write("Server > " + str + "\n");
            out.flush();
        }

        in.close();
        out.close();
        socket.close();
        serverSocket.close();
    }
}
