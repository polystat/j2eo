package tree;

import java.util.ArrayList;

public class Dims extends Entity {
    // Structure
    public ArrayList<Dim> dimensions;

    // Creation
    public Dims() {
        dimensions = new ArrayList<>();
    }

    public Dims(Dim dim) {
        this.dimensions = new ArrayList<>();
        this.dimensions.add(dim);
        if (dim != null) {
            dim.parent = this;
        }
    }

    public Dims add(Dim dim) {
        this.dimensions.add(dim);
        if (dim != null) {
            dim.parent = this;
        }
        return this;
    }

    // Reporting
    public void report(int sh) {
        title("Dimensions: ", sh);
        Entity.doShift(sh + Entity.shift);
        for (int i = 1; i <= dimensions.size(); i++) {
            System.out.print("[]");
        }
        System.out.println();
    }

}
