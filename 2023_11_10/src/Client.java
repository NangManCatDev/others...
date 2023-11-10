import java.net.*;
import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8222);
        System.out.println("Enter the message you want");
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();

        OutputStream out = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(out);
        dos.writeUTF(msg);

        InputStream in = socket.getInputStream();
        DataInputStream din = new DataInputStream(in);
        System.out.println("Received message : " + msg);

        din.close();
        in.close();
        socket.close();
    }
}
