package homework_enum;

public enum WeekDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY,

}

class Today {
    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    public void infoDay() {
        switch (weekDays) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println(weekDays + " " + "I go to work");
            case SATURDAY, SUNDAY -> System.out.println(weekDays + " " + "I rest at home");
        }
    }
}
