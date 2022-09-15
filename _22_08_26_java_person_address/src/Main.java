import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
  /*  В программе задан список task1A.Person{ String fName, String lName, String email, String phone, task1A.Address address}.
  task1A.Address{String postcode, String city, String street, String house}
    Реализовать следующие функции:
          -получить список всех ФИО
          -получить список всех e-mail
          -получить список всех телефонов
          -получить список всех адресов в виде строки адреса
  Естественно, все вышеперечисленные функции может и должен реализовать один метод, в который в качестве параметра
  должен приходить список task1A.Person и реализация необходимого способа обработки. Ограничения: не использовать
  стандартные Java интерфейсы, все необходимые классы и интерфейсы описывать и реализовывать самостоятельно. Не использовать stream.  */

        Person p1 = new Person("Misha", "Dribil", "dribil@gmail.com", "+491528489875", new Address("79856", "Malibu", "Zabeinonenado", "10"));
        Person p2 = new Person("Grisha", "Dabil", "Dabil@gmail.com", "+491658745986", new Address("85687", "Frankfurt", "horoshokaknaiti", "22"));
        Person p3 = new Person("Marta", "Dobil", "Dobil@gmail.com", "+491568963256", new Address("45879", "Monchengladbach", "prikovolocinaia", "37"));
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);


        System.out.println("****************");

        Function1 getPersonNamesList = new Function1() {
            @Override
            public List<String> apply(List<Person> list) {
                List<String> namesList = new ArrayList<>();
                for (Person p : list) {
                    namesList.add(p.getfName());
                }
                return namesList;
            }
        };
        System.out.println(task1(personList, getPersonNamesList));

        Function1 getPersonSurnamesList = new Function1() {
            @Override
            public List<String> apply(List<Person> list) {
                List<String> surNamesList = new ArrayList<>();
                for (Person p : list) {
                    surNamesList.add(p.getlName());
                }
                return surNamesList;
            }
        };
        System.out.println(task1(personList, getPersonSurnamesList));

        Function1 getPersonEmailsList = new Function1() {
            @Override
            public List<String> apply(List<Person> list) {
                List<String> emailsList = new ArrayList<>();
                for (Person p : list) {
                    emailsList.add(p.getEmail());
                }
                return emailsList;
            }
        };
        System.out.println(task1(personList, getPersonEmailsList));

        Function1 getPersonPhoneList = new Function1() {
            @Override
            public List<String> apply(List<Person> list) {
                List<String> phonesList = new ArrayList<>();
                for (Person p : list) {
                    phonesList.add(p.getPhone());
                }
                return phonesList;
            }
        };
        System.out.println(task1(personList, getPersonPhoneList));

        Function1 getPersonAddressList = new Function1() {
            @Override
            public List<String> apply(List<Person> list) {
                List<String> addressList = new ArrayList<>();
                for (Person p : list) {
                    addressList.add(String.valueOf(p.getAddress()));
                }
                return addressList;
            }
        };
        System.out.println(task1(personList, getPersonAddressList));

        System.out.println("****************");

        Task1a getAllPersonDataList = new Task1a() {
            @Override
            public List<Person> persons() {
                List<Person> resultList;
                resultList = new ArrayList<>(personList);
                return resultList;
            }
        };
        System.out.println(getAllPersonDataList.persons());

    }

    public static List<String> task1(List<Person> list, Function1 function1) {
        return function1.apply(list);
    }


}

interface Function1 {
    List<String> apply(List<Person> list);
}

interface Task1a {
    List<Person> persons();
}

