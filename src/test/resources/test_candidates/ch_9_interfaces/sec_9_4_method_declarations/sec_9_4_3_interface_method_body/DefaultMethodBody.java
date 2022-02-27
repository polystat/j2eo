public class DefaultMethodBody {
    public static void main(String[] args) {
        new Some().printMsg();
    }
}

interface ISome {
    default void printMsg() {
        System.out.println("passed");
    }
}

class Some implements ISome {}