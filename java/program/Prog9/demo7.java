package Prog9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo7 {
    public static void copy(String sFile, String dFile) {
        File srcFile = new File(sFile);
        File destFile = new File(dFile);
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream(srcFile);
            if (!destFile.exists()) {
                destFile.createNewFile();
            }
            fout = new FileOutputStream(destFile);
            byte[] bytes = new byte[1024];
            while (fin.read(bytes) != -1) {
                fout.write(bytes);
                fout.flush();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can find the source file: " + sFile);
        } catch (IOException e) {
            System.out.println("IO Exception caught.");
        }
    }
}
