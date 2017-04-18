package datetime;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by danawacomputer on 2017-04-18.
 */
public class IntervalCheck {

    public static void main(String[] args) {
        Instant start = Instant.now();
        someAlgorithm();
        Instant end = Instant.now();

        Duration duration = Duration.between(start,end);
        long millis = duration.toMillis();
        System.out.println(millis);
    }
    public static void someAlgorithm(){

        long acc = 0L;
        for(int i = 0; i<1000000; i++){
            acc += i;
        }
    }
}

