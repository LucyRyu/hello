import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-04.
 * 화씨 -> 섭씨를 계산해보세요.
 * (화씨 - 32) / 1.8 = 섭씨
 */
public class FahToCel {
    public static void main (String [] args)
    {
        int FahTemp = 0;
        double CelTemp = 0;

        System.out.println("화씨를 입력하세요: ");
        Scanner scan = new Scanner(System.in);
        FahTemp = scan.nextInt();

        CelTemp = ((FahTemp-32) / 1.8);

        System.out.println("섭씨: "+CelTemp+" ℃");

    }
}
