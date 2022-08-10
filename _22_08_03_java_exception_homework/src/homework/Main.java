package homework;

public class Main {
    public static void main(String[] args) {
        //First level: У вас в программе создается User (User {String firstName, String lastName, int age,email}).
        // При этом, в конструктор приходит строка вида “John;Lennon;40;lennon@mail.com” Система должна либо
        // создавать объект, либо формировать Exception. При этом, должна быть возможность получить все ошибки,
        // которые привели к не созданию объекта.
        //Например: Некорректный формат строки. В строке не хватает данных;
        //Поле не задано (пустое);
        //email имеет неправильный формат: короче 4 символов или не содержит символ @ ;
        //Поле возраст некорректно;
        //В строке больше полей, чем необходимо;
        try {
            User user = new User("John;Lennon;40;lennon@mail.com");
            //User user = new User(";Lennon;-40;lennonmail.com");
            //User user = new User("John;Lennon;lennonmail.com");
            System.out.println(user);
        } catch (UserCreateException e){
            System.err.println("User Create Exception");
            e.printErrorsList();
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("Опс.....что то пошлло не так!");
            //e.printStackTrace();

        }
    }
}
