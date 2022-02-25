public class AndOperator {
    public static void main(String[] args) {
        Object writerObj = new Writer();
        Object ioObj = new IOController();

        if (ioObj instanceof IReader reader && ioObj instanceof IWriter writer) {
            System.out.println(reader.read());
        }
        if (writerObj instanceof IReader reader && writerObj instanceof IWriter writer) {
            System.out.println("not passed");
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