import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class ArrayListExampleOOP {
    public static void main(String[] args) {
        String review =
                "오늘의 2번째 포스팅역시 맛집! 주말에 남자친구랑 너무 맛있게 " +
                        "먹고온 구로 초밥뷔페를 추천해드리려고하는데요!! " +
                        "구로 초밥뷔페집의 이름은 스시메이진 이라는 곳이에요^^♥";

        // 1. review 스트링을 리스트로 변환
        for (String e : wordListTrans(review)) {
            System.out.println(e);
        }

        // 2. 리스트를 순회해서 전체 단어의 글자수의 평균을 구한다.
        wordListCount(wordListTrans(review));
    }

    //1번 문제 객체
    public static List<String> wordListTrans(String a){
        String[] splitted = a.split(" ");

        List<String> wordList = Arrays.asList(splitted);
        //새로운 List인 wordList에 split한 splitted 값을 대입한다.

        return wordList;
        // return값으로 List값을 보내줌.
    }

    //2번 문제 객체
    public static void wordListCount(List<String> a){
        int wordTotalCount = 0;
        for (String e : a) {
            wordTotalCount += e.length();
        }
        System.out.println("객체로 변환(2)");
        System.out.printf("글자수 평균은 %d개입니다.\n", wordTotalCount / a.size());
        return ;
        // 객체 내에서 출력하므로 return 값에 특정 값이 안 들어가도 됨.
    }
}
