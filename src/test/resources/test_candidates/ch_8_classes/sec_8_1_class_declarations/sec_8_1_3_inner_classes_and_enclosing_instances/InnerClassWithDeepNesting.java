
class WithDeepNesting {
    public boolean toBe;
    public WithDeepNesting(boolean b) {
        toBe = b;
    }
    class Nested {
        public boolean theQuestion;
        class DeeplyNested {
            public DeeplyNested() {
                theQuestion = toBe || !toBe;
            }
        }
    }
}

public class InnerClassWithDeepNesting {
    public static void main(String[] args) {
        WithDeepNesting wdn = new WithDeepNesting(true);
        WithDeepNesting.Nested wdnn = wdn.new Nested();
        wdnn.theQuestion = false;
        WithDeepNesting.Nested.DeeplyNested wdnndn = wdnn.new DeeplyNested();
        System.out.println(wdnn.theQuestion);
        System.out.println("passed");
    }
}
