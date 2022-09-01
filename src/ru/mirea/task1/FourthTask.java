package ru.mirea.task1;

import java.util.Random;

public class FourthTask {
    final static Random random = new Random();

    public static void main(String[] args)
    {
        if (args.length < 1)
            return;

        int arrSize = Integer.parseInt(args[0]);
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++)
        {
            if (i % 2 == 0)
                arr[i] = random.nextInt();
            else
                arr[i] = (int)(Math.random() * 100);
        }

        for (int i : arr)
            System.out.println(i);
    }
}
