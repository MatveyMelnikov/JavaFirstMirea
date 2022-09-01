package ru.mirea.task1;

public class FifthTask {
    public static void main(String[] args)
    {
        System.out.println(CalculateFactorial(3));
    }

    protected static int CalculateFactorial(int num)
    {
        int result = 1;
        for (int i = 2; i <= num; i++)
            result *= i;

        return result;
    }
}
