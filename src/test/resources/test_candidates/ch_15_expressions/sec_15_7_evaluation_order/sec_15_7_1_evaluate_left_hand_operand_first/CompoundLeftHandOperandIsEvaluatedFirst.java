
public class CompoundLeftHandOperandIsEvaluatedFirst {
    public static void main(String[] args) {
        int i = 2;
        int j = (i = ((i = 3) + i)) * i;
        System.out.println(j);
        System.out.println("passed");
    }
}
