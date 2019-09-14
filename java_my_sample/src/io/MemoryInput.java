package io;

import java.io.IOException;
import java.io.StringReader;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 17:22 2019/9/3
 * @MODIFY:
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("D:\\IDEA_project\\java_my_sample\\src\\io\\MemoryInput.java"));
        int c;
        while((c = in.read())!=-1)
            System.out.println((char)c);
    }
}
