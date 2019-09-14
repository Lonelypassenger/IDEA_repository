package test;

import service.ReadData;
import service.WriteData;

import java.io.*;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 12:12 2019/9/7
 * @MODIFY:
 */

class ThreadWrite extends Thread{
    private WriteData writeData;
    private PipedWriter out;
    public ThreadWrite(WriteData writeData,PipedWriter out){
        super();
        this.out = out;
        this.writeData = writeData;
    }

    public void run(){
        writeData.writeMethod(out);
    }
}

class ThreadRead extends Thread{
    private ReadData readData;
    private PipedReader intputStream;
    public ThreadRead(ReadData readData,PipedReader intputStream){
        super();
        this.intputStream = intputStream;
        this.readData =readData ;
    }

    public void run(){
        readData.readData(intputStream);
    }
}

public class Run3 {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedReader intputStream = new PipedReader();
            PipedWriter outputStream = new PipedWriter();
            outputStream.connect(intputStream);
            ThreadRead threadRead = new ThreadRead(readData, intputStream);
            threadRead.start();
            Thread.sleep(2000);
            ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
            threadWrite.start();
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
