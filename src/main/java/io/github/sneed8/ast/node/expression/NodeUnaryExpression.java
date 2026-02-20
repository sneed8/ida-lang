package io.github.sneed8.ast.node.expression;

import io.github.sneed8.ast.visitor.ASTVisitor;
import io.github.sneed8.syntax.Token;

public class NodeUnaryExpression extends NodeExpression{
    public Token operator;
    public NodeExpression expression;

    public NodeUnaryExpression(Token operator, NodeExpression expression) {
        this.operator = operator;
        this.expression = expression;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNodeUnaryExpression(this, null);
    }   
}