package io.github.sneed8.ast.node.expression;

import java.util.ArrayList;
import java.util.List;

import io.github.sneed8.ast.visitor.ASTVisitor;

public class NodeFunctionCall extends NodeExpression{
    public String identifier;
    public List<NodeExpression> arguments = new ArrayList<>();

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNodeFunctionCall(this);
    }
    
}
