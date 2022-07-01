package de.telran;

import java.lang.reflect.Array;
import java.util.*;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {
        // 1. Collectors.toList()
        //2. Collectors.toSet()
        //3. Collectors.toMap(Function<T,K>,Function<T,V)

        List<Account> accounts = Arrays.asList(
                new Account("1", 100, AccountState.ACTIVE),
                new Account("2", -1000, AccountState.BLOKED),
                new Account("3", 5, AccountState.REMOVED),
                new Account("4", 10000, AccountState.ACTIVE),
                new Account("5", -100, AccountState.BLOKED)
        );
        Map<String, Long> balanceByUUID (accounts.stream()
                .collect(toMap(Account::getUuid, Account::getBalance)));
        List<Account> accounts2 = accounts.stream()
                .collect(Collectors.toCollection(() -> new ArrayList<>()));


        Map<Boolean, List<Account>> partitionByBalance = accounts.stream()
                .collect(partitioningBy((acc) -> acc.getBalance() > 0));

        System.out.println(partitionByBalance);

        Map<AccountState, List<Account>> groupingByState = accounts.stream()
                .collect(groupingBy(Account::getState,toList()));
        System.out.println(groupingByState);

        System.out.println((accounts.stream().collect(counting))));

        long totalBalance = accounts.stream()
                .collect(summingLong(Account::getBalance));
        Account richestAccount = accounts.stream()
                .collect(maxBy((acc1, acc2) -> Long.compare(acc1.getBalance(), acc2.getBalance())
                        .orElseThrow());

                double averageBalance= accounts.stream())
        .collect(averageBalance(Account::getBalance));
        System.out.println(averageBalance);

        // 8. reducinng(identity, transformer,accumulator)

        long totalBalance2 = accounts.stream()
                .collect(reducing(0L, Account::getBalance, (res, currentBalance) -> res + currentBalance));

        // Downstream collectors
        // nekatorie colectori naprimer groupingBY i partitionBy mogut prinimati colectori v kacestve
        //doolnitelini  parametrov(orgumentov) . nazivaiutsea Downstream

        Map<AccountState, Long> totalBalanceByAccountState = accounts.stream()
                .collect(groupingBy(Account::getState, summingLong(Account::getBalance)));
        System.out.println();

    }
}

class Account {
    String uuid;
    long balance;
    AccountState state;

    public String getUuid() {
        return uuid;
    }

    public long getBalance() {
        return balance;
    }

    public AccountState getState() {
        return state;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Account{" +
                "uuid='" + uuid + '\'' +
                ", balance=" + balance +
                ", state=" + state +
                '}';
    }

    public Account(String uuid, long balance, AccountState state) {
        this.uuid = uuid;
        this.balance = balance;
        this.state = state;


    }

    enum AccountState {
        REMOVED, ACTIVE, BLOKED
    }

}
