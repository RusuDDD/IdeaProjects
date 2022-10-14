package homework;

import java.util.List;

public class PersonWithBankAccounts {
    String name;
    List<String> ibanns;

    public PersonWithBankAccounts(String name, List<String> ibanns) {
        this.name = name;
        this.ibanns = ibanns;
    }

    public String getName() {
        return name;
    }

    public List<String> getIbanns() {
        return ibanns;
    }

    @Override
    public String toString() {
        return "PersonWithBankAccounts{" +
                "name='" + name + '\'' +
                ", ibanns=" + ibanns +
                '}';
    }
}
