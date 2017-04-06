import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        String review =
                "오늘의 2번째 포스팅역시 맛집! 주말에 남자친구랑 너무 맛있게 " +
                        "먹고온 구로 초밥뷔페를 추천해드리려고하는데요!! " +
                        "구로 초밥뷔페집의 이름은 스시메이진 이라는 곳이에요^^♥";

        // 1. review 스트링을 리스트로 변환
        System.out.println("****************************************1. 코드작성");
        //List<String> items = Arrays.asList(review.split("\\s*,\\s*"));
        String[] output = review.split("\\ ");
        List<String> goumet = Arrays.asList(output);

        for (String e : goumet) {
            System.out.println(e);
        }

        //1-1 [샘플코드] 스트링을 분해해서 스트링의 배열로 만든다.
        System.out.println("****************************************1. [샘플코드]");
        String[] splitted = review.split(" ");

        List<String> wordList = Arrays.asList(splitted);
        //새로운 List인 wordList에 split한 splitted 값을 대입한다.

        for(String e : splitted){
            System.out.println(e);
        }

        /*
        // splitted와 wordList값의 출력값은 동일함
        for(String e : wordList){
            System.out.println(e);
        }
        */


        // 2. 리스트를 순회해서 전체 단어의 글자수의 평균을 구한다.
        System.out.println("****************************************2. 코드작성");
        int count = 0;

        int charCount = 0;

        for (String e : goumet) {
            charCount += e.length();
        }

        System.out.println("글자수 평균: " + (double) charCount / goumet.size());


        // 2. [샘플코드]
        System.out.println("****************************************2. [샘플코드]");
        int wordTotalCount = 0;
        for(String e : wordList){
            wordTotalCount += e.length();
        }
        System.out.printf("글자수 평균은 %d개입니다.\n", wordTotalCount/wordList.size());





        // 3. 단어가 5자이하인 새로운 리스트를 생성한다.
        System.out.println("****************************************3. 코드작성");
        int charCount2 = 0;
        for (String e : goumet) {
            if (e.length() <= 5) {
                List<String> goumet2 = Arrays.asList(goumet.get(charCount2));
                System.out.println(goumet2);
                charCount2++;
            }
        }


        // 3. [샘플코드]
        System.out.println("****************************************3. [샘플코드]");
        List<String> newList = new ArrayList<>();
        for(String e : wordList){
            if(e.length()<=5){
                newList.add(e);
            }
        }

        System.out.println(newList);

    }
}
