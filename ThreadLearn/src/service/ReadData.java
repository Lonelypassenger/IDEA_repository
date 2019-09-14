package service;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 11:02 2019/9/7
 * @MODIFY:
 */
public class ReadData {
    public void readData(PipedReader input){
        try {
            System.out.println("read:");
            char[] bytes = new char[20];
            int readLength = input.read(bytes);
            while (readLength != -1) {
                String newData = new String(bytes, 0, readLength);
                System.out.print(newData);
                readLength = input.read(bytes);
            }
            System.out.println();
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
