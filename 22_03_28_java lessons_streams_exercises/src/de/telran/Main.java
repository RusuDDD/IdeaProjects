package de.telran;

import de.telran.department.Department;
import de.telran.transaction.Account;
import de.telran.transaction.Transaction;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

    public boolean isPrime(int p) {
        if (p < 2)
            return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(p))
                .noneMatch(num -> p % num == 0);
    }

    public IntStream combine(IntStream stream1, IntStream stream2) {
        return IntStream.concat(stream1, stream2)
                .filter(x -> x % 3 == 0)
                .filter(x -> x % 5 == 0)
                .sorted()
                .skip(2);
    }

    public long factorial(int num) {
        LongStream.rangeClosed(1, num)
                .reduce(1, (res, current) -> res * current);
    }

    public int sumOdds(int a, int b) {
        return IntStream.rangeClosed(a, b)
                .filter(x -> x % 2 != 0)
                .sum();

    }

    public long sumConceledTransactionsOfPositiveAcounts(List<Account> acounts) {
        return acounts.stream()
                .filter(acount -> acount.getBalance() > 0)
                .flatMap((account) -> account.getTransactions().stream())
                .filter(transaction -> transaction.getState().equals("Cancelled"))
                .mapToLong(Transaction::getSum)
                .sum();

    }

    public int countEmployees(List<Department> departments, long threashold, String departmentPrefix) {
        return (int) departments.stream()
                .filter(departaments -> departaments.getCode().startsWith(departmentPrefix))
                .flatMap(departments)-> departments.get
    }
}
