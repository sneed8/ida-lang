package io.github.sneed8.ast.node.types;

import io.github.sneed8.vm.symbol.ValType;

public class NodeDouble extends NodeType{
    public NodeDouble() {
        this.type = ValType.DOUBLE;
    }
}