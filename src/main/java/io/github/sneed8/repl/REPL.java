package io.github.sneed8.repl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import io.github.sneed8.ast.node.Program;
import io.github.sneed8.ast.visitor.PrettyPrinterVisitor;
import io.github.sneed8.lexer.Lexer;
import io.github.sneed8.parser.Parser;
import io.github.sneed8.syntax.Token;

public class REPL {
    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            Lexer lexer = new Lexer();
            Parser parser;
            PrettyPrinterVisitor visitor;
            String mode = "parser";

            while(true) {
                print("REPL Version: 0.2");
                print("Current Mode: " + mode);
                String input = scanner.nextLine().trim();
                switch(input) {
                    case "::lexer":
                        mode = "lexer";
                        break;
                    case "::parser":
                        mode = "parser";
                        break;
                    case "::quit":
                    case "::stop":
                    case "::exit":
                        System.exit(0);
                    case "::help":
                        print(help());
                        break;
                    default: {
                        if(mode.equals("lexer")) {
                            try {
                                List<Token> tokens = new ArrayList<>(lexer.tokenize(input));
                                for(Token token : tokens) print(token); // Print automatically calls toString()... I think
                                break;
                            } catch (Exception e) {
                                e.printStackTrace();
                                break;
                            }
                        } else if(mode.equals("parser")) {
                                try {
                                parser = new Parser(lexer.tokenize(input));
                                Program program = parser.parseProgram();
                                visitor = new PrettyPrinterVisitor();
                                visitor.walkTree(program);
                                visitor.print();
                                break;
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }
    private static void print(Object x) {
        System.out.println(x);
    }

    private String help() {
        StringBuilder str = new StringBuilder();
        str.append("::lexer - for lexer mode" + "\n");
        str.append("::parser - for parser mode" + "\n");
        str.append("::exit - to exit REPL" + "\n");
        return str.toString();
    }
}