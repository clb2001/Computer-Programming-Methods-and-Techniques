package Prog2;
import java.util.Scanner;
import java.util.Arrays;

public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[][] arr = new int[size][size];
        circle(size, arr);
        for (int[] date : arr) {

            /*
             * for (int date : row){
             * System.out.printf("%d\t",date);
             * }
             */

            System.out.println(Arrays.toString(date));

        }
    }

    public static void circle(int size, int[][] arr) {
        int len = 1;
        while (len <= size) {
            if (len == 1) {
                arr[(size - 1) / 2][(size - 1) / 2] = len * len;
                len += 2;
            } else {
                for (int i = 0; i < len; i++) {
                    arr[(size - len) / 2 + i][size - 1 - (size - len) / 2] = len * len - i;
                }
                for (int i = 0; i < len - 2; i++) {
                    arr[(size - len) / 2 + len - 1][size - 1 - (size - len) / 2 - i - 1] = len * len - len - i;
                }
                for (int i = 0; i < len; i++) {
                    arr[size - 1 - (size - len) / 2 - i][(size - len) / 2] = len * len - 2 * len + 2 - i;
                }
                for (int i = 0; i < len - 2; i++) {
                    arr[(size - len) / 2][(size - len) / 2 + i + 1] = len * len - 3 * len + 2 - i;
                }
                len += 2;
            }
        }
    }
}
