package homeWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Given a list of User<name, email>, you need to write a method that will
        // determine if there are duplicates in the list.

        User user1 = new User("Vasya", "vasya@gmail.com");
        User user2 = new User("Pushkin", "pushkin@gmail.com");
        User user3 = new User("Moniaker", "moniaker@gmail.com");
        User user4 = new User("Dornel", "dornel@gmail.com");
        User user5 = new User("Dornel", "dornel@gmail.com");
        User user6 = new User("Pushkin", "pushkin@gmail.com");

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
       // userList.add(user5);
       // userList.add(user6);
       // userList.add(user2);
      //  userList.add(user3);
        System.out.println(dublicateNamesFind(userList));
        System.out.println(dublicateFindEmail(userList));
    }
    public static boolean dublicateNamesFind(List<User> users) {
        Set<String> userSet = new HashSet<>();
        for (User user : users) {
            userSet.add(user.getName());
        }
        return userSet.size() < users.size();
    }
    public static boolean dublicateFindEmail(List<User> users) {
        Set<String> userSet = new HashSet<>();
        for (User user : users) {
            userSet.add(user.getEmail());
        }
        return userSet.size() < users.size();
    }
}
