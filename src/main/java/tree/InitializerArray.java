package tree;

import java.util.ArrayList;

public class InitializerArray extends Initializer {
    // Structure
    public ArrayList<Initializer> initializers;

    // Creation
    public InitializerArray(Initializer init) {
        this.initializers = new ArrayList<>();
        this.initializers.add(init);
        if (init != null) {
            init.parent = this;
        }
    }

    public InitializerArray(ArrayList<Initializer> initializers) {
        this.initializers = initializers;
        for (var init : initializers) {
            init.parent = this;
        }
    }

    public InitializerArray add(Initializer init) {
        this.initializers.add(init);
        if (init != null) {
            init.parent = this;
        }
        return this;
    }

    // Reporting
    public void report(int sh) {

    }

}
