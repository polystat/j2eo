
class S1 {
    public void s1() {
        System.out.println("s1.s1()");
    }
}

interface S2 {
    public void s2();
}

class T extends S1 implements S2 {
    public void s1() {
        System.out.println("t.s1()");
    }
    public void s2() {
        System.out.println("t.s2()");
    }
}

public class SisIntersectionType {
    public static <S extends S1 & S2> void test(S s) {
        T t = (T) s;
        t.s1();
        t.s2();
    }

    public static void main(String[] args) {
        T t = new T();
        test(t);
    }
}
