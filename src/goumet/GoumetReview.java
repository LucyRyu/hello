package goumet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class GoumetReview {
    public static void main(String[] args) {
        Goumet spoon = new Goumet();
        spoon.title = "숟가락반상 마실";
        spoon.mainMenu = "한정식,떡갈비,갈비찜";
        spoon.score = 111;

        Goumet sushiMayJin  = new Goumet();
        spoon.title = "스시메이진";
        spoon.mainMenu = "스시,스시뷔페";
        spoon.score = 70;

        Goumet flavor = new Goumet();
        spoon.title = "맛찬들";
        spoon.mainMenu = "삼겹살,한우,목살";
        spoon.score = 49;

        Goumet sushiChoi  = new Goumet();
        spoon.title = "최우영스시";
        spoon.mainMenu = "초밥,회전초밥";
        spoon.score = 49;

        Goumet ironPlate = new Goumet();
        spoon.title = "철판목장";
        spoon.mainMenu = "스테이크,철판,함박스테이크";
        spoon.score = 46;

        List<Goumet> list = new ArrayList<>();
        list.add(spoon);
        list.add(sushiMayJin);
        list.add(flavor);
        list.add(sushiChoi);
        list.add(ironPlate);


        /* 맛집 점수의 평균 구하기 */



    }
}
