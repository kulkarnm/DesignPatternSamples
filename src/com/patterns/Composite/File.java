package com.patterns.Composite;

public class File implements Recordable {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println(FilePathBuilder.buildPath() + fileName);
    }
}
