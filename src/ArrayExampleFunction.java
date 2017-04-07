/**
 * Created by danawacomputer on 2017-04-07.
 */
public class ArrayExampleFunction {
    public static void main(String[] args) {
        int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        double result = 0;
        result = calAverage(iArr);

        System.out.println(result);
    }

    public static double calAverage(int[] intArr) {
        int sum = 0;
        if (intArr != null) {
            for (int e : intArr) {
                sum = sum + e;
            }
        }
        return (double) sum / intArr.length;
    }
}
