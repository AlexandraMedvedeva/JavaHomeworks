package ru.spbstu.java_classes.homeworks.homework1;

import java.io.IOException;

public class Task {

    public static void main(String[] args) throws IOException {
        // 1) read input and ouput filenames (relative to resources folder e.g. input.txt output.txt)
        //хоть файлы текстовые располагаются в папке resources, я не могу не писать абсолютный путь. Почему?
        String inputFilePath = "C:\\Users\\Alexandra\\Documents\\IdeaProjects\\05.09.16\\resources\\input.txt";
        String outputFilePath = "C:\\Users\\Alexandra\\Documents\\IdeaProjects\\05.09.16\\resources\\new.txt";

        // 2) Create XorFileEncoder implementing FileEncoder interface
        FileEncoder encoder = new XorFileEncoder();
        encoder.endcode(inputFilePath, outputFilePath);

        // 3) Create XorFileDecoder implementing FileDecoder interface
        String result = null;
        try{
            FileDecoder decoder = new XorFileDecoder();
            result = decoder.decode(outputFilePath);
        }catch(NullPointerException e){
            return;
        }

        System.out.println(result);
    }
}
