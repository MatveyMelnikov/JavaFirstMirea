package ru.mirea.task1;

public class FirstTask {
    public static void main(String[] args)
    {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 110;

        int sum = 0;
        for (int i : arr)
            sum += i;

        System.out.printf("Sum of arr: %d\n", sum);
    }
}
