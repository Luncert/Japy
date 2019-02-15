package org.luncert;

import java.io.IOException;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.luncert.grammar.JapyLexer;
import org.luncert.grammar.JapyParser;
import org.luncert.grammar.Python3Lexer;
import org.luncert.grammar.Python3Parser;
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
        String source = AppTest.class.getClassLoader().getResource("LinkedQueue.japy").getFile();
        source = source.replaceAll("^/", "");
        
        Lexer lexer = new JapyLexer(CharStreams.fromFileName(source));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JapyParser parser = new JapyParser(tokens);
        ParserRuleContext ctx = parser.compilationUnit();
        System.out.println(ctx.toStringTree(parser));
    }

    @Test
    public void testPython3() throws IOException {
        String source = AppTest.class.getClassLoader().getResource("Test.py").getFile();
        source = source.replaceAll("^/", "");
        
        Lexer lexer = new Python3Lexer(CharStreams.fromFileName(source));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Python3Parser parser = new Python3Parser(tokens);
        ParserRuleContext ctx = parser.file_input();
        System.out.println(ctx.toStringTree(parser));
    }
    
}
