package homework;

public class Main {
    public static void main(String[] args) {

//       change in houses of different storeys.
//Example:
//the house has 19 floors.
////Elevator A and elevator B are working
////elevator A is on the 0 floor
////elevator B is on the 8th floor
////1 at the entrance.
////send elevator A

        int myPosition = 19;
        Lift lift1 = new Lift("lif1", 9, myPosition);
        Lift lift2 = new Lift("lif2", 9, myPosition);
        lift1.choice(lift1, lift2);
    }
}

class Lift {
    private final String name;
    private final int liftPosition;
    private final int myPosition;

    public Lift(String name, int liftPosition, int myPosition) {
        this.name = name;
        this.liftPosition = liftPosition;
        this.myPosition = myPosition;
    }

    public String getName() {
        return name;
    }

    public int getLiftPosition() {
        return liftPosition;
    }

    public int getmyPosition() {
        return myPosition;
    }

    public void choice(Lift lift1, Lift lift2) {
        if (lift1.distance() < lift2.distance()) {
            System.out.println("Its coming Lift one");

        } else if (lift1.distance() > lift2.distance()) {
            System.out.println("Its coming Lift two");

        } else {
            System.out.println("Its coming Lift one and Lift two");
        }
    }

    public int distance() {
        return Math.abs(getmyPosition() - getLiftPosition());
    }
}
