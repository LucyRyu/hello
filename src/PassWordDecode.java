import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-04.
 * 패스워드 생성기
 * 단어를 입력받아 (스캐너이용)
 * $$ + 첫글자는 대문자로 변경+ 글자수의제곱수 + ## 로 변경하기
 *
 * 예)
 * 입력:hello
 * 출력: $$Hello25$$
 */
public class PassWordDecode {
    public static void main (String[] args){

        System.out.println("문자를 입력하고 Enter키를 누르세요. (첫글자는 소문자로 입력하세요.)");
        System.out.print("입력:");
        Scanner scan = new Scanner(System.in);
        String inputData = scan.nextLine();

        String groundLiteral1 = "$$"; //앞 입력해야하는 데이터 값
        String groundLiteral2 = "##"; //뒤 입력해야하는 데이터 값
        String firstLiteral = ""; //첫글자를 저장할 데이터 값
        int countLiteral = 0; // 문자카운트한 값을 저장할 변수
        int squareData = 0; // 제곱값을 저장할 변수
        String resultPassWord = ""; // 최종결과

        firstLiteral = inputData.substring(0,1);
        //첫글자 자르기
        firstLiteral = firstLiteral.toUpperCase();
        //첫글자 대문자로 변경

        countLiteral = inputData.length();
        //문자열 카운트

        //문자열 카운트한 값 제곱
        squareData = countLiteral*countLiteral;

        System.out.print("비밀번호 생성:");
        System.out.println(groundLiteral1+ firstLiteral + inputData.substring(1)+squareData+groundLiteral2);

    }
}
