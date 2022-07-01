package HomeWork;

public class MomeWorkOne {
    public static void main(String[] args) {
        helloString();
    }

    public static void helloString() {
        String sentence = "London is the Capital of the Great Britan";
        int size = sentence.length();
        System.out.println(size);

        String firstWord = sentence.substring(0, 6);
        System.out.println(firstWord);

        String tittle = sentence.toUpperCase();
        System.out.println(tittle);

        int myFrontNumber = 123456789;
        int trueNumber;
        trueNumber = Integer.parseInt(String.valueOf(myFrontNumber));
        System.out.println(myFrontNumber);
        System.out.println(trueNumber);

        String anotherNumberFromFront = "15 years";
        int age = Integer.parseInt(anotherNumberFromFront);
        System.out.println(age);
    }
}
