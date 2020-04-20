package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PingHostMain {
    public static void main(String[] args) throws Exception {

        // creating list for commands

        Scanner scanner = new Scanner(System.in);
        System.out.println("No of pings");
        String count = scanner.nextLine();
        String cmd = "-c"+count;
        scanner.close();

        ArrayList<String> commandList = new ArrayList<String>();

        commandList.add("ping");
        commandList.add("www.google.com");
        commandList.add(cmd);

        PingHost pingHost = new PingHost();
        pingHost.commands(commandList);

    }
}
