package eotree;

import java.util.List;
import java.util.stream.Collectors;

/**
 * EBNF representation:
 * <code>
 * [ license ] [ metas ] { object eol }
 * </code>
 */
public class EOProgram extends EONode {
    public EOLicense   license;
    public EOMetas     metas;
    public List<EOBnd> bnds;

    public EOProgram(EOLicense license, EOMetas metas, List<EOBnd> bnds) {
        this.license = license;
        this.metas = metas;
        this.bnds = bnds;
    }

    @Override
    public String generateEO(int indent) {
        return license.generateEO(indent) +
               "\n" +
               metas.generateEO(indent) +
               "\n" +
               bnds.stream()
                       .map(bnd -> bnd.generateEO(indent))
                       .collect(Collectors.joining("\n")) + "\n";
    }
}
