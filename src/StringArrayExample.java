/**
 * Created by danawacomputer on 2017-04-05.
 */

/*
1. element의 글자수의 평균구하기
2. 글자수가 3글자 이하인 element의 배열을 출력
 */

public class StringArrayExample {
    public static void main(String[] args) {
        String[] arr = {"숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지", "은행골", "메이비", "돌배기집", "구로곱창", "두끼 구로디지털단지점",
                "아비꼬", "마루가메제면", "킹콩부대찌개 구로디지털점", "바른식탁", "말뚝곱창", "보나베띠", "춘자싸롱", "황제해물보쌈", "호우 양꼬치"};

        //1. element의 글자수의 평균구하기
        int countWord = 0;
        int sumResult = 0;
        for (int i = 0; i < arr.length; i++) {
            countWord++;
            sumResult = sumResult + arr.length;
        }
        System.out.printf("합: " + sumResult + "\n");
        System.out.printf("갯수: " + countWord + "\n");
        int average = sumResult / countWord;
        System.out.printf("평균: " + average + "\n");


        //2. 글자수가 3글자 이하인 element의 배열을 출력
        for (String e : arr) {
            if (e.length() <= 3) {
                System.out.println(e);
            }
        }


        //2. 글자수가 3글자 이하인 element의 배열을 출력
        //새로운 배열을 만들어서 출력
        String[] arr2 = new String[10];
        String tempString = "";
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() <= 3) {
                count++;
                tempString = arr[i];
                arr2[count] = tempString;
            }
            sumResult = sumResult + arr.length;
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr2[i] != null) {
                System.out.println(arr2[i]);
            }
        }
    }
}
