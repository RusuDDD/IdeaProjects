package exercises.hash_map_task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

// Предположим, что дан список Book, но в отличие от предыдущей задачи Author – класс {String fName, String lName}
// и книга более сложный объект, у которого есть список авторов, название и ISBN (International Standard Book Number) т.е.
// {String title, List<Author> authors, String ISBN}. Необходимо сформировать map<Author, List<Book>>,
// где ключ - автор, а значение список его книг.
// Естественно, если у книги несколько авторов, то книга должна отразиться в
// списке книг всех авторов данной книги
        Book book1 = new Book("A Hero of Our Time", 11111, List.of(
                new Author("Anton", "Mamantov"),
                new Author("Vadim", "Trotscki"),
                new Author("Rei", "Jonson"),
                new Author("Jack", "Vlisides")));
        Book book2 = new Book("Demons", 22222,
                List.of(
                        new Author("Brain", "Cernigan"),
                        new Author("Denis", "Rikichi")));
        Book book3 = new Book("Demons", 33333,
                List.of(
                        new Author("Robert", "Martin"),
                        new Author("Denis", "Richi")));
        Book book4 = new Book("Clean Arhitectur", 44444,
                List.of(
                        new Author("Robert", "Martin")));
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        System.out.println(books);
        System.out.println(mapBookToAuthor(books));
    }

    public static Map<Author, List<Book>> mapBookToAuthor(List<Book> list) {
        Map<Author, List<Book>> res = new HashMap<>();
        if (list != null && !list.isEmpty()) {
            for (Book book : list) {
                List<Author> authorslist = book.getAuthor();
                if (authorslist != null)
                    for (Author author : authorslist) {
                        List<Book> books = res.getOrDefault(author, new ArrayList<>());
                        books.add(book);
                        res.put(author, books);
                    }
            }
            return res;
        }
    }
}
