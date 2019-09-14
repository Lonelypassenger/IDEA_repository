package mylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 15:18 2019/9/6
 * @MODIFY:
 */
public class MyList {
    volatile private static List list = new ArrayList();
    public static void add(){
        list.add("袁可佳");
    }
    public static int  size(){
        return list.size();
    }
}
