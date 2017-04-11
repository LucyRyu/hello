package park;
import java.util.List;

public class ParkService {

    // Todo: * 문제2, 국가가 US가 아닌 볼파크 수는?
    public static int howManyHaveUSContry(List<KindOfPark> list) {

        int count = 0;
        for (KindOfPark e : list) {
            if (!(e.getCountry().equals("US")))
                count++;
        }
        System.out.println("국가가 US가 아닌 볼파크 수는?: " + count);
        return count;
    }


    // Todo:  * 문제3, alias가 있는 볼파크 수는?
    public static int howManyHaveAlias(List<KindOfPark> list) {
        int count = 0;
        for (KindOfPark e : list) {
            if (!(e.getParkAlias().isEmpty()))
                count++;
        }
        System.out.println("alias가 있는 볼파크 수는?: " + count);
        return count;
    }


    // Todo:  * 문제4, 볼파크 이름의 글자수 평균은?
    public static int CountStringLength(List<KindOfPark> list) {
        int sum = 0;
        for (KindOfPark e : list) {
            sum = sum + e.getParkName().length();
        }
        System.out.println("볼파크 이름의 글자수의 평균: " + sum / list.size());

        return sum / list.size();
    }
}