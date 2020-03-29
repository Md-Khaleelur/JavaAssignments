package com.company;

import java.io.*;

public class CountFileMain {
    public static void main(String[] args) throws IOException {

        CountFile countFile = new CountFile();
        File readFile = new File(args[0]);
        countFile.read(readFile);

        File writeFile = new File(args[1]);
        countFile.write(writeFile);

    }
}
