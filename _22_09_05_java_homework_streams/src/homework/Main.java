package homework;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//     1   Дан список  BankAccount {Person person, String IBAN, double balance).
//        Используя stream необходимо вывести на экран все аккаунты,
//        баланс которых составляет менее 100.
//  2 Дан список  BankAccount {Person person, String IBAN, double balance),
// Person{String fName, String lName String email)   Используя stream,
// сформировать отсортированный по lName лист строк вида “Lennon J.;IBAN: DE19************43;lennon@gmail.com”
// (т.е. ФИО; замаскированный счет, в котором открыты только первые 2 и последние 2 символа; email)
// для всех клиентов, чей баланс более 100000
        List<BankAccount> bankAccountList = List.of(
                new BankAccount(new Person("Masha", "Grilev", "masha@gmail.com"), "MD64684655556D", 564.54),
                new BankAccount(new Person("Grisha", "Tridof", "tridof@gmail.com"), "DE65468465654", 654654651.56),
                new BankAccount(new Person("Karandash", "Ruchkin", "ruchkin@gmail.com"), "DE66551656565", 1200000.00),
                new BankAccount(new Person("Dorin", "Minion", "minion@gmail.com"), "BL65464654646", 99.541),
                new BankAccount(new Person("Kris", "Bil", "bil@gmail.com"), "MC65445165658461", 50.50));

        bankAccountList.stream()
                .filter(i ->
                        i.getBalance() < 100)
                .forEach(System.out::println);
        System.out.println("----------------------------------");

        List<String> resultList = bankAccountList.stream()
                .filter(i ->
                        i.getBalance() > 100000)
                .sorted(Comparator.comparing(i -> i.getPerson().getLastName()))
                .map(i -> i.getPerson().getLastName() + ", " + i.getPerson().schortName(i.getPerson().getFirstName())
                        + ", " + i.securredIban(i.getIban()) + ", " + i.getPerson().getEmail())
                .collect(Collectors.toList());
        System.out.println(resultList);
    }
}

