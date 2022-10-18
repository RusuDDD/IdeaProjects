public class Student {

    private  String name;
    private Double level;

    public Student(String name, Double level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public Double getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(Double level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
