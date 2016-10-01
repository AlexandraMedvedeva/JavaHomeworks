package ru.spbstu.java_classes.homeworks.homework1;


public interface FileEncoder {
    /**
     * Encode inputFile writing the result to outputFile
     *
     * @param inputFilePath     - input file path (relative to resources folder)
     * @param outputFilePath    - output file path (relative to resources folder)
     */
    void endcode(String inputFilePath, String outputFilePath);
}
