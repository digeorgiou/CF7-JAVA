package gr.aueb.cf.ch09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Ex01 {

    public static void main(String[] args) {

        String inFilePath = "E:\\JavaInputOutputFiles\\sampledata.txt";
        String outFilePath = "E:\\JavaInputOutputFiles\\sampledataNEW.txt";

        try(BufferedReader br =
                    new BufferedReader(new FileReader(inFilePath));
            PrintStream ps = new PrintStream(outFilePath,
                    StandardCharsets.UTF_8)) {

            String line;
            String[] tokens;
            String firstLine = br.readLine();
            tokens = firstLine.split(",+\\s*");
            String s1 = tokens[0];
            String s2 = tokens[1];
            String s3 = tokens[2];
            while((line = br.readLine()) != null) {
                tokens = line.split(",+\\s*");
                ps.printf("{%s: '%s', %s: %s, %s: %s },\n", s1,tokens[0],s2,
                        tokens[1],s3, tokens[2]);

            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }


}
