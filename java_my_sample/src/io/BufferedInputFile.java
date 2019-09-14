package io;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 17:12 2019/9/3
 * @MODIFY:
 */
import java.io.*;

public class BufferedInputFile {
    // Throw exceptions to console:
    public static String
    read(String filename) throws IOException {
        // Reading input by lines:
        BufferedReader in = new BufferedReader(
                new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while((s = in.readLine())!= null)
            sb.append(s + "\n");
        in.close();
        return sb.toString();
    }
    public static void main(String[] args)
            throws IOException {
        System.out.print(read("D:\\IDEA_project\\java_my_sample\\src\\io\\BufferedInputFile.java"));
    }
} /* (Execute to see output) *///:~
