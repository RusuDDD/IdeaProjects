package de.telran.transaction;

import java.util.Collections;
import java.util.List;

public class Account {

    String uuid;
    long balance;
    List<Transaction> transactions;

    public Account(String uuid, long balance, List<Transaction> transactions) {
        this.uuid = uuid;
        this.balance = balance;
        this.transactions = transactions;
    }

    public String getUuid() {
        return uuid;
    }

    public long getBalance() {
        return balance;

    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }

    public void addTransaction(Transaction transaction) {

    }

}

}
