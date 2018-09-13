package com.patterns.visitor;

import com.patterns.visitor.Visitor;

public interface Visitable {
    public void accept(Visitor visitor);
}
