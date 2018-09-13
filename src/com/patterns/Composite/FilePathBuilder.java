package com.patterns.Composite;

public class FilePathBuilder {
    private static StringBuffer filePathBuilder=new StringBuffer();

    public static String buildPath(){
        return filePathBuilder.toString();
    }

    public static void append(String s){
        filePathBuilder.append(s);
    }
} 
