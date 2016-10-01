package ru.spbstu.java_classes.homeworks.homework1;

import java.io.IOException;

public class Task {

    public static void main(String[] args) throws IOException {
        // 1) read input and ouput filenames (relative to resources folder e.g. input.txt output.txt)
        String inputFilePath = "C:\\Users\\Alexandra\\Documents\\IdeaProjects\\05.09.16\\out\\production\\untitled104\\input.txt";
        String outputFilePath = "C:\\Users\\Alexandra\\Documents\\IdeaProjects\\05.09.16\\out\\production\\untitled104\\output.txt";

        // 2) Create XorFileEncoder implementing FileEncoder interface
        FileEncoder encoder = new XorFileEncoder();
        encoder.endcode(inputFilePath, outputFilePath);

        // 3) Create XorFileDecoder implementing FileDecoder interface
        FileDecoder decoder = new XorFileDecoder();
        String result = decoder.decode(outputFilePath);

        System.out.println(result);
    }
}
