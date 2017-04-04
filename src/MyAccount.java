/**
 * Created by danawacomputer on 2017-04-03.
 * PM 3:59
 * 목표: 오늘 사용한 금액 출력하기
 */
public class MyAccount {
    public static void main (String [] args){

        int useMoney_Busfee = 900;
        int useMoney_Taxifee = 4000;
        int useMoney_Lunch = 6000;
        int useMoney_Things = 5500;
        int useMoney_Total = 0;

        useMoney_Total = useMoney_Busfee + useMoney_Taxifee + useMoney_Lunch + useMoney_Things;

        System.out.println("하루지출금액: " + useMoney_Total + "원 입니다.");

    }
}
