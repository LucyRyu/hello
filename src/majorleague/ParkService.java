package majorleague;


import javax.tools.Diagnostic;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ParkService {

    // Todo: * 문제2, 국가가 US가 아닌 볼파크 수는?
    public int howManyHaveUSContry(List<KindOfPark> list) {

        int count = 0;
        for(KindOfPark e : list){
            if(e.getCountry()!="US")
                count++;
        }
        System.out.println("국가가 US가 아닌 볼파수 수는?: " + count);
        return 0;
    }


    // Todo:  * 문제3, alias가 있는 볼파크 수는?
    public int howManyHaveAlias(List<KindOfPark> list){
        int count = 0;
        for(KindOfPark e : list){
            if(e.getParkAlias().equals(""))
                count++;
        }
        System.out.println("alias가 있는 볼파크 수는?: "+count);
        return 0;
    }


   // Todo:  * 문제4, 볼파크 이름의 글자수 평균은?
    public int CountStringLength(List<KindOfPark> list){
        int sum = 0;
        for(KindOfPark e : list){
            if(e.getParkAlias().equals(""))
                sum = s;
        }
        System.out.println("볼파크 이름의 글자수의 평균: "+sum/list.size());
    }
}
