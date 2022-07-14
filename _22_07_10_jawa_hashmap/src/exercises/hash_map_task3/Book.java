package exercises.hash_map_task3;

public class Book {

    String title;
    String iSBN;
    Author author;

    public Book(String title, String iSBN, Author author) {
        this.title = title;
        this.iSBN = iSBN;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getiSBN() {
        return iSBN;
    }

    public Author getAuthor() {
        return author;
    }

}
