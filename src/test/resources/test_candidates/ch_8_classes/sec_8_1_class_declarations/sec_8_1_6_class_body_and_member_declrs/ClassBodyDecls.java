
public class ClassBodyDecls {
    public int a = 10; // int var as memeber

    // method as member
    public int m(int p) {
        return this.a + p;
    }

    // constructor as member
    public ClassBodyDecls(int k) {
        super();
        this.a = k;
    }

    // local class as member
    class Local {
        public int p() {
            return -a;
        }
    }

    public static void main(String[] args) {
        ClassBodyDecls o = new ClassBodyDecls(1);
        Local l = o.new Local();
        System.out.println(o.a);
        System.out.println(o.m(1));
        System.out.println(l.p());
        System.out.println("passed");
    }
}
