public class RefTypeArraySubtyping {
    public static void main(String[] args) {
        Sub[] subs = new Sub[] { new Sub(), new Sub() };
        Super[] supers = subs;
        System.out.println(supers);
        System.out.println("passed");
    }
}

class Super {}

class Sub extends Super {}