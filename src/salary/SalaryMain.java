package salary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.getInteger;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class SalaryMain {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("src\\Salaries.csv");
        BufferedReader br = new BufferedReader(fr);

        List<Salary> list = new ArrayList<>();

        br.readLine();
        //기본 form은 제거
        //두번째 라인부터 읽는다는 의미
        //파일입력 및 출력 방법1

        String line = "";
        while ((line = br.readLine()) != null) {
            String[] splitted = line.split(",");
            //Todo: List<Salary>로 변환
            Salary salary = new Salary(Integer.parseInt(splitted[0]), splitted[1], splitted[2]
                    , splitted[3], Integer.parseInt(splitted[4]));
            list.add(salary);

        }

        SalaryService service = new SalaryService();
        Salary Highresult = service.whoGetTheHighestSalary(list);
        System.out.println("최고연봉: "+Highresult.getSalary());

        service.whoGetTheLowestSalary(list);
        Salary Lowresult = service.whoGetTheLowestSalary(list);
        System.out.println("최저연봉: "+Lowresult.getSalary());

        service.calAverageSalary(list);

        service.calAverageAnAnnualAverage(list);


    }


}
