
public class SisObjectTisArray {
    public static void main(String[] args) {
        Object s = new int[1];
        int[] t = (int[]) s;
        System.out.println(t.length);
        System.out.println("passed");
    }
}
