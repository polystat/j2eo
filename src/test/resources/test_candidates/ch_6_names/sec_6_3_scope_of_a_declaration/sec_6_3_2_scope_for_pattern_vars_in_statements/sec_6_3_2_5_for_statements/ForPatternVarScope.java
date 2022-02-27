public class ForPatternVarScope {
    public static void main(String[] args) {
        Object[] objs = new Object[] { 1, 2, 3, 4, "passed" };
        Object obj = 5;
        for (int i = 0; obj instanceof Integer integer; i++) {
            obj = objs[i];
            System.out.println("int: " + integer);
        }
        System.out.println(obj);
    }    
}
