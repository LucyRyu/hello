package hallOfFame;

/**
 * Created by danawacomputer on 2017-04-11.
 */

import hallOfFame.model.HallOfFame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class HallOfFameMain {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("src\\HallOfFame.csv"));
        br.readLine();

        List<HallOfFame> halls = new ArrayList<>();
        String line = "";
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] splitted = line.split(",");

            HallOfFame fame = new HallOfFame();
            fame.setPlayerId(splitted[0]);
            fame.setBallots(NullUtil.parseInt(splitted[3]));
            fame.setVotes(NullUtil.parseInt(splitted[4]));
            fame.setNeeded(NullUtil.parseInt(splitted[5]));



           /* //csv파일에 공백이 있으므로 조건을 주어서 해결해야함.
            if (splitted[3].equals("")) {
                fame.setBallots(0);
            } else {
                fame.setBallots(Integer.parseInt(splitted[3]));
            }

            if (splitted[4].equals("")) {
                fame.setNeeded(0);
            } else {
                fame.setNeeded(Integer.parseInt(splitted[4]));
            }

            if (splitted[5].equals("")) {
                fame.setVotes(0);
            } else {
                fame.setVotes(Integer.parseInt(splitted[5]));
            }*/

            //HallOfFame hall = new HallOfFame(splitted[0], Integer.parseInt(splitted[3]), Integer.parseInt(splitted[4]), Integer.parseInt(splitted[5]));
            halls.add(fame);

        }

        List<PlayerAverage> newList = new ArrayList<>();
        for (HallOfFame e : halls) {

            PlayerAverage pa = new PlayerAverage();

            pa.setPlayerId(e.getPlayerId());
            pa.setAverage(
                    (e.getBallots() + e.getNeeded() + e.getVotes()) / 3);
            newList.add(pa);

            for (PlayerAverage g : newList) {
                //System.out.println(newList.getPlayerId());
                //System.out.println(g.getAverage());
            }
        }
        System.out.println(newList.size());

        /*for(HallOfFame e:halls){
            System.out.println(e.getPlayerId());
            System.out.println("평균: "+(e.getBallots()+e.getNeeded()+e.getVotes())/3);
            System.out.println(e.getBallots());
            System.out.println(e.getNeeded());
            System.out.println(e.getVotes());
        }*/

    }
}