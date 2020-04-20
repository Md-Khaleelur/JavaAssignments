package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PingHost {

    private List<Double> list ;

    PingHost() {
        list = new ArrayList<Double>();
    }

    void commands(ArrayList<String> commandList) throws Exception {
        // creating the sub process, execute system command
        ProcessBuilder build = new ProcessBuilder(commandList);
        Process process = build.start();

        // to read the output
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader Error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        String s = null;

        int idx1;
        int idx2;
        int flag = 0;

        System.out.println("Standard output: ");
        while ((s = input.readLine()) != null) {
            System.out.println(s);
            if(s.contains("64 bytes")) {
                flag=1;
                idx1 =s.indexOf("time");
                idx2=s.indexOf("ms",idx1);
                //System.out.println(s);
                Double d=Double.parseDouble((s.substring(idx1+5, idx2))) ;
                list.add(d);
            }
            else if( (s.contains("not known") || s.isEmpty() )&& flag==0) {
                System.out.println("Ping request not handled");
                break;
            }
        }
        if(flag==1)
            System.out.println("The median ping time is "+medianPing());

        while ((s = Error.readLine()) != null) {
            System.out.println("error (if any): ");
            System.out.println(s);
        }
    }

     private double medianPing() {

        int size = list.size();
        Collections.sort(list);
        System.out.println(list);

        int idx= list.size()/2 ;
        if(size%2==0)
            return (list.get(idx-1)+list.get(idx))/2 ;

        return list.get(idx);
    }

}
