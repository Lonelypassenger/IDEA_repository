package io;

import net.mindview.util.Directory;
import net.mindview.util.PPrint;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:展示了如何使用Directory实用工具
 * @DATE:CRETED: IN 15:46 2019/9/3
 * @MODIFY:
 */
public class DirectoryDemo {
    public static void main(String[] args) {
        PPrint.pprint(Directory.walk(".").files);
    }
}
