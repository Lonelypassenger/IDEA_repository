package test;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.invoke.MethodHandle;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 15:17 2019/9/8
 * @MODIFY:
 */
public class MyObject implements Serializable {
    private static final long serialVersionUID = 888L;
    private static class MyObjectHandler{
        private static final MyObject myObject = new MyObject();
    }
    private MyObject(){}
    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
    protected Object readResolve() throws ObjectStreamException{
        System.out.println("使用了readResolve这个方法");
        return MyObjectHandler.myObject;
    }
}

