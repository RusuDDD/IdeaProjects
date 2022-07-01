package de.telran.department;

import java.util.List;

public class Employee {
    String name;
    String Salary;
    List<Department> departments;

    public Employee(String name, String salary) {
        this.name = name;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return Salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }
}
