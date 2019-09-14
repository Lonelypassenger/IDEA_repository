package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:30 2019/9/11
 * @MODIFY:
 */
public class ClientThread2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",8088);
        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("this is client 2".getBytes());
        outputStream.close();
        socket.close();
    }
}
