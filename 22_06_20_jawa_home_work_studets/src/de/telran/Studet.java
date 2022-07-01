package de.telran;

public class Studet {
    private String firstName;
    private String lastName;
    private int studentCard;
    private  int educationYear;
    private double avgMath;
    private double avgEconomics;
    private double avgForeignLang;

    public Studet(String firstName, String lastName, int studentCard,
                   int educationYear, double avgMath, double avgEconomics, double avgForeignLang) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentCard = studentCard;
        this.educationYear = educationYear;
        this.avgMath = avgMath;
        this.avgEconomics = avgEconomics;
        this.avgForeignLang = avgForeignLang;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentCard() {
        return studentCard;
    }

    public int getEducationYear() {
        return educationYear;
    }

    public double getAvgMath() {
        return avgMath;
    }

    public double getAvgEconomics() {
        return avgEconomics;
    }

    public double getAvgForeignLang() {
        return avgForeignLang;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentCard(int studentCard) {
        this.studentCard = studentCard;
    }

    public void setEducationYear(int educationYear) {
        this.educationYear = educationYear;
    }

    public void setAvgMath(double avgMath) {
        this.avgMath = avgMath;
    }

    public void setAvgEconomics(double avgEconomics) {
        this.avgEconomics = avgEconomics;
    }

    public void setAvgForeignLang(double avgForeignLang) {
        this.avgForeignLang = avgForeignLang;
    }

    @Override
    public String toString() {
        return "Studets{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentCard='" + studentCard + '\'' +
                ", educationYear=" + educationYear +
                ", avgMath=" + avgMath +
                ", avgEconomics=" + avgEconomics +
                ", avgForeignLang=" + avgForeignLang +
                '}';
    }
}
