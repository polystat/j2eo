package eotree;

import java.util.List;
import java.util.stream.Collectors;

public class EOAttributes extends EONode {
    List<EOAttribute> attributes;

    public EOAttributes(List<EOAttribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String generateEO(int indent) {
        return "[" +
               attributes.stream()
                       .map(attribute -> attribute.generateEO(indent))
                       .collect(Collectors.joining(" "))
               + "]";
    }
}
