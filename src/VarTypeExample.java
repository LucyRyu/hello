/**
 * Created by danawacomputer on 2017-04-04.
 * 목표: 데이터형 익숙해지기
 * 다양한 변수를 사용할 때 데이터타입을 사용해보기
 */
public class VarTypeExample {

    public static void main (String [] args){

        int myInt = 1000000000;
        //int myInt = 1,000,000,000;
        //java ver.7부터 숫자사이 ,가 업데이트됨.

        long myLong = 1000000000000000000L; //값을 long타입으로 하려면 숫자 끝에 L입력.

        double myDouble = 3.14;

        String myString = "하이"; //String은 " "로 입력

        char myChar = 'a';
        //한글자를 입력할 때는 char사용가능 2byte만 이용가능

        Boolean myBool = true;

        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myString);
        System.out.println(myChar);
        System.out.println(myBool);


    }
}
