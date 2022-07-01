package de.telran;

public class StudentsTest extends Studet {


    Studet studet1 = new Studet("Grisha", "Uarabei", 541, 2, 5.0, 4.0, 3.5);
    Studet studet2 = new Studet("Masha", "Makan", 542, 1, 4.2, 3.8, 3.6);
    Studet studet3 = new Studet("Alena", "Porshe", 543, 3, 3.8, 3.9, 4.4);

    public double gpaStudent(Studet studet) {
        return ((studet.getAvgMath() + studet.getAvgEconomics() + studet.getAvgForeignLang()) / 3);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }


    public void print() {
        System.out.println(super.getFirstName() + " " + super.getLastName() + " " + gpaStudent(studet));
    }

}
