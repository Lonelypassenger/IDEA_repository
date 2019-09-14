package filechannle;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 17:23 2019/9/9
 * @MODIFY:
 */
public class TestMap {
    public static void main(String[] args) throws IOException {
        File file = new File("b.txt");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw");
        FileChannel fileChannelA = randomAccessFile.getChannel();
        MappedByteBuffer buffer = fileChannelA.map(FileChannel.MapMode.READ_ONLY,0,5);
        System.out.println((char)buffer.get()+"position="+buffer.position());
        System.out.println((char)buffer.get()+"position="+buffer.position());
        System.out.println((char)buffer.get()+"position="+buffer.position());
        System.out.println((char)buffer.get()+"position="+buffer.position());
        System.out.println((char)buffer.get()+"position="+buffer.position());
    }
}
