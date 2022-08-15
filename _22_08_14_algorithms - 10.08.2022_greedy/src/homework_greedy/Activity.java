package homework_greedy;

public class Activity {
    private final String name;
    private final int start;
    private final int end;
    private int value;

    public Activity(String name, int startTime, int endTime) {
        this.name = name;
        this.start = startTime;
        this.end = endTime;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getValue() {
        return value;
    }

    public int setValue(int value) {
        if (((getEnd() + getStart()) / 2) < 13) {
            value = 1;
        } else if ((getEnd() + getStart()) / 2 >= 13) {
            value = 2;
        }
        return value;
    }


    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                ", startTime=" + start +
                ", endTime=" + end +
                ", value=" + setValue(getValue()) +
                '}';
    }
}