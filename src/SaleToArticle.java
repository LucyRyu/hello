import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */

/*
1. 담배종류를 입력하세요 (1: 디스, 2: 말보로)
2. 나이를 입력하세요.
3. 수량을 입력하세요.

디스: 4500
말보로: 5200

19세미만: 20%할인
45세이상: 30%추가
 */

public class SaleToArticle {
    public static void main(String[] args) {

        int smokeKind = 0; //담배종류
        int userAge = 0; //나이
        int count = 0; //수량

        //담배가격
        int somkecost;
        int costThis = 4500;
        int costMarlboro = 5200;

        //총 결제 금액
        int TotalCost = 0;

        System.out.println("1: 디스, 2: 말보로");
        System.out.print("담배 종류를 입력:");

        Scanner scan = new Scanner(System.in);
        smokeKind = scan.nextInt();

        System.out.print("수량 입력:");
        count = scan.nextInt();

        System.out.print("나이 입력:");
        userAge = scan.nextInt();

        if (smokeKind == 1) {

            System.out.println("디스");
            somkecost = costThis;

            if (userAge < 19) {
                somkecost = (int) (costThis * 0.8);
                TotalCost = somkecost * count;
                System.out.println("19세미만 " + TotalCost + "원");
            } else if (userAge >= 45) {
                somkecost = (int) (costThis * 1.3);
                TotalCost = somkecost * count;
                System.out.println("45세이상 " + TotalCost + "원");
            } else {
                TotalCost = somkecost * count;
                System.out.println("총" + TotalCost + "원");
            }

        } else if (smokeKind == 2) {

            System.out.println("말보로");
            somkecost = costMarlboro;

            if (userAge < 19) {
                somkecost = (int) (somkecost * 0.8);
                TotalCost = somkecost * count;
                System.out.println("19세미만 " + TotalCost + "원");
            } else if (userAge >= 45) {
                somkecost = (int) (somkecost * 1.3);
                TotalCost = somkecost * count;
                System.out.println("45세이상" + TotalCost + "원");
            } else {
                TotalCost = somkecost * count;
                System.out.println("총" + TotalCost + "원");
            }
        } else
            System.out.println("1,2외 다른 숫자가 입력되었습니다.");
    }
}