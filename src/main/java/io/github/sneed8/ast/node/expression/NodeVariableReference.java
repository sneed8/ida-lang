package io.github.sneed8.ast.node.expression;

import io.github.sneed8.ast.visitor.ASTVisitor;
import io.github.sneed8.vm.symbol.ValType;

public class NodeVariableReference extends NodeExpression{
    public String identifier;
    public ValType resolvedType; // ?

    public NodeVariableReference(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNodeVariableReference(this);
    }

    public String toString() {
        return this.identifier;
    }
}