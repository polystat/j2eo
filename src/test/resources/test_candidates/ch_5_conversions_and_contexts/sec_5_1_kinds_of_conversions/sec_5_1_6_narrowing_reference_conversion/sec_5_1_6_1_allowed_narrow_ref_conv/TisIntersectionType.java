
interface S {
    public void s();
}

interface T1 extends S {
    public void t1();
}

interface T2 extends S {
    public void t2();
}

class T implements T1, T2 {
    public void s() {
        System.out.println("s.s()");
    }
    public void t1() {
        System.out.println("t.t1()");
    }
    public void t2() {
        System.out.println("t.t2()");
    }
}

public class TisIntersectionType {
    public static <O extends T1 & T2> void foo(S s) {
        O o = (O) s;
        o.s();
        o.t1();
        o.t2();
    }

    public static void main (String[] args) {
        foo(new T());
    }
}
