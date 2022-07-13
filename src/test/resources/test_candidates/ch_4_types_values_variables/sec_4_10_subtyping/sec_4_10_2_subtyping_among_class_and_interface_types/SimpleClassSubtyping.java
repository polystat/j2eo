import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class SimpleClassSubtyping {
    public static void main(String[] args) {
        new Some().check();
        System.out.println("passed");
    }
}

class Some {
    void check() {
        System.out.println(this instanceof Object);
    }
}
