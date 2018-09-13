package com.patterns.visitor;

import com.patterns.Composite.FilePathBuilder;
import com.patterns.Composite.Recordable;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Visitable {
    private String dirName;
    private List<Visitable> visitables;

    public Directory(String dirName) {
        this.dirName = dirName;
        this.visitables = new ArrayList<>();
    }

    public void add(Visitable visitable){
        visitables.add(visitable);
    }

    public void accept(Visitor visitor) {
        for(Visitable visitable: visitables){
            visitable.accept(visitor);
        }
    }
}
