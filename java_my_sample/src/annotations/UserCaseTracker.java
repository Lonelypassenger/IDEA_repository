package annotations;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UserCaseTracker {
    public static void trackUserCase(List<Integer> userCases, Class<?> cl){
        for(Method m : cl.getDeclaredMethods()){
            UseCase uc = m.getAnnotation(UseCase.class);
            if(uc!=null){
                System.out.println("find usecase"+uc.id()+":"+uc.description());
                userCases.remove(new Integer(uc.id()));
            }
        }
        for(int i : userCases){
            System.out.println("warnning missing the usercase "+i);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,47,48,49,50);
        trackUserCase(list,PasswordUtils.class);
    }

}
