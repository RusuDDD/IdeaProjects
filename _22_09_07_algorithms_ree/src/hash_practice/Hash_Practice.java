package hash_practice;

public class Hash_Practice {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", "Israel");
        Student student2 = new Student("Alex", "Israel");
        Student student3 = new Student("Filip", "Berlin");

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());

    }
}
