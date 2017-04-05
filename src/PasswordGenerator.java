import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class PasswordGenerator {

    public static void main(String[] agrs) {

        //input from keyborad
        Scanner in = new Scanner(System.in);


        System.out.println("단어를 하나 입력하세요: ");
        String targetStr = in.nextLine();

        String prefix = "$$";
        String postfix = "##";
        int squareLengthOfChar = targetStr.length() * targetStr.length();

        targetStr = targetStr.substring(0, 1).toUpperCase() + targetStr.substring(1);

        String passwordGenerated = prefix + targetStr + squareLengthOfChar + postfix;

        System.out.println(passwordGenerated);

    }
}
