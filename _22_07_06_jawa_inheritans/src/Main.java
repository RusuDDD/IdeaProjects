public class Main {
    public static void main(String[] args) {

        int[] array = {10, 8, 23};

        int elt = array[1];//8
        array[2] = 239;
        int length = array.length;
        AdvancedDimArray advancedDimArray = new AdvancedDimArray(3);
        advancedDimArray.set(0, 3);
        advancedDimArray.set(1, 8);
        advancedDimArray.set(2, 23);

        int elt2 = advancedDimArray.get(1);
        advancedDimArray.set(2,239);
        int length2=advancedDimArray.size();

        advancedDimArray.append(500);//{10,8,239,500}
        System.out.println(advancedDimArray.get(3));//500

        advancedDimArray.delete(1);//{10,239.500}
        advancedDimArray.insert(2,20);//{10,239,20,500}

        System.out.println(advancedDimArray.contains(269));//true
    }
}
