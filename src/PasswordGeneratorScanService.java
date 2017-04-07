import java.util.Scanner;

public class PasswordGeneratorScanService {

    public String scanWord (){

        //input from keyboard
        Scanner in = new Scanner(System.in);

        System.out.println("단어를 하나 입력하세요: ");
        String targetStr = in.nextLine();

        String outputData = targetStr;

        return outputData;
    }
}
