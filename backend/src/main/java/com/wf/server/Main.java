package com.wf.server;

import java.io.IOException;

public class Main {

    public static void main(String[] args){
        try {
            Server server = new Server("localhost", 3001);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
