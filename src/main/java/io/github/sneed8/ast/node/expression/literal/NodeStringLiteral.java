package io.github.sneed8.ast.node.expression.literal;

import io.github.sneed8.ast.visitor.ASTVisitor;
import io.github.sneed8.syntax.Token;

public class NodeStringLiteral extends NodeLiteral {

    public NodeStringLiteral(Token token) {
        super(token);
    }

    // THIS IS POSTPONING COMPLEXITY !!!! THIS MUST BE CHANGED LATER DOWN THE
    // LINE!!!!!!!!!!!
    public String getValue() {
        if (value == null)
            return null;
        String str = (String) value;
        return str.substring(1, str.length() - 1);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNodeStringLiteral(this);
    }
}