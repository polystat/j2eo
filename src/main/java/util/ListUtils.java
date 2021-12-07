package util;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListUtils {
    @SafeVarargs
    public static <T> List<T> listOf(T... elems) {
        return Stream.of(elems).collect(Collectors.toList());
    }

    @SafeVarargs
    public static <T> List<T> concat(List<T>... lists) {
        return Stream.of(lists)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public static <T> Optional<T> first(List<T> list) {
        if (list.size() == 0)
            return Optional.empty();
        else
            return Optional.ofNullable(list.get(0));
    }

    public static <T> Optional<T> last(List<T> list) {
        if (list.size() == 0)
            return Optional.empty();
        else
            return Optional.ofNullable(list.get(list.size() - 1));
    }
}
