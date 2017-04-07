package goumet;

import java.util.List;

public class GoumentService {

    public double calcAverageScore(List<Goumet> list){

        int scoreTotal = 0;

        for (Goumet storeList : list) {
            scoreTotal = scoreTotal + storeList.getScore();
        }

        System.out.println("총 합: " + scoreTotal);
        System.out.println("평균: " + scoreTotal / (list.size()));

        return 0;
    }
}
