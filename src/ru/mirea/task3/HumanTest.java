package ru.mirea.task3;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();

        human.startMentalActivity("Thinking...");
        human.pickUpItem("Pen");
        human.pickUpItem("Pencil");
        human.run();

        System.out.println(human.toString());
    }
}
