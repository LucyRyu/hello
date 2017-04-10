package member;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberMain {
    public static void main(String[] args) {

        //Member list1 = new Member("류승아", 25, "010-9377-6928", "loveyou_06@naver.com");
        Member list1 = new Member();
        list1.setName("류승아");
        list1.setAge(25);
        list1.setHpnum("010-9377-6928");
        list1.setEmail("loveyou_06@naver.com");

        Member list2 = new Member("류관리", 25, "010-2478-1378", "sona.ria.sss@gmail.com");
        Member list3 = new Member("이진석", 26, "010-2979-0767", "jins920409@gmail.com");
        Member list4 = new Member("김태준", 27, "010-6256-7334", "kim19911211@gmail.com");
        Member list5 = new Member("이가원", 25, "010-6439-5943", "dlrkdnjs1211@gmail.com");
        Member list6 = new Member("임준성", 20, "010-9972-8210", "wnstjd9972@gmail.com");
        Member list7 = new Member("김세원", 27, "010-4734-6373", "sewon0613@naver.com");
        Member list8 = new Member("이기봉", 26, "010-3009-5732", "lkb573@gmail.com");
        Member list9 = new Member("진하영", 24, "010-3033-3247", "vnfflvdl1@gmail.com");


        List<Member> list = new ArrayList<>();

        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);
        list.add(list6);
        list.add(list7);
        list.add(list8);
        list.add(list9);
        //Arrays.asList(list1, list2, list3, list4, list5, list6, list7, list8, list9);

        MemberService service = new MemberService();
        service.calcAverageAge(list);
        System.out.println();
        service.HowManyMembersWithLastName(list,"김");
        System.out.println();
        service.calcAverageIdChar(list);
        System.out.println();

    }
}
