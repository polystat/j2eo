package tree;

import java.util.ArrayList;

public class InitializerArray extends Initializer {
    // Structure
    public ArrayList<Initializer> initializers;

    // Creation
    public InitializerArray(Initializer init) {
        this.initializers = new ArrayList<>();
        this.initializers.add(init);
    }

    public InitializerArray add(Initializer init) {
        this.initializers.add(init);
        return this;
    }

    // Reporting
    public void report(int sh) {

    }

}
