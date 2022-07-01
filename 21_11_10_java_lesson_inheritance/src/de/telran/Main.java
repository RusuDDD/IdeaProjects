package de.telran;

import de.telran.employee.Employee;
import de.telran.employee.HoursBasedEmployee;
import de.telran.employee.Manager;
import de.telran.employee.OfficeEmployee;

public class Main {
    // Nasledovanie klassa= ato sposobnosti odnogo klassa nasledavati (rosshireati/extend)functionalinasti drugogo klassa
    public static void main(String[] args) {

        Employee employeeVaseya = new Employee(1, "Vasin", "Tel-Ran", 2000);
        Employee officeemployeePetya = new OfficeEmployee(1, "Petya", "Tel-Ran", 2500, 350);
        Employee managerStepan = new Manager(3, "Stepan Stepanovici", "Tel-Ran", 2000, 2.5);
        Employee hourTania = new HoursBasedEmployee(4, "Tatiana", "tel-Ran", 2500, 150);

        System.out.println(employeeVaseya.getSalary());
        System.out.println(officeemployeePetya.getSalary());
        System.out.println(managerStepan.getSalary());
        System.out.println(hourTania.getSalary());

        Employee[] employees = {employeeVaseya, officeemployeePetya, managerStepan, hourTania};

        for (int i = 0; i < employees.length; i++) {
            System.out.println("The employee" + " " + employees[i].getName()+" " + "has salary" + " " + employees[i].getSalary());
        }
    }
}
