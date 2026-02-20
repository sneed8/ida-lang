package io.github.sneed8.ast.node.statement;

import io.github.sneed8.ast.node.expression.NodeExpression;
import io.github.sneed8.ast.visitor.ASTVisitor;
import io.github.sneed8.vm.symbol.ValType;

public class NodeVariableDeclaration extends NodeStatement {
    public ValType type;
    public String identifier;
    public NodeExpression initializer;

    public NodeVariableDeclaration(ValType type, String identifier, NodeExpression initializer) {
        this.type = type;
        this.identifier = identifier;
        this.initializer = initializer;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNodeVariableDeclaration(this);
    }
}