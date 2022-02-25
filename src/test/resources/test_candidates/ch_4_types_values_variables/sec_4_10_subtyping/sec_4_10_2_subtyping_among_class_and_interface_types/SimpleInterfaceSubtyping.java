import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class SimpleInterfaceSubtyping {
    public static void main(String[] args) {
        ISome some = new Some();
        System.out.println(some instanceof Object);
        System.out.println("passed");
    }
}

interface ISome {}

class Some implements ISome {}