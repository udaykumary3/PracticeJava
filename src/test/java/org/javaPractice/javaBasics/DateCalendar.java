package org.javaPractice.javaBasics;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateCalendar {
    public static void main(String[] args) {
        Date dt = new Date();
        System.out.println(dt);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = sdf.format(dt);
        System.out.println(currentDate);
        localDate();
        calendarDate();
    }

    public static void localDate(){
        LocalDate currentDate = LocalDate.now();
        LocalDate tomorrow = currentDate.plusDays(1);

        System.out.println("tomorrow date is "+tomorrow);
        String seventhDay = currentDate.plusDays(7).format(DateTimeFormatter.ofPattern("ddMMM"));
//        String seven = seventhDay.format(DateTimeFormatter.ofPattern("ddMMM"));
        System.out.println(seventhDay);
    }

    public static void calendarDate(){
        Calendar cd = Calendar.getInstance();
        Date dates = cd.getTime();
        System.out.println(dates);
    }
}
