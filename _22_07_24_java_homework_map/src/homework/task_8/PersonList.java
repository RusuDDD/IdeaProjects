package homework.task_8;

import java.util.*;

public class PersonList extends PersonCreator {


    public static List<Person> createSomeOne() {
        List<Person> personList = new ArrayList<>();
        while (true) {
            System.out.println("Enter yes to continue of finish to exit");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            if (choose.equalsIgnoreCase("finish")) {
                sc.close();
                break;
            } else {
                if (choose.equalsIgnoreCase("Yes")) {
                    personList.add(PersonCreator.creatoPerson());
                }
            }
        }
        return personList;
    }
    public static void printList(List < Person > personList) {
        Collections.sort(personList);
            for (Person p : personList) {
                System.out.println("Name: " + p.getName() + "birthday" + p.getBirthday());
                System.out.println();
            }
        }
    }
