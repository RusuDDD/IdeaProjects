package inheritance.employee;

public class OfficeEmployee extends Employee {
 int monthluBonus;

    public OfficeEmployee(int id, String name, String companyName, int basicSalary, int monthluBonus) {
        super(id, name, companyName, basicSalary);
        this.monthluBonus = monthluBonus;
    }
    public int getMonthluBonus() {
        return monthluBonus;
    }

    @Override
    public int getSalary() {
        return basicSalary + monthluBonus;
    }
}
