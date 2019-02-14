package org.luncert;

import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.luncert.grammar.JapyLexer;
import org.luncert.grammar.JapyParser;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     * 
     * @throws IOException
     */
    @Test
    public void test() throws IOException {
        String source = ClassLoader.getSystemResource("LinkedQueue.japy").getFile();
        Lexer lexer = new JapyLexer(CharStreams.fromFileName(source));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JapyParser parser = new JapyParser(tokens);
        ParserRuleContext ctx = parser.compilationUnit();
        System.out.println(ctx.toStringTree(parser));
    }
    
}
