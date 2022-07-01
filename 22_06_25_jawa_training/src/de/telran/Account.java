package de.telran;

public class Account{

    private String id;
    private Double sum;

    public Account(String id, Double sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", sum=" + sum +
                '}';
    }
}
