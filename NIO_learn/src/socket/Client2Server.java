package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 9:56 2019/9/11
 * @MODIFY:
 */
public class Client2Server {
    public static void main(String[] args)throws IOException {
        char[] buffer3 = new char[15];
        ServerSocket serverSocket = new ServerSocket(8088);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        int readLength = inputStreamReader.read(buffer3);//每次只读取3个字节出来
        while(readLength!=-1){
            String getString = new String(buffer3,0,readLength);
            System.out.println(getString);
            readLength = inputStreamReader.read(buffer3);
        }
        inputStreamReader.close();
        inputStream.close();socket.close();
        serverSocket.close();
    }
}
