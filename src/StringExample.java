/**
 * Created by danawacomputer on 2017-04-04.
 */
public class StringExample {
    public static void main (String [] args){
        String myStr = "hello, World!";
        String myStr2 = "안녕하세요.";

        System.out.println("문자열1: "+myStr);
        System.out.println("문자열2: "+myStr2);
        System.out.println();

        System.out.println("String 합치기: "+myStr+myStr2);
        System.out.println();

        String changeLowerCase = myStr.toLowerCase();
        System.out.println("소문자로변경: " + changeLowerCase);
        //소문자로 변경

        String changeUpperCase = myStr.toUpperCase();
        System.out.println("대문자로변경: " + changeUpperCase);
        //대문자로 변경

        String sliced = myStr.substring(0,5);
        //문자열을 잘라서 입력한 index값까지만 잘라내는 메소드
        System.out.println("문자열 Slice: " + sliced+"\n");

        int myInt = 5;
        System.out.println("String+int: "+myStr+myInt);
        System.out.println();
        //문자열 + 정수형 타입을 해본다면, 결과는?

        boolean b1 = myStr.contains("Wor");
        System.out.println(b1);

        boolean b2 = myStr.contains("abc");
        System.out.println(b2);
        System.out.println();
        //문자열 안에 입력한 문자가 있는지 없는지 확인하는 메소드
        //있으면 True, 없으면 False


        System.out.println("첫글자가 H인가요?: "+myStr.startsWith("H"));
        System.out.println("첫글자가 h인가요?: "+myStr.startsWith("h"));
        System.out.println();
        //첫 글자를 확인하는 메소드
        //바로 출력하거나,
        //변수를 줘서 출력해도 됨.
        boolean r1 = myStr.startsWith("H");
        boolean r2 = myStr.startsWith("h");
        System.out.println("첫글자가 H인가요?: "+r1);
        System.out.println("첫글자가 h인가요?: "+r2);
        System.out.println();
    }
}
