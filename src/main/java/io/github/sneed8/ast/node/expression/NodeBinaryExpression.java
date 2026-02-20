package io.github.sneed8.ast.node.expression;

import io.github.sneed8.ast.visitor.ASTVisitor;
import io.github.sneed8.syntax.Token;
import io.github.sneed8.vm.symbol.ValType;

public class NodeBinaryExpression extends NodeExpression{
    public NodeExpression leftHandSide;
    public NodeExpression rightHandSide;
    public Token operator;
    public ValType resolvedType = null; // This is a field that will have to be realized at typechecking

    public NodeBinaryExpression(NodeExpression leftHandSide, NodeExpression rightHandSide, Token operator) {
        this.leftHandSide = leftHandSide;
        this.rightHandSide = rightHandSide;
        this.operator = operator;
    }
    // Maybe needed?
    public NodeBinaryExpression(){}

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitNodeBinaryExpression(this, null);
    }
}