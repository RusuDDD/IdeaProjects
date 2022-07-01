package HomeWork;

public class HomeWorkThree {
    public static void main(String[] args) {
        String firstName = "Rusu";
        String lastName = "Dumitru";
        int age = 34;
        String adress = "Dorfstr.26 ";
        String city = "Fischinge";
        int zipCod = 79592;
        String country = "Deutschland";
        char copyright = '\u00A9';
        char space = ' ';
        String space2 = " ";
        char tab = '\t';
        char newLine = '\n';
        System.out.println(firstName + space + lastName + space + age + space + adress + space + city + space + zipCod + space + country + space + copyright);
        System.out.println(firstName + " " + lastName + " " + age + " " + adress + " " + city + " " + zipCod + " " + country + " " + copyright);
        System.out.println(firstName + tab + lastName + tab + age + tab + adress + tab + city + tab + zipCod + tab + country + tab + copyright);
        System.out.println(firstName + newLine + lastName + newLine + age + newLine + adress + newLine + city + newLine + zipCod + newLine + country + newLine + copyright);
    }
}
