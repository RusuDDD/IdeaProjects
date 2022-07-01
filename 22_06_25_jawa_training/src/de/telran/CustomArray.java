package de.telran;

import java.util.Arrays;
import java.util.Iterator;

public class CustomArray implements Iterable<Account> {
    private Account[] arrayaccount;
    private int capacity = 3;
    private int current = 0;

    public CustomArray(Account[] array) {
        this.arrayaccount = array;
        this.capacity = capacity;
        this.current = current;
    }
    public Account[] add(Account account) {
        Account[] newAr = new Account[arrayaccount.length + 1];
        for (int i = 0; i < arrayaccount.length; i++) {
            newAr[i] = arrayaccount[i];
            newAr[arrayaccount.length] = account;
        }
        return newAr;
    }

    public Account[] remove(Account account) {
        Account[] newAr = new Account[arrayaccount.length-1];
        for (int i = 0, j = 0; i < arrayaccount.length; i++) {
            if (arrayaccount[i] == account) {
                continue;
            }
            if (arrayaccount[i] != (account)) {
                newAr[j++] = arrayaccount[i];
            }
        }
        return newAr;
    }

    @Override
    public Iterator<Account> iterator() {

        return new AccountIterator();
    }

    class AccountIterator implements Iterator<Account> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index<arrayaccount.length;
        }

        @Override
        public Account next() {
            return arrayaccount[index++];
        }

    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "arrayaccount=" + Arrays.toString(arrayaccount) +
                ", capacity=" + capacity +
                ", current=" + current +
                '}';
    }
}