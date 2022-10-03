package homework_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Sian Roadster", "Lamborgini", "RC", "2022", "750");
        Car car2 = new Car("320", "BMV", "kombi", "2021", "250");
        Car car3 = new Car("520", "BMV", "Limousine", "2020", "150");
        Car car4 = new Car("523i", "BMV", "Limousine", "2019", "250");
        Car car5 = new Car("720", "BMV", "Limousine", "2018", "250");
        Car car6 = new Car("725", "BMV", "Limousine", "2017", "318");
        Car car7 = new Car("730", "BMV", "Limousine", "2016", "280");
        Car car8 = new Car("740i", "BMV", "Limousine", "2015", "350");
        Car car9 = new Car("750i", "BMV", "Limousine", "2014", "500");
        Car car10 = new Car("735", "BMV", "Limousine", "2013", "280");
        Car car11 = new Car("735", "BMV", "Limousine", "2013", "280");
        Car car12 = new Car("725", "BMV", "Limousine", "2017", "318");

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);

        try (ObjectOutputStream carObjectOutput = new ObjectOutputStream(new FileOutputStream("Car.bin"));
             ObjectInputStream carInput = new ObjectInputStream(new FileInputStream("Car.bin"))) {

            carObjectOutput.writeObject(carList);

            List<Car> carList1 = new ArrayList<>((Collection<? extends Car>) carInput.readObject());
            System.out.println(carList1);
            // is not finished


        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
