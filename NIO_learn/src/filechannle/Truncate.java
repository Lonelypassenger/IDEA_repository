package filechannle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 15:29 2019/9/9
 * @MODIFY:
 */
public class Truncate  {
    private static FileOutputStream fileOutputStream;
    private static FileChannel fileChannel;

    public static void main(String[] args)throws IOException,InterruptedException {
        fileOutputStream =new FileOutputStream(new File("b.txt"));
        fileChannel = fileOutputStream.getChannel();
        fileChannel.write(ByteBuffer.wrap("12345678".getBytes()));
        System.out.println(fileChannel.position()+"  "+fileChannel.size());
        Thread.sleep(10000);
        fileChannel.truncate(4);
        System.out.println(fileChannel.position()+"  "+fileChannel.size());
        fileChannel.close();
        fileOutputStream.close();
    }
}
