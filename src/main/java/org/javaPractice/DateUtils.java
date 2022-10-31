package org.javaPractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static void main(String[] args) {
        Date dt = new Date();
        SimpleDateFormat simp = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simps = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String da =simp.format(dt);
        String hrs = simps.format(dt);
        System.out.println("date is in this format "+da);
        System.out.println("date and time is "+hrs);
    }
}
