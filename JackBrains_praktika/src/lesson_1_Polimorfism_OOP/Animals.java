package lesson_1_Polimorfism_OOP;

public class Animals {
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                '}';
    }
    public void run() {

    }

    public void swim() {
    }
}
