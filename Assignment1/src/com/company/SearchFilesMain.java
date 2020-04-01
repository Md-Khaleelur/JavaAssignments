package com.company;

import java.io.File;
import java.util.Scanner;

public class SearchFilesMain {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String loc = System.getProperty("user.home");
        File file = new File(loc);
        File[] files=file.listFiles();

        System.out.println("Enter the pattern to search the files");
        String pattern=sc.next();

        SearchDirectory sd= new SearchDirectory(pattern);
        for(String s:sd.searchFiles(files))
            System.out.println(s);
    }
}
