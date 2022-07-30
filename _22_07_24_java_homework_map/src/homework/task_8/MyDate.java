package homework.task_8;

public class MyDate {
    private int day;
    private  int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", moth=" + month +
                ", year=" + year +
                '}';
    }
}