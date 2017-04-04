/**
 * Created by danawacomputer on 2017-04-04.
 */
public class iPadProSale {

    public static void main (String [] args){
        int iPadProCost = 999000;
        int iPadSaleCost = (int)(iPadProCost*0.15);
        int iPadReallCost = iPadProCost-iPadSaleCost;

        System.out.println("iPadPro 원가: 999000원");
        System.out.println("iPadPro 15%할인, 할인금액 "+iPadSaleCost+"원");
        System.out.println("판매금액:"+ iPadReallCost+"원");

    }
}
