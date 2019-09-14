package io;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:定义了一个座位list()参数的匿名内部类，是程序变得更小了
 * @DATE:CRETED: IN 15:27 2019/9/3
 * @MODIFY:
 */
import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList3 {
    public static void main(final String[] args) {//由于在匿名内部类中使用了这个参数所以这个参数设置为final类型的
        File path = new File(".");
        String[] list;
        if(args.length == 0)
            list = path.list();
        else
            list = path.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(args[0]);
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list)
            System.out.println(dirItem);
    }
} /* Output:
DirectoryDemo.java
DirList.java
DirList2.java
DirList3.java
*///:~
