package gr.aueb.cf.ch09;

import java.io.*;
import java.util.Scanner;
import java.util.UUID;

public class Ex02 {

    public static void main(String[] args) {

        int b;
        int byteCount = 0;
        byte[] buf = new byte[4096];
        long start;
        long end;
        double elapsedTime;
        System.out.println("Enter File Name: ");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        String fileInPath = "E:\\JavaInputOutputFiles\\" + fileName;
        String fileOutPath =
                "E:\\JavaInputOutputFiles\\"
                        + UUID.randomUUID().toString().replace(":","_") + fileName;

        String[] ft = fileName.split("\\.");
        String fileType = ft[1];


        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(fileInPath));
             BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(fileOutPath))){
            start = System.currentTimeMillis();
            while((b = bis.read(buf)) != -1){
                bos.write(buf, 0 , b);
                byteCount += b;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;

            System.out.println("Το αρχείο με όνομα: " + fileInPath);
            System.out.println("Τύπος αρχείου: " + fileType);
            System.out.println("και μέγεθος: " + byteCount + " Bytes");
            System.out.println("αντιγράφηκε στο αρχείο με όνομα: " + fileOutPath);
            System.out.println("Χρόνος που απαιτήθηκε: " + elapsedTime + " " +
                    "δευτερολεπτα");


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
