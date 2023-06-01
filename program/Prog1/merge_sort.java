import java.util.Scanner;

public class merge_sort {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int i, j;
        int size = input.nextInt();
        int[] arr = new int[size];
        for (i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("\n");
        System.out.println("size: " + size);
        Merge_sort(size, arr);
        for (j = 0; j < size; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("\n");
    }

    public static void Merge_sort(int size, int arr[])
    {
        if (size > 1)
        {
            int mid = size / 2;
            int[] left = new int[mid]; 
            int[] right = new int[size-mid];
            for (int i = 0; i < mid; i++)
            {
                left[i] = arr[i];
            }
            for (int j = mid; j < size; j++)
            {
                right[j - mid] = arr[j];
            }
            Merge_sort(mid, left);
            Merge_sort(size - mid, right);
            Merge(arr, left, right, mid, size - mid);
        }
    }
    
    public static void Merge(int[] arr, int[] L, int[] R, int l, int r)
    {
        int i = 0, j = 0, k = 0;
        while (i < l && j < r)
        {
            if (L[i] <= R[j])
            {
                arr[k++] = L[i++];
            }
            else
            {
                arr[k++] = R[j++];
            }
        }
        while (i < l)
        {
            arr[k++] = L[i++];
        }
        while (j < r)
        {
            arr[k++] = R[j++];
        }
    }
}
