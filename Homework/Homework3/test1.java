import java.io.IOException;

public class test1 {
    public static void main(String argv[]) throws IOException{
        String fileName = "dsga";
        JavaFileProcess a = new JavaFileProcess();
        a.findJavaFiles(fileName);
    }
}
