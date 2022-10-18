import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    //    Дан список Programmer. У каждого Programmer(String name, String city, List<String> skills)
//есть список технологий (String), которыми он владеет.
//Сформировать лист из всех технологий, которыми владеют сотрудники.
    public static void main(String[] args) {

        List<String> skills = new ArrayList<>();
        skills.add("Frontend");
        skills.add("Backend");
        skills.add("QA");

        List<String> skills2 = new ArrayList<>();
        skills2.add("My SQL");
        skills2.add("No SQL");
        skills2.add("Backend");
        skills2.add("Phyton");

        Programmer programmer1 = new Programmer("Vasea", "Bologna", skills);
        Programmer programmer2 = new Programmer("Grisha", "Milano", skills2);
        Programmer programmer3 = new Programmer("Marya", "Napoli", skills2);

        List<Programmer> programmerList = new ArrayList<>();
        programmerList.add(programmer1);
        programmerList.add(programmer2);
        programmerList.add(programmer3);

        System.out.println(programmerList);
        System.out.println("-------------------");
        System.out.println(getAllSkills(programmerList));
        getAllSkills(programmerList).forEach(s -> System.out.println(s));

    }

    public static List<String> getAllSkills(List<Programmer> programmerList) {
        return programmerList.stream()
                .flatMap(p -> p.getSkills().stream()
                        .distinct()
                        .collect(Collectors.toList());
    }

    public static List<String> getProgrammer(List<Programmer> programmerList) {
        return programmerList.stream()
                .flatMap(p -> p.getSkills().stream()
                        .map(s -> s + ":" + p.name)
                        .sorted())
                .collect(Collectors.toList());
    }


}
