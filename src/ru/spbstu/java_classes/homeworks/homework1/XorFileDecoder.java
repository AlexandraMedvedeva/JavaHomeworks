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
        String result = null;
        try {
            File inFile = new File(inputFilePath);
            long inFileSize = inFile.length();

            DataInputStream inStream = new DataInputStream(new BufferedInputStream(new FileInputStream(inputFilePath)));

            byte inData[] = new byte[(int) inFileSize];
            inStream.readFully(inData);

            result = new String(inData);

            for (int i = 0; i < inFileSize; i++) {
                result += (byte) (inData[i] ^ 1);
            }

            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
