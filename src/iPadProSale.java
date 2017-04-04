/**
 * Created by danawacomputer on 2017-04-04.
 * Apple Shop에서 iPad Pro 를 15% 할인한다면 얼마인지 계산해 출력 해보세요.
 * iPad Pro 정가 : 999,000원
 */
public class iPadProSale {

    public static void main (String [] args){
        //방법1
        System.out.println("방법1");
        int iPadProCost = 999000;
        int iPadSaleCost = (int)(iPadProCost*0.15);
        int iPadReallCost = iPadProCost-iPadSaleCost;

        System.out.println("iPadPro 원가: 999000원");
        System.out.println("iPadPro 15%할인, 할인금액 "+iPadSaleCost+"원");
        System.out.println("판매금액:"+ iPadReallCost+"원");

        System.out.println();

        //방법2
        System.out.println("방법2");
        int regularPriceiPadPro = 999_000;
        double discountRate = 15.0 / 100;
        //double iPadSaleCost = 15 / 100.0;
        //double 값으로 계산을 원한다면, 위의 두 코드로 계산을 하여도 됨.
        // 정수값에 .(온점)으로 실수로 표기를 하여도 됨.

        int resultPrice = (int)(regularPriceiPadPro*(1-discountRate));
        System.out.println(resultPrice+"원");
    }
}
