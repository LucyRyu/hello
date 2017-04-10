package oop;

/**
 * Created by danawacomputer on 2017-04-10.
 * Instance 공부
 * 실행파일
 */
public class ClassMemberExampleTest {
    public static void main(String[] args) {

        //클래스를 객체로 생성
        ClassMemberExample cme = new ClassMemberExample();

        //객체 내의 메소드사용
        cme.getaString();

        //static은 클래스를 바로 사용가능하다.
        // 클래스멤버를 바로 이용가능하다. static으로 선언된 변수만.
        // 클래스메소드도 사용이 가능하다.

        /*
        ClassMemberExample.java 내
        public static int CLASS_MEMBER = 5;
        */
        int a = ClassMemberExample.CLASS_MEMBER;
        System.out.println(a);

        /*
        ClassMemberExample.java 내
        public static int getStaticTest() {
            return 15;
        }
         */
        int b = ClassMemberExample.getStaticTest();
        System.out.println(b);
    }
}

/*
        -인스턴스변수 (멤버변수, static이 없음!)
        -클래스변수 (static)

        -static변수는 모든 객체가 공유가능하다. but, 부작용이 많음.
        동시에 사용(공유)이(가) 가능하므로 데이터가 일치하지 않을 경우가 있음.

        -static변수는 오직 상수를 정의할 때만 사용한다.


        -메소드, 클래스 분리한거.

        -return (읽어보기)

        - 메모리가 3구분으로 나누어져있음

        - 함수: input 이 일정할 때 output도 일정하다
        - 퓨어펑션 ex) 3을 넣었을 때 결과값이 9가 출력. 여러번 반복하여도 결과값이 동일
        - 객체지향적함수 ex) 여러번 반복했을 때 결과값이 동일하지 않을 때

*/
