
interface S {}

class T {}

public class SisInterfaceTisClass {
    public static void main(String[] args) {
        S s = null;
        T t = (T) s;
        System.out.println(t);
        System.out.println("passed");
    }
}
