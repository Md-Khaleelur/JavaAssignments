package com.company;

import java.util.ArrayList;

public class PingHostMain {
    public static void main(String[] args) throws Exception {

        // creating list for commands
        ArrayList<String> commandList = new ArrayList<String>();

        commandList.add("ping");
        commandList.add("www.google.com");
        commandList.add("-c3");

        PingHost pingHost = new PingHost();
        pingHost.commands(commandList);

    }
}
