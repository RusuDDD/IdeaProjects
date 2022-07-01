package de.telran;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
	//creat an object of a class by the its name
        String type = "de.telran.animal.Cat";

        // Method forName ("de.telran.animal.Fisch") returns the object Fisch.class
        Class clasFromString = Class.forName(type);
        Animal animal =(Animal) clasFromString.getConstructor().newInstance();

        System.out.println(animal.sound());
    }
}
