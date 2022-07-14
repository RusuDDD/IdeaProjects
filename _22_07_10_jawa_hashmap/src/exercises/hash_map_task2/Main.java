package exercises.hash_map_task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Дан список Book{String author, String title}.
//        Необходимо сформировать map<String, List<String>> ,
//        где ключом будет автор, а значением - список книг данного автора.
        Book book1 = new Book("M. Maron", "A Hero of Our Time");
        Book book2 = new Book("A. Bratish", "Demon");
        Book book3 = new Book("N. Miron", "Angel of Death");
        Book book4 = new Book("Q. Tranminier", "Mongo");
        Book book5 = new Book("S. Baton", "Death of the Poet");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        System.out.println(mappingTitle(bookList));
    }
        public static Map<String, List<String>> mappingTitle(List<Book> list) {
        Map<String, List<String>> result = new HashMap<>();
        if (list != null && !list.isEmpty()) {
            for (Book book : list) {
                List<String> value = result.get(book.getAuthor());
                if (value == null) {
                    value = new ArrayList<>();
                }
                value.add(book.getTitle());
                result.put(book.getAuthor(), value);
            }
        }
//        if (map != null && !map.isEmpty() && map.keySet().containsAll(keys)) {
//            String resValue = "";
//            String resKey = "";
//            for (String key : keys) {
//                resKey += key;
//                resValue += map.get(key);
//            }
//            map.put(resKey, resValue);

        }
    }

class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle(List<Book> bookList) {
        return title;
    }

    @Override
    public String toString() {
        return author + ", " + title + System.lineSeparator();
    }
}
