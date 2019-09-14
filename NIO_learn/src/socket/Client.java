package socket;

import java.io.*;
import java.net.Socket;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 9:33 2019/9/11
 * @MODIFY:
 */
public class Client {
    public static void main(String[] args)throws IOException,InterruptedException{
        Socket socket = new Socket("localhost",8088);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();

        //输出开始
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        String srtA = "服务端你好A\n";
        String srtB = "服务端你好B\n";
        String srtC = "服务端你好C\n";

        int  allLength = (srtA+srtB+srtC).getBytes().length;
        objectOutputStream.writeInt(allLength);
        objectOutputStream.flush();

        objectOutputStream.write(srtA.getBytes());
        objectOutputStream.write(srtB.getBytes());
        objectOutputStream.write(srtC.getBytes());
        objectOutputStream.flush();
        //输出结束


        //输入开始
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
       int readLength = objectInputStream.readInt();//从对象流当中读取一个32位的Int整数
        byte[] bytearray = new byte[readLength];
        objectInputStream.readFully(bytearray);
        String getString = new String(bytearray,0,readLength);
        System.out.println(getString);
        //输入结束



        //输出开始
        srtA = "服务端你好D\n";
       srtB = "服务端你好E\n";
        srtC = "服务端你好F\n";

        allLength = (srtA+srtB+srtC).getBytes().length;
        objectOutputStream.writeInt(allLength);
        objectOutputStream.flush();

        objectOutputStream.write(srtA.getBytes());
        objectOutputStream.write(srtB.getBytes());
        objectOutputStream.write(srtC.getBytes());
        objectOutputStream.flush();
        //输出结束


        //输入开始
        readLength = objectInputStream.readInt();//从对象流当中读取一个32位的Int整数
        byte[] newbytearray = new byte[readLength];
        objectInputStream.readFully(newbytearray);
        getString = new String(newbytearray,0,readLength);
        System.out.println(getString);
        //输入结束
      objectOutputStream.close();
      outputStream.close();
      socket.close();

    }
}
