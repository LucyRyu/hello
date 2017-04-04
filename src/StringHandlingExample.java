/**
 * Created by danawacomputer on 2017-04-04.
 */
public class StringHandlingExample {

    public static void main(String [] args){
        /*
        기본문자 : soongon
        첫 글자(s)를 맨뒤로 보내고
        제일뒤에 "ay"라는 문자를 붙이기

        출력결과: oongonsay

        * substring(startIndex, endIndex);
        * 시퀀스적인 함수(순서가 있어서 시퀀스함수라고 한다).
         */

        String mainString = "soongon";
        String sliceString_main = mainString.substring(1,7);
        //String sliceString_main = mainString.substring(1);
        //끝까지 출력할 예정이라면 시작점만 알려줘도 끝까지 출력해준다.
        //oongon
        String sliceString_last = mainString.substring(0,1);
        //s

        String addString = "ay";
        System.out.println(sliceString_main + sliceString_last + addString);
    }
}
