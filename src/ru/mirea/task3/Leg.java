package ru.mirea.task3;

public class Leg {
    private boolean isEngaged = false;

    public void run() {
        isEngaged = true;
    }

    public void stopRun() {
        isEngaged = false;
    }

    public boolean isEngaged() {
        return isEngaged;
    }

    @Override
    public String toString() {
        return "-Leg status:\n" +
                "isEngaged: " + isEngaged;
    }
}
