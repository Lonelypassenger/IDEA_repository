package test;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 14:52 2019/9/7
 * @MODIFY:
 */
public class RunThreadLocal {
    public static ThreadLocal tl = new ThreadLocal();

    public static void main(String[] args) {
        if(tl.get() == null){
            System.out.println("never put anything");
            tl.set("mykey");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());
    }
}
