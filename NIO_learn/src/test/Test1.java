package test;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 19:27 2019/9/5
 * @MODIFY:
 */
public class Test1 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1,2,3};
        short[] shortArray = new short[]{1,2,3,4};
        int[] intArray = new int[]{1,2,3,4,5};
        char[] charArray = new char[]{'a','b','c','d'};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        ShortBuffer shortBuffer = ShortBuffer.wrap(shortArray);
        IntBuffer intBuffer = IntBuffer.wrap(intArray);
        CharBuffer charBuffer = CharBuffer.wrap(charArray);
        System.out.println("ByteBuffer = "+byteBuffer.getClass().getName());
        System.out.println("ShortBuffer = "+shortBuffer.getClass().getName());
        System.out.println("IntBuffer = "+intBuffer.getClass().getName());
        System.out.println("CharBuffer = "+charBuffer.getClass().getName());

        System.out.println();

        System.out.println("byteBuffer.capacity() = "+byteBuffer.capacity());
        System.out.println("shortBuffer.capacity() = "+shortBuffer.capacity());
        System.out.println("intBuffer.capacity() = "+intBuffer.capacity());
        System.out.println("charBuffer.capacity() = "+charBuffer.capacity());
    }
}
