package homework.task_8;

public class Control {
    public  boolean nameCheck(String personname) {

        if ((personname.length() <= 2)) {
            System.out.println("Name should be at least 3 letters!");
        }
        return personname.length() > 2;
    }
    public  boolean checkDate(int day, int month, int year) {
        return isYearCorrect(year) && isMonthCorrect(month) && isDayCorrect(day, month, year);
    }
    public  boolean isDayCorrect(int day, int month, int year) {
        boolean flag;
        if (day >= 1 && day <= getDayPerMonth(month, year)) {
            flag = true;
        } else {
            System.out.println("The day value is wrong");
            flag = false;
        }
        return flag;
    }
    private  int getDayPerMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: return 31;
            case 4:
            case 6:
            case 9:
            case 11: return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default: return 0;
        }
    }
    public  boolean isLeapYear(int year) {
        boolean flag;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            flag = true;
        } else {
            System.out.println("The year is not leap");
            flag = false;
        }
        return flag;
    }
    public  boolean isMonthCorrect(int month) {
        boolean flag;
        if (month >= 1 && month <= 12) {
            flag = true;
        } else {
            System.out.println("The month is wrong");
            flag = false;
        }
        return flag;
    }
    public  boolean isYearCorrect(int year) {
        boolean flag;
        if (year > 1900) {
            flag = true;
        } else {
            System.out.println("The year is wrong");
            flag = false;
        }
        return flag;
    }
}
