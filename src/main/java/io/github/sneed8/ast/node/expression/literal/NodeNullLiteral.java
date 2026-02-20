package io.github.sneed8.ast.node.expression.literal;

import io.github.sneed8.ast.visitor.ASTVisitor;
import io.github.sneed8.syntax.Token;

public class NodeNullLiteral extends NodeLiteral{

    public NodeNullLiteral(Token token) {
        super(token);
    }
    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
       return visitor.visitNodeNullLiteral(this);
    }

    @Override
    public Object getValue() {
        return null;
    }
}