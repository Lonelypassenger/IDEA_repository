package socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 9:18 2019/9/12
 * @MODIFY:
 */
public class client2 {
    public static void main(String[] args)throws IOException {
        Socket socket = new Socket();
        socket.bind(new InetSocketAddress("localhost",7777));
        socket.connect(new InetSocketAddress("localhost",8888));
        System.out.println(socket.getLocalPort());
        System.out.println(socket.getPort());
        socket.close();
        System.out.println("client end");
    }
}
