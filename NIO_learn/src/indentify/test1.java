package indentify;

import java.nio.ByteBuffer;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 20:13 2019/9/5
 * @MODIFY:
 */
public class test1 {
    public static void main(String[] args) {
        try {
            ByteBuffer byteBuffer = ByteBuffer.allocate(-1);
        }catch (IllegalArgumentException e){
            System.out.println("容量不能为负数");
        }
    }
}
