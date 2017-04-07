/**
 * Created by danawacomputer on 2017-04-07.
 * PasswordGenerator에서 코드 추출
 */
public class PasswordGeneratorService {

    public String codeGenerated(String targetStr, String prefix, String postfix){

        String combineCode = "";
        int squareLengthOfChar = targetStr.length() * targetStr.length();

        targetStr = targetStr.substring(0, 1).toUpperCase() + targetStr.substring(1);

        if(targetStr.length() >= 7) {
            String passwordGenerated = prefix + targetStr + postfix;
            System.out.println(passwordGenerated);
        }
        else{
            String passwordGenerated = prefix + targetStr + squareLengthOfChar + postfix;
            System.out.println(passwordGenerated);
        }

        return combineCode;
    }

}
