package homework_2;

import java.io.Serializable;

public class Car implements Serializable {
    private String model;
    private String nme;
    private String klass;
    private String year;
    private String horse_Power;

    public Car(String model, String nme, String klass, String year, String horse_Power) {
        this.model = model;
        this.nme = nme;
        this.klass = klass;
        this.year = year;
        this.horse_Power = horse_Power;
    }

    public String getModel() {
        return model;
    }

    public String getNme() {
        return nme;
    }

    public String getKlass() {
        return klass;
    }

    public String getYear() {
        return year;
    }

    public String getHorse_Power() {
        return horse_Power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", nme='" + nme + '\'' +
                ", klass='" + klass + '\'' +
                ", year='" + year + '\'' +
                ", horse_Power='" + horse_Power + '\'' +
                '}';
    }
}
