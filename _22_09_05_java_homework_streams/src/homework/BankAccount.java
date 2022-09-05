package homework;

public class BankAccount {
    private Person person;
    private String Iban;
    private double balance;


    public BankAccount(Person person, String iban, double balance) {
        this.person = person;
        Iban = iban;
        this.balance = balance;
    }

    public Person getPerson() {
        return person;
    }

    public String getIban() {
        return Iban;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "person=" + person +
                ", Iban='" + Iban + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String securredIban(String iban) {
        String result = "";
        StringBuilder stars = new StringBuilder();
        stars.append("*".repeat(Math.max(0, iban.length() - 6)));
        result = iban.substring(0, 4) + stars + iban.substring(iban.length() - 2);
        return result;
    }
}

