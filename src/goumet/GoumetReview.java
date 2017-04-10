package goumet;

import com.sun.org.apache.bcel.internal.generic.FieldGenOrMethodGen;

import java.util.ArrayList;
import java.util.List;

public class GoumetReview {
    public static void main(String[] args) {
        Goumet spoon = new Goumet();
        spoon.setTitle("숟가락반상 마실");
        spoon.setMainMenu("한정식,떡갈비,갈비찜");
        spoon.setScore(111);

        Goumet sushiMayJin = new Goumet();
        sushiMayJin.setTitle("스시메이진");
        sushiMayJin.setMainMenu("스시,스시뷔페");
        sushiMayJin.setScore(70);

        Goumet flavor = new Goumet();
        flavor.setTitle("맛찬들");
        flavor.setMainMenu("삼겹살,한우,목살");
        flavor.setScore(49);

        Goumet sushiChoi = new Goumet();
        sushiChoi.setTitle("최우영스시");
        sushiChoi.setMainMenu("초밥,회전초밥");
        sushiChoi.setScore(49);

        Goumet ironPlate = new Goumet();
        ironPlate.setTitle("철판목장");
        ironPlate.setMainMenu("스테이크,철판,함박스테이크");
        ironPlate.setScore(46);

        //데이터메소드에서 형식을 지정하면 객체를 생성하면서 데이터를 바로 입력할 수 있다.
        Goumet yongho = new Goumet("용호낙지", "낙지,낙곱새", 46);

        List<Goumet> list = new ArrayList<>();
        list.add(spoon);
        list.add(sushiMayJin);
        list.add(flavor);
        list.add(sushiChoi);
        list.add(ironPlate);


        /* 맛집 점수의 평균 구하기 */
        GoumentService scoreTotal = new GoumentService();
        scoreTotal.calcAverageScore(list);

        Goumet g1 = new Goumet("a", "b", 25);
        Goumet g2 = new Goumet("a", "b", 30);

        g1.getScore();
        g2.getScore();
        //같은 방식으로 호출하였으나 결과값이 다르다.
        // 함수를 호출했을 때 출력값이 다르므로. 멤버변수를 사용하므로
        // 퓨어펑션이 아니므로 메소드라고 한다.
        // 입력할 수 있는 데이터가 상황에 따라서 바뀔 수 있는 경우에 메소드라고 정의한다.

        int randomSumResult = 0;
        for(int i=0; i<100; i++) {
            int r = (int) (Math.random() * 6 + 1);
            randomSumResult = r + randomSumResult;
            System.out.printf("%d: %d\n",i+1,r);
        }
        System.out.println("합계: "+randomSumResult);
        System.out.println("평균: "+randomSumResult/100);
    }
}
