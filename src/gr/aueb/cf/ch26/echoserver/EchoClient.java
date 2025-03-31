package gr.aueb.cf.ch26.echoserver;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class EchoClient {

    public static void main(String[] args) {

        try(Socket client = new Socket("127.0.0.1",1234)) {
            Scanner readFromInput = new Scanner(System.in);
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedWriter bw =
                    new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));


            System.out.println("Enter Username: ");
            String username = readFromInput.nextLine();
            bw.write(username);
            bw.newLine();
            bw.flush();

            while(true){
                System.out.print("> ");
                String request = readFromInput.nextLine();
                bw.write(request);
                bw.newLine();
                bw.flush();
                if(request.equals("quit")){
                    System.out.println("Bye Bye");
                    break;
                }
                String response = br.readLine();
                System.out.println("Server response: " + response);

            }


        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
