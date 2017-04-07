package member;

import java.util.List;

public class MemberService {

    public double calcAverageAge(List<Member> list) {

        double result = 0;
        List Member = list;

        for (Member memberlist : list) {
            result = result + memberlist.getAge();
        }

        result = result / (Member.size());
        System.out.println("나이 평균: " + result);

        return 0;
    }

    public int HowManyMembersWithLastName(List<Member> list, String name) {
        int count = 0;

        for (Member memberlist : list) {
            String lastName = String.valueOf(memberlist.getName().charAt(0));

            if (lastName.substring(0).equals(name)) {
                count++;
            }
        }

        System.out.println("성이 " + "\"" + name + "\"" + "인 사람의 수는 " + count + "명 입니다.");

        return 0;
    }

    public double calcAverageIdChar(List<Member> list) {
        double result = 0;
        String id = "";
        int idNumber = 0;

        for (Member memberlist : list) {
            id = String.valueOf(memberlist.getEmail().indexOf("@"));
            idNumber = Integer.parseInt(id);
            result = result + idNumber;
            System.out.println(idNumber);
        }
        System.out.println("아이디 길이의 합: " + result);
        System.out.println("사람 수: " + list.size());
        System.out.println("아이디 값의 평균: " + (double)result/list.size());

        result =  result/list.size();
        System.out.printf("아이디 값의 평균: %1.2f",result);

        return result;
    }


}
