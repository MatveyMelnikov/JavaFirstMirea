package ru.mirea.task3;

public class Hand {
    private String item;
    private boolean isEmpty = true;

    public void pickUpItem(String item) {
        this.item = item;
        isEmpty = false;
    }

    public String getItem() {
        return isEmpty() ? "Empty" : item;
    }

    public void throwItem() {
        isEmpty = true;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public String toString() {
        return "-Hand status:\n" +
                "item: " + getItem() + "\n" +
                "isEmpty: " + isEmpty;
    }
}
