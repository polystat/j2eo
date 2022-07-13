 class A {
     protected int state = 0;
 };

 class B extends A {
     public int n(int x) {
         return x + (100 * (100 + (100 - state)));
     }
 };

 public class Test {
     public static void main(String[] args) {
         var b = new B();
         System.out.println(b.n(5));
     }
 }
