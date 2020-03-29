package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

class SearchDirectory {

    String pattern;

    public SearchDirectory(String pattern) {
        this.pattern = pattern;
    }

    ArrayList<String> matchedFiles=new ArrayList<String>();

    public ArrayList<String> searchFiles(File[] files) {

        for (File file : files) {

            if (file.isDirectory()) {
                searchFiles(file.listFiles()); // calling the method recursively
            }

            else if(Pattern.matches( pattern, file.getName()))
                matchedFiles.add(file.getAbsolutePath());

        }
        return matchedFiles;
    }
}