package com.patterns.visitor;

import com.patterns.Composite.FilePathBuilder;
import com.patterns.Composite.Recordable;

public class File implements Visitable {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
