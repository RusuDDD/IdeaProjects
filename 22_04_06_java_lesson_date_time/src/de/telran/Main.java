package de.telran;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Main {

    public static void main(String[] args) {
	// pervii vid dat i vrememeni.
        // LocalDate- opisivaet abstraktnuiu datu
        //LocalTime - opisivaet vremea bes priveaski k ceasovomu poeasu
        //LocalDateTime - opisivaiut datu + vremea bes ceasovovo poeasa
        //SystemCurrentTimeMilles() -functia katoraea vozvroscheaet kalicestvo milisecund, proschedschih s 00:00 1 ianuary 1970 v UTC

        //LocalDate
        // kak sozdati obiect s localinii datoi
        LocalDate today= LocalDate.now();
        LocalDate myBirthDay = LocalDate.parse("1987-02-28");
        LocalDate fromMyMD = LocalDate.of(2011, 8, 18);
        System.out.println(fromMyMD);
        System.out.println(today);
        System.out.println(myBirthDay);

        //Mojno scladivati , vicitati vremenie periodi
        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow);
        LocalDate todayNextMonth = today.plusMonths(1);
        System.out.println(todayNextMonth);
        System.out.println(today.plus(37, ChronoUnit.DAYS));

        //Mojna brati razlicinie informatiiu o date , tipa deni nideli i.t.d.

        System.out.println(today.getDayOfWeek());

        //Mojna sravnivati dve dati na bolische ili mensche(isAfter, isBefore)
        System.out.println(today.isBefore(tomorrow));
        //Method with pozvoleaet poluciti inuiu datu na asnove danoi date
        System.out.println(today.with(TemporalAdjusters.firstDayOfMonth()));
//LocalTime
        //sazdati obiect
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        LocalTime lessonStart = LocalTime.of(9, 30);
        System.out.println(lessonStart);

        System.out.println(LocalTime.of(9, 30));
        // scladivati i vicitati periodi vremeniie
        System.out.println(currentTime.plus(1, ChronoUnit.HOURS));
        //razliciniie geters.
        System.out.println(currentTime.getHour());
        //sravnivati isBefore, isAfter

        System.out.println(currentTime.isBefore(lessonStart));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

        //LocalDateTime - sovmescheaet v sebe vse vozmojnosti LocalDate i LocalTime

        LocalDateTime combinedNow = LocalDateTime.of(today, currentTime);
        System.out.println(combinedNow);
        LocalDateTime parsedLocalDateTime = LocalDateTime.parse("1987-02-28T04:00");
        System.out.println(parsedLocalDateTime);

        // ZonedDateTime - obiect nesuschii v sebe informaziiu o date i vremeni priveazanoi k ceasavomu poeasu

        ZonedDateTime nowZonedBerlin = ZonedDateTime.of(combinedNow, ZoneId.of("Europe/Berlin"));
        System.out.println(nowZonedBerlin);
        // citobi uznati o dostupnih ZoneID mojna raspiceatati ZoneID.getAvailableZoneIds()
        System.out.println(ZoneId.getAvailableZoneIds());

        ZonedDateTime nowZonedNewYork = nowZonedBerlin.withZoneSameInstant(ZoneId.of("US/Eastern"));
        System.out.println(nowZonedNewYork);

        ZonedDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.of("US/Eastern"));

        //Period  - klass, opisivaet vremenie periodi dlea raboti s datami
        System.out.println(today.plus(Period.ofDays(15)));
        Period period = Period.between(myBirthDay, today);
        System.out.println(period);
        System.out.println(period.get(ChronoUnit.DAYS));

        //kalocestvo imena dneii mejdu dvumea datami
        System.out.println(ChronoUnit.DAYS.between(myBirthDay, today));
        System.out.println(ChronoUnit.DAYS.between(today, myBirthDay));

        //Duration- klass opisivaiuschii vremeniie periodi dlea raboti sa vremenem
        Duration fromStart = Duration.between(currentTime, lessonStart);
        System.out.println(fromStart);
        System.out.println(fromStart.getSeconds());

        //formatirovanie - dateTimeFormater- klass opisivaiuschii pravila dlea perevoda vremeni i dati
        // v stroku i abratno

        DateTimeFormatter slashFormater = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(slashFormater.format(today));

        //String -> LocalDate
        LocalDate fromSlashFormatter = LocalDate.parse("2022/04/06", slashFormater);
        System.out.println(fromSlashFormatter);

        DateTimeFormatter macFormatter = DateTimeFormatter.ofPattern("EE d MMM");
        System.out.println(macFormatter.format(today));

    }


}
