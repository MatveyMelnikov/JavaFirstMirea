package ru.mirea.task3;

import ru.mirea.task2.Shape;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(4.f, 3.f, 5.f);

        float[] originPosition = circle.getOriginPositon();
        System.out.printf("X: %f Y: %f\n", originPosition[0], originPosition[1]);
        System.out.println(circle.getRadius());
    }
}
