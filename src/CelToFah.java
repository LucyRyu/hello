import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-04.
 * 섭씨 -> 화씨를 계산해보세요.
 * (섭씨 X 1.8) + 32= 화씨
 */
public class CelToFah {
    public static void main (String [] args)
    {
        int CelTemp = 0;

        System.out.println("섭씨를 입력하세요: ");
        Scanner scan = new Scanner(System.in);
        CelTemp = scan.nextInt();

        // main 함수 내에서 새로운 객체를 생성하여서 호출하여 출력한다
        changeTempCelToFahService service = new changeTempCelToFahService();
        double result = service.changeTempCelToFah(CelTemp);
        System.out.println(result);
    }
}
