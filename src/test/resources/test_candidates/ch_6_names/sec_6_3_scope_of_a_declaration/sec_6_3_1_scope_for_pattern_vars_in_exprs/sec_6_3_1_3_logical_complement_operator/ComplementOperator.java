public class ComplementOperator {
    public static void main(String[] args) throws Exception {
        Object readerObj = new Reader();
        Object ioObj = new IOController();

        if (!(readerObj instanceof IReader reader)) {
            throw new Exception("Exception!!!");
        }
        if (!(ioObj instanceof IReader ioReader)) {
            // Cannot use ioReader here
            // System.out.println(ioReader.read());
            throw new Exception("Other exception!!!");
        }
        System.out.println(ioReader.read());
        System.out.println(reader.read());
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
        return "passed";
    }
}