package majorleague;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 * 문제1, List<Park>로 변환
 * 문제2, 국가가 US가 아닌 볼파크 수는?
 * 문제3, alias가 있는 볼파크 수는?
 * 문제4, 볼파크 이름의 글자수 평균은?
 */
public class FileReaderExample {

    public static void main(String[] args) throws Exception {
        //throws Exception: 예외를 처리하지 않고 프로그램을 실행하겠다는 의미

        FileReader fr = new FileReader("src\\Parks.csv");
        BufferedReader br = new BufferedReader(fr);
        //BufferedReader(fr)을 데코레이션이라고 한다.

        List<KindOfPark> list = new ArrayList();

        //파일입력 및 출력 방법1
        String line = "";
        while ((line = br.readLine()) != null) {
            //line = br.readLine();

            String[] splitted = line.split(",");
            //Todo: * 문제1, List<Park>로 변환
                KindOfPark park = new KindOfPark(splitted[0],splitted[1],splitted[2],splitted[3],splitted[4],splitted[5]);
                list.add(park);
        }

        howManyHaveUSContry(list);
        /*
        //파일입력 및 출력 방법2
        while(true) {
            String line = br.readLine();
            //한 줄씩 읽어서 String으로 리턴
            String[] splitted = line.split(",");
            for(String s : splitted) {
                System.out.println(s);
            }

            if(br.readLine()==null){
                break;
            }
            System.out.println(line);
        }
        */


    }
}
