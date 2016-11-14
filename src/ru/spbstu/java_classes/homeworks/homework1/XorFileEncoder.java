package ru.spbstu.java_classes.homeworks.homework1;

import java.io.*;

/**
 * Created by Alexandra on 30.09.2016.
 */
public class XorFileEncoder implements FileEncoder {
    /**
     * Encode inputFile writing the result to outputFile
     *
     * @param inputFilePath     - input file path (relative to resources folder)
     * @param outputFilePath    - output file path (relative to resources folder)
     */

    public void endcode(String inputFilePath, String outputFilePath){
        try(BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(inputFilePath));
            BufferedOutputStream outStream = new BufferedOutputStream(new FileOutputStream(outputFilePath))){

            int value;
            int prevValue = 0;

            while((value = inStream.read()) != -1){
                outStream.write(prevValue ^ value);
                prevValue = value ^ prevValue;
            }

            outStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
