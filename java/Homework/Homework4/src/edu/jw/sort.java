package edu.jw;

public class sort{
    public int[] sort(int[] input) {
        System.out.println("BubbleSort");
        for (int i = 0; i < input.length - 1; i++)
        {
            for (int j = 0; j < input.length - 1 - i; j ++)
            {
                if (input[j] > input[j+1])
                {
                    int tmp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = tmp;
                }
            }
        }
        return input;
    }
}
