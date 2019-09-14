package ByteBuffer;

import java.nio.ByteBuffer;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 21:11 2019/9/5
 * @MODIFY:
 */
public class Test2 {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(1900000000);
        for(long i=0;i<1900000000;i++){
            byteBuffer1.put((byte)123);
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
        long time3 = System.currentTimeMillis();
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(1900000000);
        for(long i=0;i<1900000000;i++){
            byteBuffer2.put((byte)123);
        }
        long time4 = System.currentTimeMillis();
        System.out.println(time4-time3);
    }
}
