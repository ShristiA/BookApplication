package com.company;

public class Main {

    public static void main(String[] args) {
        bookclass book = new bookclass();

        book.setBookTitle("imagine");
        book.setDescription("a journey");
        book.setAuthor("Someone");
        String bookTitle = book.getBookTitle();
        String description = book.getDescription();
        String author = book.getAuthor();

//       book.getDisplayText();
        System.out.println(bookTitle);
        System.out.println(description);
        System.out.printf(author);
    }
}
