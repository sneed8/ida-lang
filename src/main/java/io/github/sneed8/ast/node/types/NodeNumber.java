package io.github.sneed8.ast.node.types;

import io.github.sneed8.vm.symbol.ValType;

public class NodeNumber extends NodeType{
    public NodeNumber() {
        this.type = ValType.NUMBER;
    }
}