package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DayAfterTomorrow implements TemporalAdjuster {
    //todo: 마트휴무일 2,4째주 일요일

    @Override
    public Temporal adjustInto(Temporal input) {
        LocalDate date = LocalDate.from(input);
        LocalDate closeStoreDate2nd = date.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
        LocalDate closeStoreDate4th = date.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.SUNDAY));
        Period pe = Period.between(date, closeStoreDate2nd);

        if (pe.getDays() >= 0) {
            System.out.println(closeStoreDate2nd);
            System.out.println(closeStoreDate4th);
        } else {
            pe = Period.between(date, closeStoreDate4th);
            if (pe.getDays() >= 0) {
                System.out.println(closeStoreDate4th);
            }
            else{
                LocalDate closeStoreDateNextMonth2nd = date.plusMonths(1)
                        .with((TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY)));
                System.out.println(closeStoreDateNextMonth2nd);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        //LocalDate today = LocalDate.now();
        LocalDate today = LocalDate.of(2017, 4, 25);
        LocalDate date = today.with(new DayAfterTomorrow());
    }
}
