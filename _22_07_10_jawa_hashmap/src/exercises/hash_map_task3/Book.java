package exercises.hash_map_task3;

import java.util.List;

public class Book {

    private String title;
    private int iSBN;
    private List<Author> author;

    public Book(String title, int iSBN, List<Author> author) {
        this.title = title;
        this.iSBN = iSBN;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getiSBN() {
        return iSBN;
    }

    public List<Author> getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", iSBN='" + iSBN + '\'' +
                ", author=" + author +
                '}';
    }
}
