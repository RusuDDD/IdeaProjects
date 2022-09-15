import java.time.LocalDate;

public class Person {

    private final String name;
    private final String surName;
    private final Integer birthYear;

    public Person(String name, String surname, Integer birthYear) {
        this.name = name;
        this.surName = surname;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surName;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    private boolean validityDate() {
        LocalDate date = LocalDate.of(2022, 12, 31);
        return date.getYear() - birthYear <= 10;
    }

    public class Passport {
        private final int passNum;
        private final String country;

        public Passport(int passNum, String country) {
            this.passNum = passNum;
            this.country = country;
        }

        @Override
        public String toString() {
            return Person.this.name + " " + Person.this.surName + ", passnum " + passNum + ", country=" + country;
        }

        public boolean validityCheck() {
            LocalDate date = LocalDate.of(2022, 12, 31);
            return date.getYear() - Person.this.birthYear <= 110;
        }
    }
}
