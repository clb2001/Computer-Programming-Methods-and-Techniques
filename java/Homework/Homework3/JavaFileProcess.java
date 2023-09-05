import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

class MyException extends Exception {
    String message;

    public MyException(String exceptionMessage) {
        message = exceptionMessage;
    }

    public String getMessage() {
        return message;
    }
}

public class JavaFileProcess {

    // 先查找文件中的java文件
    private static void listFile(File file) throws IOException, FileNotFoundException {
        if (file.isDirectory()) {
            list(file);
        }
    }

    private static void list(File filePath) throws IOException, FileNotFoundException {
        // 再一个一个遍历，查找java文件以及其中有无//todo:
        for (File fileDir : filePath.listFiles()) {
            if (fileDir.isDirectory()) {
                list(fileDir);
            } else if (fileDir.isFile()) {
                File file = new File(fileDir.getAbsolutePath());
                preprocess(file);
            }
        }
    }

    private static void preprocess(File file) throws IOException, FileNotFoundException{
        if (file.getName().endsWith(".java")) {
            try{
                if (!file.canRead()){
                    throw new MyException(file + " cannot be read");
                }
            }catch (Exception e1){
                System.out.println(e1.getMessage());
            }
            InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");// 考虑到编码格式
            BufferedReader bufferedReader = new BufferedReader(read);
            String line = null;
            int num = 0;
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    // 判断是否有//todo
                    if (line.contains("//todo:")) {
                        num++;
                    }
                }
                bufferedReader.close();
                if (num != 0){
                    System.out.println(file.getAbsolutePath());
                }
                else if (num == 0) {
                    throw new MyException("todo not found");
                }
            } catch (MyException e2) {
                System.out.println(e2.getMessage());
            }
        }
    }

    public void findJavaFiles(String path) throws IOException, FileNotFoundException{
        // Scanner in = new Scanner(System.in);
        // String fileName = in.nextLine();
        // String fileName = "D:\\Codefield\\test";
        File file = new File(path);
        try{
            if (!file.exists() || !file.isDirectory()) {
                throw new MyException("文件查找失败：" + file + "不是一个目录！请重新输入");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        listFile(file);
    }
}