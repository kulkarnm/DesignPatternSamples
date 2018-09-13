package com.patterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Recordable{
    private String dirName;
    private List<Recordable> recordableList;

    public Directory(String dirName) {
        this.dirName = dirName;
        this.recordableList = new ArrayList<>();
    }

    public void add(Recordable recordable){
        recordableList.add(recordable);
    }

    public void ls() {
        System.out.println(FilePathBuilder.buildPath() + dirName);
        FilePathBuilder.append(" ");
        for(Recordable recordable: recordableList){
            recordable.ls();
        }
    }
}
