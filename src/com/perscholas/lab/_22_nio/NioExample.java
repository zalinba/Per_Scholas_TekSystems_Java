package com.perscholas.lab._22_nio;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

//Lab 303.10.2 NIO

/* In this lab, we will demonstrate how to use Java NIO.
 * Example one:
 * Multiple source channels (input files) to a single output channel.
 *
 * In this example, we will read the file content from two different
 * files and write their combined output into a single separate file.
 *      ● In total, we will create three channels:
 *              ○ We will create two channels for the source file.
 *              ○ We will create one channel for the destination file.
 *
 * Click on the links below to download a dummy file for this lab:
 * ● File1.txt
 * ● File2.txt
 *
 * Create a class named NioExample
 */
public class NioExample {
    public static void main(String[] args) throws IOException {
        // initializing two files in Array;
        String[] inputFiles = {"C:/Users/owner/Desktop/Powerpoints, lab, assignments, hackerrank, textbook/Lab Practice/file1.txt",
                "C:/Users/owner/Desktop/Powerpoints, lab, assignments, hackerrank, textbook/Lab Practice/file2.txt"};

        // Specify out file with path location
        //Files contents will be written in these files
        String outputFile = "C:/Downloads/nioOutput.txt";

        // Get Channel for destination or outputFile
        FileOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel = fos.getChannel();

        for (int i = 0; i < inputFiles.length; i++) {
            // Get channel for inputFiles
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputchannel = fis.getChannel();
            long size = inputchannel.size();
            ByteBuffer buf = ByteBuffer.allocate((int) size);
            System.out.print((char) buf.get());
            while (inputchannel.read(buf) > 0) {
                buf.flip();
                while (buf.hasRemaining()) {
                    //  System.out.print((char) buf.get());
                    targetChannel.write(buf);
                }
            }
            //fis.close();
        }
        /* After executing your program, nioOutput.txt file
         * will be created in your computer per the specified
         * path location.
         */

    }
}