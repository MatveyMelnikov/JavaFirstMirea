package ru.mirea.task2;

import java.util.ArrayList;

public class TestDog {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        int arrSize = Integer.parseInt(args[0]);
        for (int i = 0; i < arrSize; i++)
            dogs.add(new Dog("AnyDefaultDogName" + i, (i % 5) + 1));

        for (Dog dog : dogs)
            System.out.println(dog.toString());
    }
}
