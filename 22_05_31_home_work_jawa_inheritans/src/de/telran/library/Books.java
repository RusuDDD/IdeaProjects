package de.telran.library;

public abstract class Books {
    private static int countBooks = 0;

    String nameBook;
    String author;
    int itemNumber;
    int units;
    double price;
    boolean inStock;

    public Books(String nameBook, String author, int itemNumber, int units, double price) {
        this.nameBook = nameBook;
        this.author = author;
        this.itemNumber = itemNumber;
        this.units = units;
        this.price = price;
        this.inStock = true;
        countBooks++;
    }


    public static int getCountBooks() {
        return countBooks;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public int getUnits() {
        return units;
    }

    public double getPrice() {
        return price;
    }

    public boolean getInStock() {
        if (!inStock) ;
        return false;
    }

    public void setPreis(String preis) {
        this.price = price;
    }
}
