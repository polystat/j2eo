package util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListUtils {
    @SafeVarargs
    public static <T> List<T> listOf(T... elems) {
        return Stream.of(elems).collect(Collectors.toList());
    }
}
