package Server3;

import java.io.*;
import java.net.*;

public class Client3 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8889);
        System.out.println("Connection Success.");

        BufferedReader stin = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        while (true) {
            System.out.print("Enter Message you want : ");
            String str = stin.readLine();

            out.write("Client > " + str + "\n");
            out.flush();
            if (str.equals("bye")) {
                System.out.println("EXIT.");
                System.exit(0);
                break;
            }
            String response = in.readLine();
            System.out.println(response);

            
            response = in.readLine();
            System.out.println();
        }
        
        out.close();
        in.close();
        stin.close();
        socket.close();
    }
}
