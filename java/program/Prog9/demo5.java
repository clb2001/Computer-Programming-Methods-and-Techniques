package Prog9;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class demo5 {
    public static void main(String argv[]) throws IOException {
        String sFile = "123";
        String dFile = "456";
        File srcFile = new File(sFile);
        File destFile = new File(dFile); 
        FileReader fr = new FileReader(srcFile);
        FileWriter fw = new FileWriter(destFile);
        char buf[] = new char[1024];
        int len = 0;
        while ((len = fr.read(buf)) != -1) {
            fw.write(buf, 0, len);
        }
        fr.close();
        fw.close();
    }
}
