package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 9:40 2019/9/11
 * @MODIFY:
 */
public class SimpleServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String getString = "";
        while(!"".equals(getString = bufferedReader.readLine())){
            System.out.println(getString);
        }
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
        outputStream.flush();
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
