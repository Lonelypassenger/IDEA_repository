package filechannle;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.BlockingDeque;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 15:00 2019/9/9
 * @MODIFY:
 */
public class LongWrite {
    private static FileOutputStream fileOutputStream;
    private static FileChannel fileChannel;

    public static void main(String[] args) throws IOException,InterruptedException {
        fileOutputStream = new FileOutputStream("b.txt");
        fileChannel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer1 = ByteBuffer.wrap(" kejia".getBytes());
        byteBuffer1.position(2);
        ByteBuffer byteBuffer2 = ByteBuffer.wrap("yuan ".getBytes());
        byteBuffer2.position(2);
        ByteBuffer[] byteBuffers =  new ByteBuffer[]{byteBuffer1,byteBuffer2};
        fileChannel.write(byteBuffers);
        Thread.sleep(2000);
        fileChannel.close();
        fileOutputStream.close();
    }
}
