
public class SimpleArrayFinalVar {
    public static void main(String[] args) {
        final int[] array = {1, 2, 3};
        array[0] = 3;
        array[1] = 2;
        array[2] = 1;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("passed");
    }
}
