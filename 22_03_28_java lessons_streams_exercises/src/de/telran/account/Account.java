package de.telran.account;

public class Account {
    String uuid;
    long sum;
    boolean isLockesd;

    public Account(String uuid, long sum, boolean isLockesd) {
        this.uuid = uuid;
        this.sum = sum;
        this.isLockesd = isLockesd;
    }

    public String getUuid() {
        return uuid;
    }

    public long getSum() {
        return sum;
    }

    public boolean isLockesd() {
        return isLockesd;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public void setLockesd(boolean lockesd) {
        isLockesd = lockesd;
    }
}
