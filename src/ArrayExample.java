/**
 * Created by danawacomputer on 2017-04-05.
 */
public class ArrayExample {
    public static void main(String[] args) {

        //int[] iArr = new int[10];

        int[] iArr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        for (int i = 0; i <= 9; i++) {
            if (iArr[i] % 5 == 0) {
                System.out.println("5의 배수! 빙고!");
            } else
                System.out.printf("%d번째 element: " + iArr[i] + "\n", i);
        }


        System.out.println("******************************");


        for (int e : iArr) {
            if (e % 5 == 0) {
                System.out.println("빙고");
            } else
                System.out.println(e);
        }
        //for문을 이렇게 사용하여도 배열이 출력된다.


        System.out.println("******************************");

        //3,6,9 게임
        int[] iArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        for (int e : iArr2) {
            String converted = String.valueOf(e);
            //ValueOf(): int형 배열을 String형태로 변환하는 메소드

            if (converted.contains("3") || converted.contains("6") || converted.contains("9")) {
                //contains메소드 : 입력한 문자가 있는지 확인하는 메소드
                System.out.println("짝");

            } else
                System.out.println(e);
        }

        System.out.println("******************************");

        int[] iArr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int resultSum = 0;
        int count = 0;
        int average = 0;

        if(iArr3!=null) {
            for (int e2 : iArr3) {
                count++;
                resultSum = resultSum+e2;
            }
            average = resultSum/count;
            System.out.printf("총합: "+resultSum+"\n");
            System.out.printf("개수: "+count+"\n");
            System.out.printf("평균: "+average+"\n");
        }


    }
}
