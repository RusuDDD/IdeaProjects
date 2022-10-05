package homework_enum;

public class Main {
    public static void main(String[] args) {

        Today today = new Today(WeekDays.SATURDAY);
        today.infoDay();
        Today today1 = new Today(WeekDays.MONDAY);
        today1.infoDay();
        Today today2 = new Today(WeekDays.WEDNESDAY);
        today2.infoDay();
        Today today3 = new Today(WeekDays.SUNDAY);
        today3.infoDay();
    }
}
