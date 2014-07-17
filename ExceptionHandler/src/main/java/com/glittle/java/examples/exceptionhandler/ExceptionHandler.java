package com.glittle.java.examples.exceptionhandler;

import java.io.*;

public class ExceptionHandler {

    public static void main(String[] args) {
        try {
            giveMeDaFileContents();
        } catch (IOException ioe) {
            System.err.println("Caught IOException: " + ioe.getMessage());
        } finally {
            System.err.println("At last, let me out of here");
        }
    }

    private static void giveMeDaFileContents() throws IOException {

        try(FileInputStream inputStream = new FileInputStream("MyFiles.suck")) {

            int streamData = inputStream.read();

            while(streamData != -1){
                System.out.print((char) streamData);
                streamData = inputStream.read();
            }
        }
    }
}
