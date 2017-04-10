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

        -메소드, 클래스 분리한거. (예제참고)

        -return (책 읽어보기)

        - 메모리가 3구분으로 나누어져있음
         (static,heap,stack)

        - 함수: input 이 일정할 때 output도 일정하다

        - 퓨어펑션 ex) 3을 넣었을 때 결과값이 9가 출력. 여러번 반복하여도 결과값이 동일
        - 객체지향적함수 ex) 여러번 반복했을 때 결과값이 동일하지 않을 때

        //멤버이름 : static멤버, class멤버

        //오버로딩, 오버라이딩
            *오버로딩: 이름이 같지만 변수의 이름, 형태가 다름

                ex)
                public int 변수 (){
                }
                와
                public int 변수 (int a){
                return 0;
                }
                이 오버로딩의 예.

            *오버라이딩: 재정의

        // 생성자를 정의하는 이유
        - 변수를 초기화 하기 위해서
        - 클래스의 구조를 이용하여 객체를 생성하기 위해서

        // default 생성자 : 자동으로 초기화, 정의를 안하여도 사용가능

        // 매개변수 (=parameter, argument)
        부르는 이름이 다를 뿐 같은 의미

        // 지역변수는 반드시 초기화를 해서 사용해야한다 -> why? 쓰레기값이 대입 될 수 있기 때문에
        // 멤버변수는 값을 초기화 하지 않고 사용하여도 문제가 없다.

        // 데이터 타입을 나누는 방식
            1) 멤버변수
                힙 영역에 메모리가 생성되고 처리되고 삭제됨
            2) 지역변수(=임시변수, 스택변수)
                스택 영역에 메모리가 생성되고 처리되고 삭제됨

        // NULL 의 의미
            가르키는 값이 없다는 뜻
*/
