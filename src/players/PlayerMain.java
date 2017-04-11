package players;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class PlayerMain {
    public static void main(String[] args) throws Exception {

        // 1. data loading from csv
        //FileReader fr = new FileReader("src\\Salaries.csv");
        //BufferedReader br = new BufferedReader(fr);

        BufferedReader br = new BufferedReader(new FileReader("src\\Salaries.csv"));

        br.readLine();
        //첫번째 라인 스킵

        List<Player> players = new ArrayList<>();
        String line = "";
        while ((line = br.readLine()) != null) {
            String[] splitted = line.split(",");
            //Todo: List<Salary>로 변환
            Player player = new Player(Integer.parseInt(splitted[0]), splitted[1], splitted[2]
                    , splitted[3], Integer.parseInt(splitted[4]));
            players.add(player);
        }


        //PlayerService service = new PlayerService();
        //Player player = PlayerService.getHighestSalaryPlayer(players);
        //System.out.println(player.toString());

        //System.out.printf("%s의 연봉은 %d불 입니다.", player.getPlayerId(), player.getSalary());
        //todo: 최대값 구하기

    }
}

