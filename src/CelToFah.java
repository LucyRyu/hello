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



        System.out.println("화씨: "+changeTempCelToFah(CelTemp)+" ℉");
    }

    public static double changeTempCelToFah (int Cel){
        double FahTemp = 0;
        FahTemp = (int)(Cel*1.8) + 32;
        return FahTemp;
    }


}
