import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class InterestCalculatorOOP {

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
        principal = in.nextInt(); //숫자로 입력받음 - 원금

        System.out.print("기간을 입력하세요: ");
        months = in.nextInt(); //숫자로 입력받음 - 기간


        System.out.print("이율을 입력하세요: ");
        interestRate = in.nextDouble(); //숫자로 입력받음 - 이율


        //Process
        /*
        이자계산공식: 이자 = 원금 * 이율(연이율) * (월/12)
        기간: 연
         */

        // 예금기간이 36개월 이상이면 이윤을 30% 감면
        if ( months >= 36) {

            interestRate = interestRate - 30;
            interest = principal * (interestRate / 100) * (months / 12);
            System.out.println("예금기간이 36개월이상이면 이윤이 30%감소하여 계산됩니다.");
            System.out.println("이율: "+interestRate+"%");
        }
        else
            interest = principal * (interestRate / 100) * (months / 12);
        //Output
        /*
        48개월 후 당신은 0_000_000원을 받을 수 있습니다.
         */
        System.out.println(months + "개월 후 당신은 " + (interest + principal) + "원을 받을 수 있습니다.");
        // (interest + principal) 대신 원금+이익을 나타내는 변수를 선언하여서 대입하여도 상관없음.
        System.out.printf("%d개월 후 당신은 %f원을 받을 수 있습니다.",months,(interest + principal));
        // Formatting String을 사용할 경우 System.out.printf()를 사용하여야만 가능함.

    }


}
