package Prog9;

import java.io.File;

public class demo1 {
    void findFilebyName(File filePath, String fileName) {
        for (File fileDir : filePath.listFiles()) {
            if (fileDir.isDirectory()) {
                findFilebyName(fileDir, fileName);
            } else if (fileDir.isFile()) {
                if (fileDir.getName().contains(fileName)) {
                    System.out.println(fileDir.getName());
                }
            }
        }
    }
}
