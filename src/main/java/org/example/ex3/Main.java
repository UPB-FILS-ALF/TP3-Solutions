package org.example.ex3;

// Import generated files
import com.alfEx3.parser.alfLexer;
import com.alfEx3.parser.alfParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Main {
    public static void main(String[] args) {
        // Create lexer from input string
        alfLexer lexer = new alfLexer(CharStreams.fromString("Hello ALF!"));

        // Create parser
        alfParser parser = new alfParser(new CommonTokenStream(lexer));

        // Parse the input, where `main` is the entry point you defined in the grammar file
        alfParser.MainContext tree = parser.main();
        System.out.println("Tokens: " + tree.children);

        // Now we can get each token from the input we introduced
        String name = tree.NAME().getText();
        System.out.println("Name intoduced: " + name);

    }
}