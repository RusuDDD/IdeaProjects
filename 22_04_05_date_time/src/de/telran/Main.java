package de.telran;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Solution {
    LocalDate today = LocalDate.now();
//1.
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1987, 2, 28);
        System.out.println(birthday.getDayOfWeek());

        //2.
        System.out.println(getDaysTilNumberNewYear(today));
        //3
        System.out.println(getDaysNumberTilDayOfMonth(today, 1, 1));
        //4

    }

    public int getDaysNumberTilNewYear(LocalDate date) {
        LocalDate endOfYear = date.with(TemporalAdjusters.lastDayOfYear());
        return (int) ChronoUnit.DAYS.between(date, endOfYear);
    }

    public static int getDaysNumberTilDayOfMonth(LocalDate date, int birthdaymonth, int birthdayDayOfMonth) {
        LocalDate birthday = LocalDate.of(date.getYear(), birthdaymonth, birthdayDayOfMonth);
        if (birthday.isAfter(date)) {
            return (int) ChronoUnit.DAYS.between(date, birthday);
        } else {
            LocalDate nextBirthday = birthday.withYear(bi)
        }

    }
}
