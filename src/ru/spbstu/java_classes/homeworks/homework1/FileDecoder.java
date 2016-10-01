package ru.spbstu.java_classes.homeworks.homework1;

public interface FileDecoder {
    /**
     * Decode inputFile
     *
     * @param inputFilePath - input file path (relative to resources folder)
     * @return decoded file string
     */
    String decode(String inputFilePath);
}
