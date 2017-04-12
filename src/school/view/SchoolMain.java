package school.view;

import school.control.SchoolService;
import school.model.School;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class SchoolMain {

    public static void main(String[] args) throws Exception {

        //csv파일 읽어오기
        FileReader fr = new FileReader("src\\Schools.csv");
        BufferedReader br = new BufferedReader(fr);
        //BufferedReader(fr)을 데코레이션이라고 한다.

        List<School> list = new ArrayList<>();

        br.readLine();
        //기본 form은 제거(메타데이터는 제외시키고 읽기위해서)
        //두번째 라인부터 읽는다는 의미
        //파일입력 및 출력 방법1

        String line = "";
        while ((line = br.readLine()) != null) {

            String[] splitted = line.split(",");
            School school = new School();
            school.setSchoolID(splitted[0]);
            school.setName_full(splitted[1]);
            school.setCity(splitted[2]);
            school.setState(splitted[3]);
            school.setCountry(splitted[4]);

            list.add(school);

            //System.out.println(school);
        }

        SchoolService service = new SchoolService();
        service.getNewList(list);
    }
}
