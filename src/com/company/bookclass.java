package com.company;

public class bookclass {
    private String bookTitle;
    private String author;
    private String description;
    private double price;
    private Integer isInStock;


    //default constructor
    public bookclass() {

    }
        //overloaded  constructors

    public bookclass(String bookTitle,String  author, String  description, String  price,String  isInStock){

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(Integer isInStock) {
        this.isInStock = isInStock;
    }

    public void getDisplayText(){
        System.out.println(author);
        System.out.printf(bookTitle);
        System.out.println(description);
    }
}
