package gr.aueb.cf.ch26.echoserver;

import java.io.*;
import java.net.Socket;

public class ConcurrentEchoServer implements Runnable{
    private final Socket socket;

    public ConcurrentEchoServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try(BufferedWriter bw =
                    new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))){


            String username = br.readLine();
            System.out.println("User " + username + " is in.");

            while(true){
                String request = br.readLine();
                System.out.println("Read from " + username + ": " + request);
                if(request.equals("quit")){
                    System.out.println("User " + username + " is done!");
                    break;
                }
                String response = "<Server Echoing: " + request + ">";
                bw.write(response);
                bw.newLine();
                bw.flush();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
