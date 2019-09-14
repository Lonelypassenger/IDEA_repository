package filechannle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:测试int write() 方法时从当前位置进行写入的
 * @DATE:CRETED: IN 16:25 2019/9/7
 * @MODIFY:
 */
public class Test1 {
    public static void main(String[] args)throws IOException ,InterruptedException {
        FileOutputStream fosref = new FileOutputStream(new File("D:\\a.txt"));
        FileChannel fileChannel = fosref.getChannel();
        try{
            ByteBuffer byteBuffer = ByteBuffer.wrap("abcde".getBytes());
            System.out.println("A fileChannel.position = "+fileChannel.position());
            System.out.println("write 1 返回值："+fileChannel.write(byteBuffer));
            System.out.println("B fileChannel.position = "+fileChannel.position());
            fileChannel.position(2);
            System.out.println("C fileChannel.position = "+fileChannel.position());
        }catch (IOException e){
            e.printStackTrace();
        }
        fileChannel.close();
        fosref.close();
    }
}
