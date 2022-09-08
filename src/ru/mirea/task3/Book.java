package ru.mirea.task3;

public class Book {
    String author;
    String name;
    int yearTheBookWasWritten;

    Book(String author, String name, int yearTheBookWasWritten) {
        this.author = author;
        this.name = name;
        this.yearTheBookWasWritten = yearTheBookWasWritten;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return author;
    }

    public void setName(String author) {
        this.author = author;
    }

    public int getYearTheBookWasWritten() {
        return yearTheBookWasWritten;
    }

    public void setYearTheBookWasWritten(int yearTheBookWasWritten) {
        this.yearTheBookWasWritten = yearTheBookWasWritten;
    }
}
