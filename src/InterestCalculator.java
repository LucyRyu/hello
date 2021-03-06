import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 * 이자계산기
 */
public class InterestCalculator {
    public static void main(String[] args) {

        //Input
        /*
        원금을 입력하세요: 30_000_000
        기간을 입력하세요: 48
        이율을 입력하세요: 35.5
         */
        int principal = 0; //원금
        int months = 0; //기간
        double interestRate = 0; //이율
        double interest = 0; //이자

        Scanner in = new Scanner(System.in);

        System.out.print("원금을 입력하세요: ");
        principal = inputIntData();

        System.out.print("기간을 입력하세요: ");
        months = inputIntData(); //숫자로 입력받음 - 기간

        System.out.print("이율을 입력하세요: ");
        interestRate = inputDoubleData(); //숫자로 입력받음 - 이율

        //Process
        /*
        이자계산공식: 이자 = 원금 * 이율(연이율) * (월/12)
        기간: 연
         */
        interest = calcInterest(principal, months, interestRate);

        //Output
        /*
        48개월 후 당신은 0_000_000원을 받을 수 있습니다.
         */
        System.out.println(months + "개월 후 당신은 " + (interest + principal) + "원을 받을 수 있습니다.");
        // (interest + principal) 대신 원금+이익을 나타내는 변수를 선언하여서 대입하여도 상관없음.
        System.out.printf("%d개월 후 당신은 %f원을 받을 수 있습니다.", months, (interest + principal));
        // Formatting String을 사용할 경우 System.out.printf()를 사용하여야만 가능함.

    }

    public static int inputIntData (){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        return a;
    }

    public static double inputDoubleData (){
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        return a;
    }


    public static double calcInterest(int principal, int months, double interestRate) {
        double interest = 0; //이자
        interest = principal * (interestRate / 100) * (months / 12);

        return interest;
    }
}
