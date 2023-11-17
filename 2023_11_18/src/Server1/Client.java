package Server1;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8888);
        System.out.println("Connection Success.");

        Scanner stin = new Scanner(System.in);
        System.out.println("Enter Comment you want");
        String str = stin.nextLine();
        
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        out.write("Client > " + str + "\n");
        out.flush();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        str = in.readLine();
        System.out.println("Received Message : " + str + "\n");

        out.close();
        socket.close();
    }
}