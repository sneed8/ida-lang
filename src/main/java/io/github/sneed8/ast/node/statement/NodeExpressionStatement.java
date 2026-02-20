package io.github.sneed8.ast.node.statement;

import io.github.sneed8.ast.node.expression.NodeExpression;
import io.github.sneed8.ast.visitor.ASTVisitor;
import io.github.sneed8.vm.symbol.ValType;

public class NodeExpressionStatement extends NodeStatement {
    public NodeExpression expression;
    public ValType resolvedType;

    public NodeExpressionStatement(NodeExpression expression) {
        this.expression = expression;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNodeExpressionStatement(this);
    }
}