package inheritance.employee;

public class Employee {
   private int id;
    private String name;
    private String companyName;
    protected int basicSalary;

    public int getSalary() {
        return basicSalary;

    }

    public Employee(int id, String name, String companyName, int basicSalary) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getBasicSalary() {
        return basicSalary;
    }
}
