package homeWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //There are several lists of Users{fName, lName, email},
        // You need to write a method that will prepare a list of all emails to be sent out

        User user1 = new User("Maik", "Loren", "maik@gmail.com");
        User user2 = new User("Nick", "Borsh", "borsh@gmail.com");
        User user3 = new User("Paul", "Decaprio", "decaprio@gmail.com");
        User user4 = new User("Kristyna", "Lion", "lion@gmail.com");
        User user5 = new User("Mischel", "Kray", "kray@gmail.com");
        User user6 = new User("Nadin", "Marschel", "marschel@gmail.com");
        User user7 = new User("Bob", "Densel", "densel@gmail.com");
        User user8 = new User("Drey", "Uarabey", "uarabey@gmail.com");
        User user9 = new User("Melany", "Menro", "menro@gmail.com");
        User user10 = new User("Melany", "Menro", "menro@gmail.com");

        List<User> userList1 = new ArrayList<>();
        userList1.add(user1);
        userList1.add(user2);
        userList1.add(user3);

        List<User> userList2 = new ArrayList<>();
        userList2.add(user4);
        userList2.add(user5);
        userList2.add(user6);

        List<User> userList3 = new ArrayList<>();
        userList3.add(user7);
        userList3.add(user8);
        userList3.add(user9);
        userList3.add(user10);

        List<User> splitUsers = new ArrayList<>();
        splitUsers.addAll(userList1);
        splitUsers.addAll(userList2);
        splitUsers.addAll(userList3);

        System.out.println(getAllListEmails(splitUsers));
    }

    public static ArrayList<String> getAllListEmails(List<User> users) {
        Set<String> emailSet = new HashSet<>();
        for (User u : users) {
            emailSet.add(u.getEmail());
        }
        return new ArrayList<>(emailSet);
    }
}
