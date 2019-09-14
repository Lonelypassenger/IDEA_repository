package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 11:10 2019/9/11
 * @MODIFY:
 */
public class ServerPng {
    public static void main(String[] args)throws IOException {
        byte[] buffer = new byte[2048];
        ServerSocket serverSocket = new ServerSocket(8088);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        int read_length = inputStream.read(buffer);
        FileOutputStream fileOutStream = new FileOutputStream(new File("E:\\Solitaire_copy_MCE.png"));
        while(read_length!=-1){
            fileOutStream.write(buffer);
            read_length = inputStream.read(buffer);
        }
        fileOutStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端结束");
    }
}
