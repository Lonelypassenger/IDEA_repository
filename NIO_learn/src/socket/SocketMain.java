package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:20 2019/9/11
 * @MODIFY:
 */
class BeginThread extends Thread{
    private Socket socket;
    public BeginThread(Socket socket){
        super();
        this.socket = socket;
    }
    public void run() {

        try {
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            char[] charArray = new char[1000];
            int readLength = inputStreamReader.read(charArray);
            while(readLength!=-1){
                String getString = new String(charArray,0,readLength);
                readLength = inputStreamReader.read(charArray);
                System.out.println(getString);
            }
            inputStreamReader.close();
            inputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class SocketMain {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8088);
        int runTag = 1;
        while (runTag == 1) {
            Socket socket = serverSocket.accept();
            BeginThread beginThread = new BeginThread(socket);
            beginThread.start();
        }
    }

}
