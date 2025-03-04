package compiler;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;

import compiler.frontend.SymbolTableChecker;

public class testSymbol {

    private void testPattern(String path) {
        String contentInit = Compiler.readFile(path);
        ParseTree tree = Compiler.parse(contentInit);
        System.out.println("Parsed !");
        System.out.println(contentInit);
        SymbolTableChecker symbolTableChecker = new SymbolTableChecker();
        symbolTableChecker.visit(tree);
        assert(true);
    }

    @Test
    void testSymbol1() {
        try {
            testPattern("src/test/resources/symboltest1.sc");
            assert(false);
        }
        catch (RuntimeException ignored) {}
    }

    @Test
    void testSymbol2() {
        try {
            testPattern("src/test/resources/symboltest2.sc");
            assert(false);
        }
        catch (RuntimeException ignored) {}
    }

    @Test
    void testSymbol3() {
        testPattern("src/test/resources/symboltest3.sc");
    }

    @Test
    void testSymbol4() {
        testPattern("src/test/resources/symboltest4.sc");
    }

    @Test
    void testSymbolAdd() {
        testPattern("src/test/resources/add.sc");
    }

    @Test
    void testSymbolFact() {
        testPattern("src/test/resources/fact.sc");
    }

    @Test
    void testSymbolHello() {
        testPattern("src/test/resources/hello.sc");
    }

    @Test
    void testSymbolMax() {
        testPattern("src/test/resources/max.sc");
    }

    @Test
    void testSymbolPower() {
        testPattern("src/test/resources/power.sc");
    }

    @Test
    void testSymbolSum() {
        testPattern("src/test/resources/sum.sc");
    }

    @Test
    void testSymbolFunctions() {
        testPattern("src/test/resources/functions.sc");
    }

    @Test
    void testSymbolPrint() {
        testPattern("src/test/resources/print.sc");
    }
}
