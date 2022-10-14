package homework;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
         /*Даны следующие классы: Person {String name;}, BankAccountWithOwner{Person owner;String ibann;}
    и данс писок банковских счетов List<BankAccountWithOwner> accounts. Написать функцию,
    которая вернет List<PersonWithBankAccounts> persons (PersonWithBankAccount{String name;
        List<String> ibanns;}) такой, что к каждому человеку прилагается список ibanns его банковских счетов.*/

            Person person1 = new Person("Grisha");
            Person person2 = new Person("Nora");
            Person person3 = new Person("Stradivary");
            BankAccountWithOwner cd1a = new BankAccountWithOwner(person1, "656635156546");
            BankAccountWithOwner cd1b = new BankAccountWithOwner(person1, "5156468464688");
            BankAccountWithOwner cd2a = new BankAccountWithOwner(person2, "4966684656546");
            BankAccountWithOwner cd2b = new BankAccountWithOwner(person2, "6588445666565");
            BankAccountWithOwner cd3a = new BankAccountWithOwner(person3, "6846846516646");
            BankAccountWithOwner cd3b = new BankAccountWithOwner(person3, "68464655646565");

            List<BankAccountWithOwner> accOwners = List.of(cd1a, cd1b, cd2a, cd2b, cd3a, cd3b);
            System.out.println(issue_1(accOwners));
        }

        public static List<PersonWithBankAccounts> issue_1 (List < BankAccountWithOwner > accOwners) {
            return accOwners.stream()
                    .collect(Collectors.groupingBy(acc -> acc.getOwner().getName(),
                            Collectors.mapping(BankAccountWithOwner::getIban, Collectors.toList())))
                    .entrySet().stream()
                    .map(p -> new PersonWithBankAccounts(p.getKey(), p.getValue()))
                    .collect(Collectors.toList());
        }
    }

