package school.control;

import school.model.School;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class SchoolService implements ISchoolService {

    public List<School> getNewList(List<School> list) {
        //새로운 리스트 생성
        List<School> newlist = new ArrayList<>();

        System.out.println("6글자 이상면 SchoolID에 ...를 추가하여 출력\n" +
                "6글자 이하일때는 그냥 출력" + "(출력형식: ID...) \n");

        for (School e : list) {
            if ((e.getSchoolID().length()) > 6) {
                e.setSchoolID(e.getSchoolID().substring(0, 6) + "...");
                newlist.add(e);
            } else {
                newlist.add(e);
            }
            System.out.println(e.getSchoolID());
        }

        /*for (School e : list) {
            System.out.println(e);
        }*/

        return null;
    }


}
