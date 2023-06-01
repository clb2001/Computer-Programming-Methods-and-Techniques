package Prog3;

import java.util.Scanner;

public class randomMatrix {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printArray(RandomMatrix(n));
    }

    public static int[][] RandomMatrix(int n)
    {
        int[] array = new int[n];
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            array[i] = (int)(Math.random()*n)+1;
        }

        for (int i = 0; i < n; i++)
        {
            matrix[i][i] = 1;
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < array[1] + 1; j++)
            {
                matrix[i][j] += array[j];
            }
            for (int j = array[1] + 1; j < n; j++)
            {
                matrix[i][j] += (int)(Math.random()*n)+1; 
            }
        }
        return matrix;
    } 

    public static void printArray(int[][] array) 
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }  
}
