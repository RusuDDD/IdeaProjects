public class Account {
    private final String iban;
    protected Double balance;
    protected double baseProcent;

    public Account(String iban, Double balance, double baseProcent) {
        this.iban = iban;
        this.balance = balance;
        this.baseProcent = baseProcent;
    }
    public double getBaseProcent() {
        return baseProcent;
    }
    public String getIban() {
        return iban;
    }
    @Override
    public String toString() {
        return "Clients{" +
                "iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }
    public Double getBalance() {
        return balance;
    }
    public double baseProcent() {
        return (balance * baseProcent) / 100;
    }
}
