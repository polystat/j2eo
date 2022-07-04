
public class ThreeDimArrayCreation {
    public static void main(String[] args) {
        int[][][] arr3 = new int[][][] {
            { { 1, 2 }, { 3, 4 } },
            { { 5, 6 }, { 7, 8 } },
        };
        System.out.println(arr3.length);
        System.out.println(arr3[0].length);
        System.out.println(arr3[0][0].length);
        System.out.println("passed");
    }
}
