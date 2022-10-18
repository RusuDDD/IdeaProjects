public class VipClients extends Clients {
    private double bonus;

    public VipClients(String name, Account account, double bonus) {
        super(name, account);
        this.bonus = bonus;
    }
    @Override
    public String toString() {
        return "VipClients{" +
                "bonus=" + bonus +
                '}';
    }
    public double getBonus() {
        if (getAccount().balance>=10000);
        return bonus;
    }
    @Override
    public void mailInfo() {
        super.mailInfo();
    }

}
