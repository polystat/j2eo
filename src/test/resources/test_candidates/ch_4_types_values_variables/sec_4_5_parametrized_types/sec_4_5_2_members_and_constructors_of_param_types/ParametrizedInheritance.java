public class ParametrizedInheritance {
    public static void main(String[] args) {
        SuperParametrizedInheritance<Integer, Float, String> obj = 
            new SubParametrizedInheritance<Integer, Float, String>(10, .588f, "some line");
        
        System.out.println(obj.mem1);
        System.out.println(obj.mem2);
        System.out.println(obj.mem3);
        System.out.println(((SubParametrizedInheritance)obj).mem1);
        System.out.println(((SubParametrizedInheritance)obj).mem2);
        System.out.println(((SubParametrizedInheritance)obj).mem3);
        System.out.println("passed");
    }    
}

class SuperParametrizedInheritance<A, B, C> {
    public A mem3;
    public B mem1;
    public C mem2;

    public SuperParametrizedInheritance(A m1, B m2, C m3) {
        mem3 = m1;
        mem1 = m2;
        mem2 = m3;
    }
}

class SubParametrizedInheritance<X, Y, Z> extends SuperParametrizedInheritance {
    public X mem1;
    public Y mem2;
    public Z mem3;

    public SubParametrizedInheritance(X m1, Y m2, Z m3) {
        super(m1, m2, m3);

        mem1 = m1;
        mem2 = m2;
        mem3 = m3;
    }
}
