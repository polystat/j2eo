public class OrOperator {
    public static void main(String[] args) {
        Object writerObj = new Writer();
        Object ioObj = new IOController();

        if (writerObj instanceof IReader reader || writerObj instanceof IWriter writer) {
            // no 'reader' & 'writer' here
            // System.out.println(reader == null);
            // System.out.println(writer == null);
            if (writerObj instanceof IWriter wr) {
                System.out.println(wr.getClass().getName());
            }
        }
        if (ioObj instanceof IReader reader && ioObj instanceof IWriter writer) {
            System.out.println(reader.read());
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