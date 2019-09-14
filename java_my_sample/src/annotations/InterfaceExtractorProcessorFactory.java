package annotations;
import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;
import java.util.*;
//apt工具需要一个工厂类来为其知名一个正确的处理器，然后他才能调用处理器上的rocess方法
public class InterfaceExtractorProcessorFactory
        implements AnnotationProcessorFactory {
    /**
    *
    *METHOD_NAME:getProcessorFor
    *PARAM:
    *RETURN:
    *DATE:21:04 2019/9/2
    *DESCRIPTION:该方法返回注解处理器
    */
    public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> atds, AnnotationProcessorEnvironment env) {
        return new InterfaceExtractorProcessor(env);
    }
    /**
    *
    *METHOD_NAME:supportedAnnotationTypes
    *PARAM:
    *RETURN:
    *DATE:21:04 2019/9/2
    *DESCRIPTION:检查该注解是否有相应的处理器
    */
    public Collection<String> supportedAnnotationTypes() {
        return
                Collections.singleton("annotations.ExtractInterface");
    }
    /**
    *
    *METHOD_NAME:
    *PARAM:
    *RETURN:
    *DATE:21:08 2019/9/2
    *DESCRIPTION:
    */
    public Collection<String> supportedOptions() {
        return Collections.emptySet();
    }
} ///:~

