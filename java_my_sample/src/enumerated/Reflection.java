package enumerated;

import net.mindview.util.OSExecute;
import net.mindview.util.Print.*;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 10:38 2019/9/12
 * @MODIFY:
 */
enum Explore{HERE,THERE}
public class Reflection {
    public static Set<String> analyze(Class<?> enumClazz){
        print("分析："+enumClazz);
        print("接口有：");
        for(Type t: enumClazz.getGenericInterfaces()){
            print(t);
        }
        print("父类: " + enumClazz.getSuperclass());
        print("方法: ");
        Set<String> methods = new TreeSet<String>();
        for(Method m : enumClazz.getMethods())
            methods.add(m.getName());
        print(methods);
        return methods;
    }
    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        print("Explore.containsAll(Enum)? " +
                exploreMethods.containsAll(enumMethods));
        printnb("Explore.removeAll(Enum): ");
        exploreMethods.removeAll(enumMethods);
        print(exploreMethods);
        // Decompile the code for the enum:
        OSExecute.command("javap Explore");
    }
}
