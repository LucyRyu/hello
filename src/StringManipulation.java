/**
 * Created by danawacomputer on 2017-04-04.
 * substring 메소드, indexOf 메소드 이용하여서 특정 문자열이 나타나면 잘라서 나타내기
 */
public class StringManipulation {
    public static void main (String[] args){
        String original = "soongon.kim";
        System.out.println(original.substring(0,original.indexOf(".")));
        //특정문자까지만 출력하는 메소드 함수
        //출력결과: soongon
    }
}
