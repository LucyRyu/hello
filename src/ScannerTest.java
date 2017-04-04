import java.util.Scanner;
/**
 * Created by danawacomputer on 2017-04-04.
 */
public class ScannerTest {

    public static void main (String [] args){

        System.out.println("단어를 입력하고 Enter키를 누르시오.");
        System.out.print("입력: ");
        Scanner scan = new Scanner(System.in);
        String inputDate = "";
        inputDate = scan.nextLine();
        //nextLine 프로그램 일시정지하고 사용자가 키보드(입력장치)의 입력을 기다림.
        //사용자가 값을 입력하면 다음 line을 수행함.

        System.out.print("출력: ");
        System.out.println(inputDate);
    }
}
