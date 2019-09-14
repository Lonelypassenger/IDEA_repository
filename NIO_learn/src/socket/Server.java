package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 10:36 2019/9/11
 * @MODIFY:
 */
public class Server {
    public static void main(String[] args)throws IOException {
        ServerSocket serverSocket = new ServerSocket(8088);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        int readLength = objectInputStream.readInt();//从对象流当中读取一个32位的Int整数
        byte[] bytes = new byte[readLength];
        objectInputStream.readFully(bytes);
        String getString = new String(bytes,0,readLength);
        System.out.println(getString);
        //输入结束
        //输出开始
        OutputStream outputStream = socket.getOutputStream();
        String srtA = "客服端你好A\n";
        String srtB = "客服端你好B\n";
        String srtC = "客服端你好C\n";

        int  allLength = (srtA+srtB+srtC).getBytes().length;
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeInt(allLength);
        objectOutputStream.flush();

        objectOutputStream.write(srtA.getBytes());
        objectOutputStream.write(srtB.getBytes());
        objectOutputStream.write(srtC.getBytes());
        objectOutputStream.flush();
        //输出结束

        //输入开始
        readLength = objectInputStream.readInt();//从对象流当中读取一个32位的Int整数
        byte[] bytearray = new byte[readLength];
        objectInputStream.readFully(bytearray);
        getString = new String(bytearray,0,readLength);
        System.out.println(getString);
        //输入结束

        inputStream.close();
        socket.close();
        serverSocket.close();

        //输出开始
        String srtD = "客服端你好D\n";
        String srtE = "客服端你好E\n";
        String srtF = "客服端你好F\n";

        allLength = (srtA+srtB+srtC).getBytes().length;

        objectOutputStream.writeInt(allLength);
        objectOutputStream.flush();

        objectOutputStream.write(srtD.getBytes());
        objectOutputStream.write(srtE.getBytes());
        objectOutputStream.write(srtF.getBytes());
        objectOutputStream.flush();
        //输出结束

        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
