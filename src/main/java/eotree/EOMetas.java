package eotree;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * EBNF representation:
 * <code>
 * { meta EOL } EOL
 * </code>
 */
public class EOMetas extends EONode {
    Optional<String> packageName;
    List<EOMeta>     metas;

    public EOMetas(Optional<String> packageName, List<EOMeta> metas) {
        this.packageName = packageName;
        this.metas = metas;
    }

    @Override
    public String generateEO(int indent) {
        return packageName
                       .map(p -> "+package " + p + "\n")
                       .orElse("") +
               metas.stream()
                       .map(m -> m.generateEO(indent))
                       .collect(Collectors.joining("\n"));
    }
}
