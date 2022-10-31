package NewPractice.Java;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class  CalendersAndDate {
    public static void main(String[] args) {
        calenderDate();
        dateFunction();
    }

    private static void dateFunction() {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        String todayDate = date.format(DateTimeFormatter.ofPattern("ddMMM"));
        System.out.println(todayDate);
    }

    private static void calenderDate() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String time = sd.format(cal.getTime());
        System.out.println(time);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
