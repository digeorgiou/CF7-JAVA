package gr.aueb.cf.ch26.echoserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ConcurrentEchoServerApp {

    private static final int PORT = 1234;

    public static void main(String[] args) {

        try(ServerSocket server = new ServerSocket(PORT)){
            System.out.println("Server has Started.");

            for(;;){
                Socket connectedFd = server.accept();
                Thread socketThread =
                        new Thread(new ConcurrentEchoServer(connectedFd));
                socketThread.start();
            }

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
