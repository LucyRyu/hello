package goumet;

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
        Goumet yongho = new Goumet("용호낙지","낙지,낙곱새",46);

        List<Goumet> list = new ArrayList<>();
        list.add(spoon);
        list.add(sushiMayJin);
        list.add(flavor);
        list.add(sushiChoi);
        list.add(ironPlate);


        /* 맛집 점수의 평균 구하기 */
        GoumentService scoreTotal = new GoumentService();
        scoreTotal.calcAverageScore(list);
    }
}
