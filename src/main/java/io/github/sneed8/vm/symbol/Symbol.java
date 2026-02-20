package io.github.sneed8.vm.symbol;

public interface Symbol {
    public default ValType getType(){return null;} // This is ugly...
    public default Value getvalue(){return null;}
    public default void setValue(Value value){};
}