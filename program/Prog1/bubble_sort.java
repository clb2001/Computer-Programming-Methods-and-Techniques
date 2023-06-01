import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j;
        int size = input.nextInt();
        int[] arr = new int[size];
        for (i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("\n");
        System.out.println("size: " + size);
        Bubble_sort(size, arr);
        for (j = 0; j < size; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("\n");
    }

    public static void Bubble_sort(int size, int arr[]) {
        for (int i = 0; i < size - 1; i++)
        {
            for (int j = 0; j < size - 1 - i; j ++)
            {
                if (arr[j] > arr[j+1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}