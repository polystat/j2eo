
public class SimpleLeftHandOperandIsEvaluatedFirst {
    public static void main(String[] args) {
        int i = 2;
        int j = (i=3) * i;
        System.out.println(j);
        System.out.println("passed");
    }
}
