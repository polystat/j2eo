public class SwitchPatternMatching {
    public static void main(String[] args) {
        Object io = new IOController();
        Object writerObj = new Writer();
        int val1 = 5;
        int val2 = 6;

        switch (val1) {
            case 5 -> System.out.println(io instanceof IReader reader ? reader.read() : "?");
            default -> System.out.println("not passed");
        }
    }    
}

interface IReader {
    String read();
}
interface IWriter {}

class IOController implements IReader, IWriter {
    @Override
    public String read() {
        return "passed";
    }
}
class Writer implements IWriter {}