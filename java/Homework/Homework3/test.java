import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class test {
    private static void showResult(String tag, boolean flag) {
        System.out.print(tag + ": ") ;
        if(flag) {
            System.out.println("[Yes]");
        }
        else {
            System.out.println("[No]");
        }
    }

    // 打印结果
    private static void showResult(String tag, String info) {
        System.out.println(tag + ": " + info);
    }

    private static void list(File filePath){
        for (File fileDir : filePath.listFiles()) {
            if (fileDir.isDirectory()) {
                list(fileDir);
            }
            else if (fileDir.isFile()) {
                System.out.println(fileDir.getAbsolutePath());
            }
        }
    }

    // 查看文件是否可读、可执行等等性质
    private static void test1(File file) {
        showResult("File exists", file.exists());
        showResult("Directory", file.isDirectory());
        showResult("File", file.isFile());
        showResult("Executable", file.canExecute());
        showResult("Readable", file.canRead());
        showResult("Writable", file.canWrite());
        showResult("Hidden", file.isHidden());
        showResult("Absolute Path", file.isAbsolute());
    }

    // 查看文件的名称、路径
    private static void test2(File file) {
        showResult("Name", file.getName());
        showResult("Path", file.getPath());
        showResult("Absolute Path", file.getAbsolutePath());
        showResult("Parent", file.getParent());
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("[yyyy-MM-dd] hh:mm:ss");
        showResult("Modified", sdf.format(cal.getTime()));
        showResult("Size", Long.valueOf(file.length()).toString());
    }

    // 文件是否是文件夹？
    private static void test3(File file) {
        if(file.isDirectory()) {
            list(file);
        }
    }

    // 下面都是读写文件操作，test4是字节流
    // 字节(byte)流：处理声音或者图片等二进制的数据的流
    // 字符(char)流：处理文本数据（如txt文件）的流
    // 哪个性能增益大: 大大块读，还是碎碎读
    private static void test4(String srcFile, String destFile) throws Exception{
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
    
    // test5也是字节流
    private static void test5(String srcFile, String destFile) throws Exception{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bytes = new byte[16];
        int size = 0;
        while ((size = bis.read(bytes)) >= 0) {
            bos.write(bytes, 0, size);
            bos.flush();
        }
        bis.close();
        bos.close();
    }

    // 字符流
    private static void test6(String srcFile, String destFile) throws Exception{
        InputStreamReader isr= new InputStreamReader(new FileInputStream(srcFile));
        OutputStreamWriter osw= new OutputStreamWriter (new FileOutputStream(destFile), "GBK");
        char[] bytes = new char[16];
        int size = 0;
        while ((size = isr.read(bytes)) >= 0) {
            osw.write(bytes, 0, size);
            osw.flush();
        }
        isr.close();
        osw.close();
    }

    // 字符流
    private static void test7(String srcFile, String destFile) throws Exception{
        FileReader fr = new FileReader(srcFile);
        FileWriter fw = new FileWriter(destFile);
        char buf [] = new char [16];
        int len = 0;
        while((len = fr.read(buf)) >= 0 ){
            fw.write(buf, 0, len);
        }
        fr.close();
        fw.close();
    }

    // 字符流
    private static void test8(String srcFile, String destFile) throws Exception {
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(new FileInputStream(srcFile)));
        BufferedWriter bufWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(destFile)));
        String input = null;
        while ((input = bufReader.readLine()) != null) {
            bufWriter.write(input);
            bufWriter.newLine();
        }
        bufReader.close();
        bufWriter.close();
    }

    public static void main(String[] args) {
        String fileName = "test";
        File file = new File(fileName);
        System.out.println("File: " + file.getAbsolutePath());
        test1(file);
        test2(file);
        test3(file);
        try {
            test6("test", "test.another");
        }
        catch (Exception e) {
            System.out.println("Test failed");
        }
    }
}
