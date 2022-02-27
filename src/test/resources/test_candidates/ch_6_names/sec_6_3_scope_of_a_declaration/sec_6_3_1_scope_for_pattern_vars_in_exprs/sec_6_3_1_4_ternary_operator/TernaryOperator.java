import java.util.function.Consumer;

public class TernaryOperator {
    public static void main(String[] args) {
        Object readerObj = new Reader();
        Object ioObj = new IOController();
        System.out.println((ioObj instanceof IReader rdr) ? rdr.read() : "?");
        Consumer<String> cons =
            (readerObj instanceof IReader reader) ? 
            s -> System.out.println(s + reader.read()) : 
            s -> System.out.println(s + "not passed");
        cons.accept("pa");
    }    
}

interface IReader { 
    String read();
 }
interface IWriter {}

class IOController implements IReader, IWriter {
    @Override
    public String read() {
        return "not passed";
    }
}
class Reader implements IReader {
    @Override
    public String read() {
        return "ssed";
    }
}