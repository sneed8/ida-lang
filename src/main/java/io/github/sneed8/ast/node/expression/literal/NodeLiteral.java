package io.github.sneed8.ast.node.expression.literal;
import io.github.sneed8.ast.node.expression.NodeExpression;
import io.github.sneed8.syntax.Token;
import io.github.sneed8.vm.symbol.ValType;

public abstract class NodeLiteral extends NodeExpression{
    public final Token token;
    public final Object value;
    public ValType resolvedType; // ?

    public NodeLiteral(Token token) {
        this.token = token;
        this.value = token.literal;
    }
    
    public abstract Object getValue();

    public String toString() {
        return this.value.toString();
    }
}