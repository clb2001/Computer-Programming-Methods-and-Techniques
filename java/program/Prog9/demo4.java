package Prog9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class demo4 {
    public static void main(String argv[]) throws IOException {
        String sFile = "123";
        String dFile = "456";
        File srcFile = new File(sFile);
        File destFile = new File(dFile); 
        // 文件字符流
        // FileInputStream既可以读入File，又可以读入String
        InputStreamReader isr = new InputStreamReader(new FileInputStream(srcFile));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(destFile));
        char[] bytes = new char[1024];
        while (isr.read(bytes) != -1) {
            osw.write(bytes);
            osw.flush();
        }
        isr.close();
        osw.close();
    }
}
