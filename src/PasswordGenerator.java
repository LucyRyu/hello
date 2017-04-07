/**
 * Created by danawacomputer on 2017-04-05.
 * scanner , substring, length, toUpperCase 메소드 이용
 */
public class PasswordGenerator {
    public static void main(String[] agrs) {

        // PasswordGeneratorScanService 클래스를 사용하겠다는 의미로 객체의 공간을 만들기 위하여 공간을 지정해주고
        PasswordGeneratorScanService scanService = new PasswordGeneratorScanService();

        // 리턴받을 데이터를 저장할 변수를 지정하고 PasswordGeneratorScanService 내의 메소드를 사용하기위하여
        // 위에서 지정한 변수에 . 을 찍으면 사용할 수 있는 메소드 list가 출력된다.
        // 지금은 scanWord()의 메소드를 사용하기 위하여 아래와 같은 코드를 이용한다.
        String targetStr = scanService.scanWord();

        String prefix = "$$";
        String postfix = "##";

        PasswordGeneratorService service = new PasswordGeneratorService();
        String resultString = service.codeGenerated(targetStr, prefix, postfix);
        System.out.println(resultString);
    }

}
