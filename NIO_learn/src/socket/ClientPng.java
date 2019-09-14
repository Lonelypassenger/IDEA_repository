package socket;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 11:10 2019/9/11
 * @MODIFY:
 */
public class ClientPng {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\SolitaireMCE.png";
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        byte[] bytes = new byte[2048];
        Socket socket = new Socket("localhost",8088);
        OutputStream outputStream = socket.getOutputStream();
        int readLength = fileInputStream.read(bytes);
        while(readLength!=-1){
            outputStream.write(bytes,0,readLength);
            readLength = fileInputStream.read(bytes);
        }
        outputStream.close();
        fileInputStream.close();
        socket.close();
        System.out.println("客户端结束");
    }

}
