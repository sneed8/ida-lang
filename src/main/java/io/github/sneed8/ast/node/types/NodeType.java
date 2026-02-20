package io.github.sneed8.ast.node.types;

import io.github.sneed8.ast.node.NodeAST;
import io.github.sneed8.ast.visitor.ASTVisitor;
import io.github.sneed8.vm.symbol.ValType;
public abstract class NodeType implements NodeAST{
    public ValType type;
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNodeType(this);
    }
}