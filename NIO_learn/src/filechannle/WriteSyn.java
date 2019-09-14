package filechannle;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:测试write类方法具有同步性
 * @DATE:CRETED: IN 14:42 2019/9/9
 * @MODIFY:
 */
public class WriteSyn {
    private static FileOutputStream fileOutputStream;
    private static FileChannel fileChannel;

    public static void main(String[] args) {
        try {
            fileOutputStream = new FileOutputStream(new File("kejia.txt"));
            fileChannel = fileOutputStream.getChannel();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for(int i = 0;i<10;i++){
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        ByteBuffer byteBuffer = ByteBuffer.wrap("abcde\r\n".getBytes());
                        fileChannel.write(byteBuffer);
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            });
            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        ByteBuffer byteBuffer = ByteBuffer.wrap("我是袁可佳\r\n".getBytes());
                        fileChannel.write(byteBuffer);
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            });
            thread1.start();
            thread2.start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            fileChannel.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
