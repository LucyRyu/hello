/**
 * Created by danawacomputer on 2017-04-06.
 */
public class StringArrayExample2 {

    public static void main(String[] args) {
        String[] arr = {"숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지", "은행골", "메이비", "돌배기집", "구로곱창", "두끼 구로디지털단지점",
                "아비꼬", "마루가메제면", "킹콩부대찌개 구로디지털점", "바른식탁", "말뚝곱창", "보나베띠", "춘자싸롱", "황제해물보쌈", "호우 양꼬치"};

        //2. 글자수가 3글자 이하인 element의 배열을 출력
        for (String e : arr) {
            if (e.length() <= 3) {
                System.out.println(e);
            }
        }

        //2. 글자수가 3글자 이하인 element의 배열을 출력
        //새로운 배열을 만들어서 출력

        int arrCount = 0;

        for (String e : arr) {
            if (e.length() <= 3) {
                arrCount++;
            }
        }
        //새로 만들 배열의 개수를 counting

        String[] arr2 = new String[arrCount];
        //새로 만들 배열을 선언, 위에서 arrCount한 개수를 이용하여서 배열크기 지정

        int count = 0;
        //새로운 배열을 counting
        int saveCount = 0;

        for (String e : arr) {

            if (e.length() <= 3) {
                // 이 부분 수정이 필요
                // 새로운 배열과 기존 배열 값의 데이터를 대입시키기
                arr2[count] = arr[saveCount];
                count++;
            }
            saveCount++;
        }

        for (String e : arr2) {
            System.out.println(arr2);
        }
    }
}

