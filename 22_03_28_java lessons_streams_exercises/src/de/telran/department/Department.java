package de.telran.department;

import java.util.List;

public class Department {
    String name;
    String code;
    List<Employee> employees;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

