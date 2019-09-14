package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 9:17 2019/9/12
 * @MODIFY:
 */
public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        socket.close();serverSocket.close();
        System.out.println("server end");
    }
}
