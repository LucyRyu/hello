/**
 * Created by danawacomputer on 2017-04-06.
 */
public class iPadProSaleOOP {
    public static void main(String[] args) {

        int regularPriceiPadPro = 999_000;
        double discountRate = 15.0 / 100;

        //출력방법1을 이용할때
        saleCost(regularPriceiPadPro, discountRate);
        // saleCost 함수 호출

/*
        //출력방법2를 사용할때 (return을 이용하여서 값을 받을 때) 2-1이나 2-2로 값을 출력받으면 됨.
        //2-1
        //바로 함수를 출력에 이용하여서 출력해도 됨.
        System.out.println(saleCost(regularPriceiPadPro,discountRate));

        //2-2
        //변수로 지정하여서 값을 저장하여서 출력값 출력
        int resultCost = 0;
        System.out.println(resultCost);
*/

    }

    public static int saleCost (int cost, double discountRate){

        int resultPrice = (int)(cost*(1-discountRate));


       //출력방법1
        System.out.println(resultPrice+"원");
        return 0;
        // return 0으로 하면 함수호출이 끝나도 아무런 값을 반환하지 않는다는 뜻임.

/*
        //출력방법2
        return resultPrice;
        // 함수가 종료되면서 resultPrice값을 main함수에 반환하겠다는 뜻.
        // return 0을 쓰려면 System.out.println(resultPrice+"원"); 이 있어야지 디버깅을 해야지 출력이 되고
        // return resultPrice; 만 하면 디버깅해도 아무런 값이 출력되지않음.
        // main함수내에서 리턴받은 값을 System.out.println()을 이용하여서 출력하여야 출력이 됨.
*/


    }
}
