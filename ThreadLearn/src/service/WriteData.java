package service;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 10:57 2019/9/7
 * @MODIFY:
 */
public class WriteData {
    public void writeMethod(PipedWriter out){
        try {
            System.out.println("write:");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData);
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
