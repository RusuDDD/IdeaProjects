package homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //A Voc{String title, Author author author} sheet is given. Naturally,
        //One Author{firstName, lastName} can be the author of several books.
        //You need to get a list of all authors.

        Author author1 = new Author("Nikalai", "Nikolaevici");
        Author author2 = new Author("Mihail", "Neapolsky");
        Author author3 = new Author("Jack", "Uarabei");

        Book book1 = new Book("The World", author1);
        Book book2 = new Book("The Pice", author1);
        Book book3 = new Book("The Women", author2);
        Book book4 = new Book("The Man", author2);
        Book book5 = new Book("The Animals", author3);
        Book book6 = new Book("The Students", author3);

        ArrayList<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);
        System.out.println(returnAuthors(list));
    }
    public static List<Author> returnAuthors(List<Book> bookList) {
        Set<Author> authorSet = new HashSet<>();
        for (Book book : bookList) {
            authorSet.add(book.getAuthor());
        }
        ArrayList<Author> list1 = new ArrayList<>(authorSet);
        return list1;
    }
}
