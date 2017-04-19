package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by danawacomputer on 2017-04-19.e
 */
public class DateTimeFormattingDemo {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        System.out.println(today+" "+now);

        LocalDateTime todayAndNow = LocalDateTime.now();
        String formatted = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm").format(todayAndNow);
        System.out.println(formatted);
    }
}
