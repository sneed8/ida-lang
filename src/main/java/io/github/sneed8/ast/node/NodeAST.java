package io.github.sneed8.ast.node;

import io.github.sneed8.ast.visitor.ASTVisitor;

public abstract interface NodeAST {
    <T> T accept(ASTVisitor<T> visitor);
}