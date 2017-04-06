/**
 * Created by danawacomputer on 2017-04-06.
 *
 */
public class StringArraySample {

    public static void main(String[] args) {
        String[] strArr = {"숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지", "은행골", "메이비", "돌배기집", "구로곱창", "두끼 구로디지털단지점",
                "아비꼬", "마루가메제면", "킹콩부대찌개 구로디지털점", "바른식탁", "말뚝곱창", "보나베띠", "춘자싸롱", "황제해물보쌈", "호우 양꼬치"};


        // 1. 각 element의 글자 수의 평균 구하기
        int charChout = 0;

        for (String e : strArr) {
            charChout += e.length();
        }

        System.out.println((double) charChout / strArr.length);


        // 2. 글자수가 3글자 이하인 element의 배열을 만드세요.
        String[] resultArr = new String[strArr.length];
        int count = 0;

        for (String e : strArr) {
            if (e.length() <= 3) {
                resultArr[count] = e;
                count++;
                //배열 뒷 공간에 null값이 생길 수 있다.(메모리 낭비)
            }
            //count++;
            //여기 count를 위치하면 빈공간이 생긴다.
        }

        for(String e : resultArr){
            if(e!=null) {
                System.out.println(e);
                //null값인 데이터는 제외하고 resultArr를 출력.
            }
        }
    }
}
