package Server2;

import java.net.*;
import java.io.*;

public class Client2 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8890);
        System.out.println("Connection Success.");

        BufferedReader stin = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        while (true) {
            System.out.print("Enter Message you want : ");
            String str = stin.readLine();

            out.write("Client > " + str + "\n");
            out.flush();

            if (str.equals("quit")) {
                System.out.println("EXIT.");
                System.exit(0);
                break;
            }

            
            str = in.readLine();
            System.out.println(str);
        }

        out.close();
        in.close();
        stin.close();
        socket.close();
    }
}