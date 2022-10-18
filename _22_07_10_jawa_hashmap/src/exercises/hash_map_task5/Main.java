package exercises.hash_map_task5;

import exercises.hash_map_task3.Author;
import exercises.hash_map_task4.Book;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
//         5)      Дан map<Author, List<Book>> (например, сформированный в задаче №3).
//         Но в него вкрались ошибки, в список книг некоторых авторов попали книги, которые они не писали.
//          Необходимо:
//a)      написать метод, который проверит, есть ли в map такие ошибки.
//b)      написать метод, который исправит ошибки в исходном map.
    }
    public static void currentAuthorMap(Map<Author>, List<Book> map) {
        Set<Book> errorBooks = errorBookFindAndRemove(map);
    }
    private static Set<Book> errorBookFindAndRemove(Map<Author ,List<Book> map) {
        Set<Book>res=new HashSet<>()
        for (Map.Entry<Author,List<Book>> e : map.entrySet()) {
            List<Book> books = e.getValue();
            for (Book book : books) {
                if (!isAuthor(book, e.getKey())) {
                    res.add(book);
                    books.remove(book);
                }
            }
        }
        return res;
    }
    private static boolean isAuthor(Book book, Author key) {
        for (Author a : book.getAuthor()) {
            if (!a.equals(author)) return false;
        }
    }
}
