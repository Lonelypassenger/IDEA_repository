package socket;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 20:05 2019/9/11
 * @MODIFY:
 */
class Kejia{

}
public class Testsss {
    public static void main(String[] args) {
        Class<?> aClass = Kejia.class;
        ClassLoader loader = aClass.getClassLoader();
        System.out.println(loader);
    }

}
