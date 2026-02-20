package io.github.sneed8;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import io.github.sneed8.repl.REPL;
import io.github.sneed8.vm.VM;

public class Main {
    public static void main(String[] args ) {

        if(args.length > 0) {
            try {
                String source = Files.readString(Path.of(args[0]));
                VM vm = new VM();
                vm.execute(source);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            REPL repl = new REPL();
            repl.run();
        }
    }
}