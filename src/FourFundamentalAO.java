/**
 * Created by danawacomputer on 2017-04-07.
 * 사칙연산 계산
 */
public class FourFundamentalAO {
    public static void main(String[] args) {
        int inputDataA = 0;
        int inputDataB = 0;

        //FourFundamentalAO 클래스 내에서
        //FourFundamentalAO_Sum, FourFundamentalAO_Sub, FourFundamentalAO_Muti, FourFundamentalAO_Div를 쓰겠다고
        //메모리 내 사용하겠다고 선언(알려줌)
        FourFundamentalAO_Sum sumService = new FourFundamentalAO_Sum();
        FourFundamentalAO_Sub subService = new FourFundamentalAO_Sub();
        FourFundamentalAO_Muti mutiService = new FourFundamentalAO_Muti();
        FourFundamentalAO_Div divService = new FourFundamentalAO_Div();

        sumService.sum(inputDataA, inputDataB);
        subService.sub(inputDataA, inputDataB);
        mutiService.muti(inputDataA, inputDataB);
        divService.div(inputDataA, inputDataB);

        //디버깅하여도 출력결과는 없음
        //System.out.println(); 메소드도 이용하지 않았고,
        //메소드의 return 값들을 FourFundamentalAO.java 내 main 메소드 내에서 저장하는 변수를 선언하지 않았으므로

        // 출력하려면 아래코드를 이용하면 됨. 혹은 변수를 지정하여 System.out.println(변수); 로 출력하여도 됨.
        System.out.println(sumService.sum(inputDataA, inputDataB));
        System.out.println(subService.sub(inputDataA, inputDataB));
        System.out.println(mutiService.muti(inputDataA, inputDataB));
        System.out.println(divService.div(inputDataA, inputDataB));
    }
}
