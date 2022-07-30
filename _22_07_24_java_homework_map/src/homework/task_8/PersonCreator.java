package homework.task_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonCreator {
    public static Person creatoPerson() {

        Control control = new Control();
        String name;
        int day = 0;
        int month = 0;
        int year = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter person name");
            name = sc.nextLine();
        } while (!control.nameCheck(name));
        do {
            System.out.println("Enter year of birth");
            year = sc.nextInt();
        } while (!control.isYearCorrect(year));
        do {
            System.out.println("Enter month of birth");
            month = sc.nextInt();
        } while (!control.isMonthCorrect(month));
        do {
            System.out.println("Enter day of birth");
            day = sc.nextInt();
        } while (!control.isDayCorrect(day, month, year));
        MyDate birthday = new MyDate(day, month, year);
        return new Person(name, birthday);
    }
}

