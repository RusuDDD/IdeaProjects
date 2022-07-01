package de.telran;

public class Main {

    public static void main(String[] args) {

        int[] array = {10, 8, 23};

        int elt = array[1];

        array[2] = 239;

        int length = array.length;
        AdvancedIntArray advancedIntArray = new AdvancedIntArray(3);
        advancedIntArray.set(0, 10);
        advancedIntArray.set(1, 8);
        advancedIntArray.set(2, 23);

        int elt2 = advancedIntArray.get(1);
        advancedIntArray.set(2, 239);

        int length2 = advancedIntArray.size();

        advancedIntArray.append(500);
        advancedIntArray.delete(1);

        advancedIntArray.insert(2, 20);

        System.out.println(advancedIntArray.contains(239));//true

    }

}
