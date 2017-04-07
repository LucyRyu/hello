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

        Goumet sushiMayJin = new Goumet();
        sushiMayJin.title = "스시메이진";
        sushiMayJin.mainMenu = "스시,스시뷔페";
        sushiMayJin.score = 70;

        Goumet flavor = new Goumet();
        flavor.title = "맛찬들";
        flavor.mainMenu = "삼겹살,한우,목살";
        flavor.score = 49;

        Goumet sushiChoi = new Goumet();
        sushiChoi.title = "최우영스시";
        sushiChoi.mainMenu = "초밥,회전초밥";
        sushiChoi.score = 49;

        Goumet ironPlate = new Goumet();
        ironPlate.title = "철판목장";
        ironPlate.mainMenu = "스테이크,철판,함박스테이크";
        ironPlate.score = 46;

        List<Goumet> list = new ArrayList<>();
        list.add(spoon);
        list.add(sushiMayJin);
        list.add(flavor);
        list.add(sushiChoi);
        list.add(ironPlate);


        /* 맛집 점수의 평균 구하기 */

        int scoreTotal = 0;

        for (Goumet storeList : list) {
            scoreTotal = scoreTotal + storeList.score;
        }

        System.out.println("총 합: " + scoreTotal);
        System.out.println("평균: " + scoreTotal / (list.size()));

    }
}
