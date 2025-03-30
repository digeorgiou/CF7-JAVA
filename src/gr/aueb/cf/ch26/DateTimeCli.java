package gr.aueb.cf.ch26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class DateTimeCli {

    public static void main(String[] args) {

        //η κλαση Socket δινει TCP Socket
        Socket socket = null;
        //δεν ξερουμε ποσα data θα ερθουν, οποτε διαβαζουμε μεσα σε μια while
        //και συνενωνουμε τα Strings που ερχονται σε εναν StringBuilder.
        StringBuilder sb = new StringBuilder();
        BufferedReader bf = null;

        try {
            //InetAddress ειναι ενας container για μια IP διευθυνση
            InetAddress servAddress = InetAddress.getByName("time.nist.gov");
            //το Port 13 ειναι του Date Time Server
            int servPort = 13;
            socket = new Socket(servAddress, servPort);
            bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line = "";

            while ((line = bf.readLine()) != null) {
                //η readLine καταναλωνει την αλλαγη γραμμης αλλα δεν την
                // επιστρεφει. γι αυτο την κανουμε append κι αυτην αν θελουμε
                // να την διατηρησουμε.
                sb.append(line).append("\n");
            }

            System.out.println("Server DateTime: " + sb);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) socket.close();
                if (bf != null) bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
