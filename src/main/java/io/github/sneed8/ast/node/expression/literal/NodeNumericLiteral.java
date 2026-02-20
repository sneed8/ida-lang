package io.github.sneed8.ast.node.expression.literal;

import io.github.sneed8.ast.visitor.ASTVisitor;
import io.github.sneed8.syntax.Token;

public class NodeNumericLiteral extends NodeLiteral{

    public NodeNumericLiteral(Token token) {
        super(token);
    }

    public Integer getValue() {
        return (Integer)this.value;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNodeNumericLiteral(this);
    }
}