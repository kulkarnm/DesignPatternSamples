package com.patterns.visitor;

public class VirusScanner implements Visitor {
    @Override
    public void visit(Visitable visitable) {
        System.out.println("scan file : " + ((File)visitable).getFileName());
    }
}
