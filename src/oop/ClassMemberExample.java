package oop;

/**
 * Created by danawacomputer on 2017-04-10.
 * Instance 공부
 */
public class ClassMemberExample {

    //객체를 생성해서 사용하는 멤버 변수들

    //classMember 는 static을 사용한 멤버변수
    //static이 붙으면 자바에서는 이 변수를 상수로 취급한다
    //상수를 표현하는 변수는 네이밍을 all 대문자로 표기한다
    //단어의 구분은 _(언더바)로 한다.
    //static은 잘 사용하지 않는다 내부적으로 사용하다보면 오류가 발생하므로.
    public static int CLASS_MEMBER = 5;

    public static int getStaticTest() {
        return 15;
    }

    private int number;
    private String aString;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }

}
