package io.github.sneed8.ast.node.types;

import io.github.sneed8.vm.symbol.ValType;

public class NodeBoolean extends NodeType{
    public NodeBoolean() {
        this.type = ValType.BOOLEAN;
    }
}
