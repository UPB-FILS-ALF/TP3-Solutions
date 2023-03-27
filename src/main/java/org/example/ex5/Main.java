package org.example.ex5;

// Import generated files

import com.alfEx5.parser.alfLexer;
import com.alfEx5.parser.alfParser;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        alfLexer lexer = new alfLexer(CharStreams.fromString("Bonjour! Le TP d'ALF est de 8 a 10."));

        BufferedTokenStream bts = new BufferedTokenStream(lexer);
        alfParser parser = new alfParser(bts);

        alfParser.MainContext tree = parser.main();

        HashMap<Integer, String> tokensPositionMap = new HashMap<>();
        tokensPositionMap.put(-1, "END_OF_FILE");
        try{
            File myObj = new File("src\\main\\generatedFiles\\com\\alfEx5\\parser\\alf.tokens");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String[] line = myReader.nextLine().split("=");
                if(!tokensPositionMap.containsKey(Integer.parseInt(line[1]))) {
                    tokensPositionMap.put(Integer.parseInt(line[1]), line[0]);
                }
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        for (int i = 0; i < bts.size(); i++) {
            Token token = bts.get(i);
            System.out.println(tokensPositionMap.get(token.getType()) + " - > " + token.getText());
        }
    }
}