package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:使用匿名内部类来实现查询目录下面的文件的方法
 * @DATE:CRETED: IN 15:19 2019/9/3
 * @MODIFY:
 */
public class DirList2 {
    public static FilenameFilter get_FilenameFilter(String regex){
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {

                return pattern.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {
        File path = new File(".");//点代表的应该是当前路径，即相对路径。
        String[] list;
        if(args.length == 0)
            list = path.list();
        else
            list = path.list(get_FilenameFilter(args[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);//按字母进行排序
        for(String dirItem : list)
            System.out.println(dirItem);
    }
}
