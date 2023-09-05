import java.util.Scanner;

public class insert_sort
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int i, j;
        int size = input.nextInt();
        int[] arr = new int[size];
        for (i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.print("\n");
        System.out.println("size: " + size);
        Insert_sort(size, arr);
        for (j = 0; j < size; j++)
        {
            System.out.print(arr[j] + " ");
        }
        System.out.print("\n");
    }

    public static void Insert_sort(int size, int[] arr)
    {
        for (int i = 1; i < size; i ++)
        {
            int temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j - 1])
            {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
