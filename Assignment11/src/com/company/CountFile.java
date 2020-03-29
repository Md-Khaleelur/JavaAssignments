package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class CountFile{

    Map<Character,Integer> map = new HashMap<Character, Integer>();

    void read(File inFile) throws IOException {
        FileReader fileReader = new FileReader(inFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
        while((line = bufferedReader.readLine()) != null) {

            for (int i=0;i<line.length();i++) {
                char character = line.charAt(i);

                if (map.containsKey(character)){
                    int val = map.get(character);
                    map.put(character,val+1);
                }

                else {
                    map.put(character,1);
                }
            }

        }
        bufferedReader.close();
    }

    void write(File outFile) throws IOException {
        FileWriter fileWriter = new FileWriter(outFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(String.valueOf(map));

        bufferedWriter.close();

    }
}