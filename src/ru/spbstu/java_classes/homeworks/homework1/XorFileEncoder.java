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
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try{
            fin = new FileInputStream(inputFilePath);
            InputStreamReader reader = new InputStreamReader(fin);

            fout = new FileOutputStream(outputFilePath);
            OutputStreamWriter writer = new OutputStreamWriter(fout);

            int data = 0;
            int encodedData = 0;
            int xorKey = 1;

            while((data = reader.read()) != -1) {
                encodedData = data ^ xorKey;
                writer.write(encodedData);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try{
                fin.close();
                fout.close();
            } catch(IOException e){
              e.printStackTrace();
            }
        }
    }
}
