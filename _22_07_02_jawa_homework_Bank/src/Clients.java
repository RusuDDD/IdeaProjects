public abstract class Clients {
    private String name;
    protected Account account;
    public Clients(String name, Account account) {
        this.name = name;
        this.account = account;
    }
    @Override
    public String toString() {
        return "Clients{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
    public  void mailInfo() {
        System.out.println("Mail :" + name + account);
    }

    public void emailInfo() {
        System.out.println("Email :" + name + account);
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}
