package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by danawacomputer on 2017-04-18.
 */
public class TemporalAdjustersEx {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextMon = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(nextMon);

        LocalDate nextWen = today.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(nextWen);

    }

}
