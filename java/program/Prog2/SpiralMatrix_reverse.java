import java.util.Arrays;

public class SpiralMatrix_reverse {
 
    public static void main(String[] args) {
        printArray(geneSpiralMatrix(5, 5));//m: 5
        System.out.println(Arrays.deepToString(geneSpiralMatrix(5, 5)));
    }
 
    public static int[][] geneSpiralMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        if (m * n <= 0) {
            return matrix;
        }
        int up = 0, down = m - 1;
        int left = 0, right = n - 1;
        int num = 1;
 
        while (num <= m * n) {
            //从上到下
            for (int i = up; i <= down; i++) {
                matrix[i][right] = num++;
            }
            right--;
            //从右到左
            for (int i = right; i >= left; i--) {
                matrix[down][i] = num++;
            }
            down--;
 
            //从下到上
            for (int i = down; i >= up; i--) {
                matrix[i][left] = num++;
            }
            left++;

            //从左到右
            for (int i = left; i <= right; i++) {
                matrix[up][i] = num++;
            }
            up++;
        }
 
        return matrix;
 
    }
 
    public static void printArray(int[][] array) {
 
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 10) {
                    System.out.print("0");
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
