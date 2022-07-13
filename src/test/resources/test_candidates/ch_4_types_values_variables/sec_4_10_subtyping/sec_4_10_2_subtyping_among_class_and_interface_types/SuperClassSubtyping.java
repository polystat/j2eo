public class SuperClassSubtyping {
    public static void main(String[] args) {
        new SubClass().check();
        System.out.println("passed");
    }    
}

class SuperClass {}

class SubClass extends SuperClass {
    void check() {
        System.out.println(this instanceof SuperClass);
    }
}