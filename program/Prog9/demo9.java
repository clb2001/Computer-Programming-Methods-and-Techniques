package Prog9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class MyException extends Exception {
    String message;

    public MyException(String exceptionMessage) {
        message = exceptionMessage;
    }

    public String getMessage() {
        return message;
    }
}

public class demo9 {
    void testException(Integer i) throws MyException {
        if (i == null) {
            MyException e = new MyException("Input i: null");
            throw e;
        }
        System.out.println("Input i: " + i);
    }

    public static void copy(String sFile, String dFile) throws FileNotFoundException, IOException {
        File srcFile = new File(sFile);
        File destFile = new File(dFile);
        FileInputStream fin = null;
        FileOutputStream fout = null;
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
    }
}
