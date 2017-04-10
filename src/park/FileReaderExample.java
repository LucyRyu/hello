package park;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class FileReaderExample {

    public static void main(String[] args) throws Exception { // 예외를 처리하지 않겠다

        FileReader fr = new FileReader("src\\Parks.csv");

        BufferedReader br = new BufferedReader(fr); // 파일을 좀 더 쉽게 조작 할 수 있음

        List<Park> list = new ArrayList();

        String line = "";

        while ((line = br.readLine()) !=null) {

            String [] splitted = line.split(",");

            Park p11 = new Park(splitted[0],splitted[1], splitted[2], splitted[3], splitted[4], splitted[5]);
            list.add(p11);

            System.out.println();

        }
        int notUsParkNumber = ParkService.choiceOfState(list);
        int haveAliasParkNumber = ParkService.choiceOfAlias(list);
        double avgOfParkNameNumber = ParkService.avgOfParkName(list);

        System.out.printf("US가 아닌 볼 파크 수는 %d개 입니다.\n", notUsParkNumber);
        System.out.printf("별명이 있는 볼 파크 수는 %d개 입니다.\n", haveAliasParkNumber);
        System.out.printf("볼파크 이름의 글자 평균은 %.1f 입니다.\n", avgOfParkNameNumber);


//        while (true){
//            String line = br.readLine(); // 요 아이가 한줄 씩 읽어줌
//            String [] splitted = line.split(",");
//            for(String e : splitted) System.out.println(e);
//
//            if(line == null) break;
//
//        }



    }
}