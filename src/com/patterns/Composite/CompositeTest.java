package com.patterns.Composite;

public class CompositeTest {
    public static void main(String[] args){
        Directory directory1= new Directory("dir1");
        Directory directory2 = new Directory("dir2");
        Directory directory3 = new Directory("dir3");
        File file1= new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        directory1.add(file1);
        directory2.add(file2);
        directory3.add(file3);
        directory1.add(directory2);
        directory1.add(directory3);
        System.out.println("recursive listing of directory1 content");
        directory1.ls();
        System.out.println("recursive listing of directory2 content");
        directory2.ls();
        System.out.println("recursive listing of directory3 content");
        directory3.ls();
    }
} 
