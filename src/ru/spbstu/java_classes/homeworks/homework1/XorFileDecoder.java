package ru.spbstu.java_classes.homeworks.homework1;

import java.io.*;
import java.nio.file.FileSystemException;

/**
 * Created by Alexandra on 30.09.2016.
 */
public class XorFileDecoder implements FileDecoder {
    /**
     * Decode inputFile
     *
     * @param inputFilePath - input file path (relative to resources folder)
     * @return decoded file string
     */
    public String decode(String inputFilePath) {
        StringBuilder stringBuilder = null;
        try {
            BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(inputFilePath));

            stringBuilder = new StringBuilder();

            int value;
            int prevValue = 0;
            while((value = inStream.read()) != -1) {
                stringBuilder.append((char) (value ^ prevValue));
                prevValue = value;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }
}
