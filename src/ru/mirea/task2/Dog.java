package ru.mirea.task2;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHumanAge() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "This is " + this.getClass().getSimpleName() + ":\n" +
                    "Name: " + name + '\n' +
                    "Age: " + age + '\n' +
                    "Human age: " + getHumanAge();
    }
}
