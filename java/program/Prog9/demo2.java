package Prog9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo2 {
    public static void main(String argv[]) throws IOException {
        String srcFile = "123";
        String destFile = "456";
        FileInputStream fin = new FileInputStream(srcFile);
        FileOutputStream fout = new FileOutputStream(destFile);
        byte[] bytes = new byte[1024];
        while (fin.read(bytes) != -1) {
            fout.write(bytes);
            fout.flush();
        }
        fin.close();
        fout.close();
    }
}
