package filechannle;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:53 2019/9/9
 * @MODIFY:
 */
public class readReturn {
    private static FileInputStream fileInputStream ;
    private static FileChannel fileChannel;

    public static void main(String[] args)throws IOException,InterruptedException {
        fileInputStream = new FileInputStream(new File("b.txt"));
        fileChannel = fileInputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(5);
        int read_length=fileChannel.read(byteBuffer);
        System.out.println(read_length);
        System.out.println(byteBuffer.toString());
        read_length=fileChannel.read(byteBuffer);
        System.out.println(read_length);
        byteBuffer.clear();
        read_length=fileChannel.read(byteBuffer);
        System.out.println(read_length);

    }
}
