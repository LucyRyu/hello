package salary;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class SalaryService {

    //todo: 최고연봉을 받는 사람의 객체 출력
    public Salary whoGetTheHighestSalary(List<Salary> list) {
        Salary highestSalaryPlayer = new Salary();
        for(Salary e : list){
            if(e.getSalary()>=highestSalaryPlayer.getSalary()){
                highestSalaryPlayer = e;
            }
            else{
                e.setSalary(highestSalaryPlayer.getSalary());
            }
        }
        return highestSalaryPlayer;
    }

    //todo: 최저연봉의 리스트 출력
    public Salary whoGetTheLowestSalary(List<Salary> list) {
        Salary lowestSalaryPlayer = new Salary();
        for(Salary e : list){
            if(e.getSalary()>lowestSalaryPlayer.getSalary()){
                e.setSalary(lowestSalaryPlayer.getSalary());
            }
            else{
                lowestSalaryPlayer.setSalary(e.getSalary());
            }
        }
        return lowestSalaryPlayer;
    }

    //todo: 평균연봉 출력
    public double calAverageSalary(List<Salary> list) {
        Salary Average = new Salary();
        for (Salary s : list){

            Average.setSalary(s.getSalary());System.out.println(Average.getSalary());
        }

        System.out.println(list.size());
        System.out.printf("평균연봉: %1.2f\n", (Average.getSalary() / list.size()));
        return 0;
    }

    //todo: 년도별 평균 연봉 출력
    public double calAverageAnAnnualAverage(List<Salary> list) {
        int year[] = {};
        for(Salary s:list){

        }
        return 0;
    }
}
