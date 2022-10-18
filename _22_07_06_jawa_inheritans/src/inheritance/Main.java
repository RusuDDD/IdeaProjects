package inheritance;

import inheritance.employee.Employee;
import inheritance.employee.HourBasedEmployee;
import inheritance.employee.Manager;
import inheritance.employee.OfficeEmployee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Vasya", "TelRan", 2000);
        Employee officeEmployee = new OfficeEmployee(2, "Petya", "TelRan", 2500, 300);
        Employee manager = new Manager(3, "Stepan", "TelRan", 2000, 2.5);
        Employee hourBasedEmployee = new HourBasedEmployee(4, "tania", "TelRan", 2500, 150);

        System.out.println(employee.getSalary());
        System.out.println(officeEmployee.getSalary());
        System.out.println(manager.getSalary());
        System.out.println(hourBasedEmployee.getSalary());

        Employee[] employees = {employee, officeEmployee, manager, hourBasedEmployee};
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName() + employees[i].getSalary());

        
        }
    }


}
