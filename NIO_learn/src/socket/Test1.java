package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.sql.SQLOutput;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 9:30 2019/9/11
 * @MODIFY:
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8088);
        System.out.println("sever 阻塞开始 "+System.currentTimeMillis());
        socket.accept();
        System.out.println("sever 阻塞结束 "+System.currentTimeMillis());
        socket.close();
    }
}
