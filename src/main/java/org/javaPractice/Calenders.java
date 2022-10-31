package org.javaPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calenders {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String cals =sd.format(cal.getTime());
        System.out.println("current time is "+cals);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
    }
}
