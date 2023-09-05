package Prog9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class demo6 {
    public static void main(String argv[]) throws IOException {
        String sFile = "123";
        String dFile = "456";
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(new FileInputStream(sFile)));
        BufferedWriter bufWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dFile)));
        String input = null;
        while ((input = bufReader.readLine()) != null) {
            bufWriter.write(input);
            bufWriter.newLine();
        }
        bufReader.close();
        bufWriter.close();
    }
}
