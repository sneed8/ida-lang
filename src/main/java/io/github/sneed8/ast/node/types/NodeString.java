package io.github.sneed8.ast.node.types;

import io.github.sneed8.vm.symbol.ValType;

public class NodeString extends NodeType{
    public NodeString() {
        this.type = ValType.STRING;
    }
}