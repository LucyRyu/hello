package players;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class PlayerService {

    //todo: 최대연봉
    public static Player getHighestSalaryPlayer(List<Player> list){
        Player highestSalaryPlayer = new Player();
        for(Player e : list){
            if(e.getSalary()>highestSalaryPlayer.getSalary()){
                highestSalaryPlayer = e;
            }
            else{
                e.setSalary(highestSalaryPlayer.getSalary());
            }
        }
        //System.out.println(list);
        return null;
    }

    //todo: 최저연봉
    public Player getLowestSalaryPlayer (List<Player> list){
        return null;
    }

    //todo: 평균연봉
    public double getAllPlayersAveragerSalary (List<Player> list){
        return 0.0;
    }

    //todo: 년당 평균연봉


}
