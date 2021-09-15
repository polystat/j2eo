package eotree;

import java.util.List;

public class EOBytesData<T> extends EOData<T> {
    public EOBytesData(List<EOSingleByte> bytes) {
        this.bytes = bytes;
    }

    List<EOSingleByte> bytes;
}
