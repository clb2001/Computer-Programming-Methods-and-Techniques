package Prog9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 字节流以字节（8bit）为单位，字符流以字符为单位，根据码表映射字符，一次可能读多个字节。
// 字节流能处理所有类型的数据（如图片、avi等），而字符流只能处理字符类型的数据。
public class demo3 {
    public static void main(String argv[]) throws IOException {
        String srcFile = "123";
        String destFile = "456";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bytes = new byte[16];
        while (true) {
        int size = 0;
        if((size = bis.read(bytes)) <= 0) {
        break; }
        bos.write(bytes, 0, size);
        bos.flush();
        }
        bis.close();
        bos.close();
    }
}
