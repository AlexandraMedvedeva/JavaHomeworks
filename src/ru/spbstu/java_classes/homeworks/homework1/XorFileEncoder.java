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
        try{
            File inFile = new File(inputFilePath);
            long inFileSize = inFile.length();

            DataInputStream inStream = new DataInputStream(new BufferedInputStream(new FileInputStream(inputFilePath)));
            DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outputFilePath)));

            /* вопрос: размер файла может быть очень большим, поэтому метод File->length() возвращает long
             * однако массив типа byte в конструтор принемает аргумент только типа int (и Byte тоже, хоть он и динамический=>может выделить сколь угодно много памяти)
             * почему?
            */
            byte inData[] = new byte[(int) inFileSize];
            inStream.readFully(inData);

            byte outData[] = new byte[(int)inFileSize];

            for(int i = 0; i < inFileSize; i++){
                outData[i] = (byte) (inData[i] ^ 1);
            }

            //почему-то не печатает в файл :(
            outStream.write(outData);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
