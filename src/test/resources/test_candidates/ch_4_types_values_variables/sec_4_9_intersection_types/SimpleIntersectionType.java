public class SimpleIntersectionType {
    public static void main(String[] args) {
        IOController io = new IOController();
        io.init();
        processData(io);
        io.close();
        System.out.println("passed");
    }

    static <T extends Reader & Writer> void processData(T ioController) {
        ioController.write("Some data");
        System.out.println(ioController.read().toString());
    }
}

interface Reader {
    Object read();
}

interface Writer {
    void write(Object obj);
}

class IOController implements Reader, Writer {
    public void init() {
        System.out.println("Initialization...");
    }

    public void close() {
        System.out.println("Closing...");
    }

    @Override
    public Object read() {
        return "Reading [data]";
    }

    @Override
    public void write(Object data) {
        System.out.println("Writing " + data.toString());
    }
}