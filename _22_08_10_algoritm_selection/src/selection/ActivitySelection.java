package selection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {
    public void selectActivity(List<Activity> list) {
        printList(list);
        System.out.println("-------------------");
        list.sort(Comparator.comparingInt(Activity::getEnd));
        printList(list);
        System.out.println("---------------------");

        Activity first = list.get(0);


        List<Activity> res = new ArrayList<>();
        res.add(list.get(0));
        int endTime = first.getEnd();

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getStart() >= endTime) {
                Activity current = list.get(i);
                res.add(current);
                endTime = current.getEnd();

            }
        }
        printList(res);

    }

    private void printList(List<Activity> list) {
        for (Activity a : list) {
            System.out.println(a.getName());

        }

    }
}
