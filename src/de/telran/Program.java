package de.telran;

import java.util.Arrays;
import java.util.Iterator;

public class Program {
    public static void main(String[] args) {

        Account acc1 = new Account("A001", 5000.00);
        Account acc2 = new Account("A002", 4300.00);
        Account acc3 = new Account("A003", 6000.00);
        Account acc4 = new Account("A004", 7300.00);

        Account[] ar = new Account[]{acc1, acc2, acc4};
        //    System.out.println(Arrays.toString(accounts));

        CustomArray customArray = new CustomArray(ar);
        System.out.println("Array before manipulation: " + Arrays.toString(ar));
        System.out.println("Array after adding an object: " + Arrays.toString(customArray.add(acc3)));

        System.out.println("Array after removing an object: " + Arrays.toString(customArray.remove(acc2)));

        System.out.println(Arrays.toString(ar));

        Iterator<Account> iterator = Arrays.stream(ar).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Account a:ar) {
            System.out.println(a);

        }


    }

}

