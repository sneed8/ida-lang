package io.github.sneed8.ast.node.statement;

import io.github.sneed8.ast.node.expression.NodeExpression;
import io.github.sneed8.ast.visitor.ASTVisitor;

public class NodePrintStatement extends NodeStatement{
    public NodeExpression printable;
    
    public NodePrintStatement(NodeExpression printable) {
        this.printable = printable;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNodePrintStatement(this);
    }
}