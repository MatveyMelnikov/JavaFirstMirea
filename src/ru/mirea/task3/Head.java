package ru.mirea.task3;

public class Head {
    private String mentalActivity;
    private boolean isEngaged = false;

    public void setMentalActivity(String mentalActivity) {
        this.mentalActivity = mentalActivity;
        isEngaged = true;
    }

    public String getMentalActivity() {
        return mentalActivity;
    }

    public void stopMentalActivity() {
        isEngaged = false;
    }

    public boolean isEngaged() {
        return isEngaged;
    }

    @Override
    public String toString() {
        return "-Head status:\n" +
                "Mental activity: " + mentalActivity + "\n" +
                "isEngaged: " + isEngaged;
    }
}
