package homework.issue_3;

public class Students {
    private String firstName;
    private String lastName;
    private Double rate;

    public Students(String firstName, String lastName, Double rate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rate = rate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Students{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rate=" + rate +
                '}';
    }

    public String shortName() {
        return getFirstName().substring(0, 1) + ".";
    }
}
