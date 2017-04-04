import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-04.
 */
public class CelToFah {
    public static void main (String [] args)
    {
        int CelTemp = 0;
        int FahTemp = 0;

        System.out.println("섭씨를 입력하세요: ");
        Scanner scan = new Scanner(System.in);
        CelTemp = scan.nextInt();


        FahTemp = (int)(CelTemp*1.8) + 32;

        System.out.println("화씨: "+FahTemp+" ℉");

    }
}
