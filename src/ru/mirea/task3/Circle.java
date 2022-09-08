package ru.mirea.task3;

import java.util.Map;

public class Circle {
    private float originPositonX;
    private float originPositonY;
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(float originPositonX, float originPositonY, float radius) {
        this(radius);
        this.originPositonX = originPositonX;
        this.originPositonY = originPositonY;
    }

    public float[] getOriginPositon() {
        return new float[] {originPositonX, originPositonY};
    }

    public void setOriginPosition(float[] position) {
        if (position.length < 2)
            return;
        originPositonX = position[0];
        originPositonY = position[1];
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }
}
