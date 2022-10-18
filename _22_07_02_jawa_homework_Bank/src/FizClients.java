public class FizClients extends Clients{
    private double minBalance;

    public FizClients(String name, Account account, double minBalance) {
        super(name, account);
        this.minBalance = minBalance;
    }
    public double getMinBalance() {
        return minBalance;
    }
    @Override
    public String toString() {
        return "FizClients{" +
                "minBalance=" + minBalance +
                '}';
    }
    @Override
    public void mailInfo() {
        super.mailInfo();
    }

    public double getBaseProcent() {
        return account.getBaseProcent();
    }

    public String getIban() {
        return account.getIban();
    }

    public Double getBalance() {
        return account.getBalance();
    }

    public double baseProcent() {
        return account.baseProcent();
    }
}
