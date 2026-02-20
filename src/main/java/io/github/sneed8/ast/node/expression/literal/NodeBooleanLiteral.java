package io.github.sneed8.ast.node.expression.literal;

import io.github.sneed8.ast.visitor.ASTVisitor;
import io.github.sneed8.syntax.Token;

public class NodeBooleanLiteral extends NodeLiteral {

    public NodeBooleanLiteral(Token token) {
        super(token);
    }

    @Override
    public Boolean getValue() {
        return (Boolean)this.value;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNodeBooleanLiteral(this);
    }
}