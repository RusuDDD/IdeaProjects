package de.telran;

import de.telran.animal.Cat;
import de.telran.animal.Dog;
import de.telran.animal.Fisch;

// Violates the second SOLID principle
// S - single responsibility - princip edinii otvetsnosti .Metod doljen reschati odnu zadaciu.Klass doljen opisivati citoto odno
//O - open close . Kod otcrit k rasschereniu , no zakrit k ismineniu.
public class AnimalStore {

    /**
     * The method accept the  type of the wanted animal as a name of the class.
     * @param type the name of the class
     * @return an instance of the class
     */
    public Animal sale(String type) {
        //TODO remake so that  tje method does not violate the second SOLID principle
        if (type.equals("Cat"))
            return new Cat();
        else if (type.equals("Dog"))
            return new Dog();
        else if (type.equals("Fisch"))
            return new Fisch();

        throw new IllegalArgumentException("Threre's no such an animals type");
    }
}
