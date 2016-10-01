package ru.spbstu.java_classes.homeworks.homework1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public String decode(String inputFilePath){
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(inputFilePath);
            InputStreamReader reader = new InputStreamReader(fin);

            int data = 0;
            int xorKey = 1;
            String decodedData = new String();
            while ((data = reader.read()) != -1) {
                decodedData += data ^ xorKey;
            }
            return decodedData;
        }catch(FileNotFoundException e){
            e.printStackTrace();
            return null;
        }catch(IOException e){
            e.printStackTrace();
            return null;
        }finally {
          try{
              fin.close();
          }catch(IOException e){
              e.printStackTrace();
          }
        }
    }
}
