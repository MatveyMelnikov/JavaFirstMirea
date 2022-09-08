package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Default author", "New book", 1861);

        book.setYearTheBookWasWritten(2077);
        book.setName("rEMASTERed " + book.getName());

        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        System.out.println(book.getYearTheBookWasWritten());
    }
}
