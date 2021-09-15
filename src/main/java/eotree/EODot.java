package eotree;

public class EODot<T> extends EOApp<T> {
    T src;
    String name;

    public EODot(T src, String name) {
        this.src = src;
        this.name = name;
    }
}
