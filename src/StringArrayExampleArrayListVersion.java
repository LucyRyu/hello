import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class StringArrayExampleArrayListVersion {
    public static void main(String[] args) {

        //방법1
        //List <String> goumet = new ArrayList<>();
        // List 생성
        // List <> 제네릭이라는 문법. 컬렉션을 쓸 때 사용한다.
        // String을 element로 가지는 List라는 의미

        // goumet.add("숟가락반상 마실");
        // goumet.add("스시메이진");
        // 이런식으로 List를 추가해도 됨.

        //***********************************

        //방법2
        List<String> goumet = Arrays.asList("숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지", "은행골", "메이비"
                , "돌배기집", "구로곱창", "두끼 구로디지털단지점", "아비꼬", "마루가메제면", "킹콩부대찌개 구로디지털점", "바른식탁", "말뚝곱창",
                "보나베띠", "춘자싸롱", "황제해물보쌈", "호우 양꼬치");
        //한꺼번에 List에 데이터를 입력하는 방식

        List<String> goumetUnderTreeChar = new ArrayList<>();

        for (String e : goumet) {
            if (e.length() <= 3) {
                goumetUnderTreeChar.add(e);
            }
        }

        for(String e : goumetUnderTreeChar)
        {
            System.out.println(e);
        }
        //null이 생기지 않고 List가 생성되므로 null값이 출력되지 않음.

    }
}
