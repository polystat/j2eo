
public class LocalClassAccessToOuterMembers {
    public static void main(String[] args) {
        {
            int a = 1;
            class A {
                public void foo() {
                    System.out.println(a);
                }
            }
            new A().foo();
            System.out.println("passed");
        }
    }
}
