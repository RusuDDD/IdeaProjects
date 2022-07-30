package homework.task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//2.  	Дан list в котором записаны результаты подбрасывания монетки (true\false соответственно орел\решка)
//        Необходимо вычислить самую длинную последовательность «орлов» .
//    //{true,true,false,true,false,true,true,true,false}->3

        List<Boolean> booleanList = new ArrayList<>();
        booleanList.add(true);
        booleanList.add(true);
        booleanList.add(false);
        booleanList.add(true);
        booleanList.add(false);
        booleanList.add(true);
        booleanList.add(true);
        booleanList.add(true);
        booleanList.add(false);
        System.out.println(cointsChoose(booleanList));
    }
    public static int cointsChoose(List<Boolean> list) {
        int count = 0;
        if (list.isEmpty() && list == null) {
            return -1;
        }
        for (Boolean b : list) {
            if (b == false) {
                count++;
            }
        }
            return count;
        }
    }
