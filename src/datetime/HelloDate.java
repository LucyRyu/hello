package datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Created by danawacomputer on 2017-04-18.
 */
public class HelloDate {
    public static void main(String[] args) {
        long current = System.currentTimeMillis();
        System.out.println(current);


        LocalDate date = LocalDate.of(2017, 4, 3);
        //LocalTime time = LocalTime.of(23,59,59);

        //LocalDate anniversaryDate = date.plus(1, ChronoUnit.DAYS);
        LocalDate anniversaryDate = date;

        System.out.println("1일째: "+anniversaryDate);

        anniversaryDate = date.plus(49,ChronoUnit.DAYS);
        System.out.println("50일째 "+anniversaryDate);

        anniversaryDate = date.plus(99,ChronoUnit.DAYS);
        System.out.println("100일째 "+anniversaryDate);

        anniversaryDate = date.plus(149, ChronoUnit.DAYS);
        System.out.println("150일째 " + anniversaryDate);

        anniversaryDate = date.plus(199, ChronoUnit.DAYS);
        System.out.println("200일째 " + anniversaryDate);

        anniversaryDate.toEpochDay();

        anniversaryDate = date.plusDays(49).minusYears(3).plusMonths(3);
        System.out.println(anniversaryDate);

        LocalDate fifty = date.plusDays(49);
        LocalDate oneHundred = date.plusDays(99);
        if(fifty.compareTo(oneHundred)>0){
            System.out.println("fifty가 더 커요");
        }
        else {
            System.out.println("oneHundred가 더 커요");
        }

        if(fifty.isAfter(oneHundred)){
            System.out.println("50일이 100일의 과거입니다.");
        }
        else{
            System.out.println("100일이 50일의 미래입니다.");
        }

        LocalDate impeachmentDay = LocalDate.of(2017,3,10);
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(impeachmentDay);

        Period pe = Period.between(impeachmentDay,today); // 1달 8일 [0년, 1달, 8일]
        System.out.println("**");
        System.out.println((pe.get(ChronoUnit.MONTHS))+"달"+(pe.get(ChronoUnit.DAYS))+"일");
        System.out.println(pe);
        System.out.println(pe.getMonths()+"달");
        System.out.println(pe.getDays()+"일");






    }
}
