package gr.aueb.cf.ch26;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateTimeServer extends Thread{

    @Override
    public void run() {
        ServerSocket servFd;
        int serverPort = 13;

        try{
           servFd = new ServerSocket();
           //το 100 σημαινει οτι μπορει να δεχτει μεχρι 100 packet. το
            // default ειναι 50 (μεγεθος queue)
           servFd.bind(new InetSocketAddress("127.0.0.1",serverPort),100);

           while(true){
            //οταν γινει η συνδεση δημιουργειται ενα νεο Socket σαν το πρωτο,
               // αλλα ειναι εφημερο. οταν τελειωσει η συνδεση, το κανουμε close
               //ουσιαστικα γινεται fork - δημιουργειται ενα αντιγραφο

               Socket connectedFd = servFd.accept();
               BufferedWriter bw =
                       new BufferedWriter(new OutputStreamWriter(connectedFd.getOutputStream()));
               bw.write("Τοπική ώρα: " + new Date().toString());
               bw.flush();
               connectedFd.close();
           }
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
