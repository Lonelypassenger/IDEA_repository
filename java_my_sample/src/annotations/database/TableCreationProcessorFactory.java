package annotations.database;
import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;
import com.sun.mirror.util.*;
import java.util.*;
import static com.sun.mirror.util.DeclarationVisitors.*;
/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:使用了访问者模式来创建工厂和注解处理器
 * @DATE:CRETED: IN 14:19 2019/9/3
 * @MODIFY:
 */
public class TableCreationProcessorFactory
        implements AnnotationProcessorFactory {
    public AnnotationProcessor getProcessorFor(
            Set<AnnotationTypeDeclaration> atds,
            AnnotationProcessorEnvironment env) {
        return new TableCreationProcessor(env);
    }
    public Collection<String> supportedAnnotationTypes() {
        return Arrays.asList(
                "annotations.database.DBTable",
                "annotations.database.Constraints",
                "annotations.database.SQLString",
                "annotations.database.SQLInteger");
    }
    public Collection<String> supportedOptions() {
        return Collections.emptySet();
    }
    private static class TableCreationProcessor
            implements AnnotationProcessor {
        private final AnnotationProcessorEnvironment env;
        private String sql = "";
        public TableCreationProcessor(
                AnnotationProcessorEnvironment env) {
            this.env = env;
        }
        /**
        *
        *METHOD_NAME:process()
        *PARAM:
        *RETURN:
        *DATE:14:22 2019/9/3
        *DESCRIPTION:process（）方法只是添加了一个访问者类，并且初始化了SQL字符串
        */
        public void process() {
            for(TypeDeclaration typeDecl :
                    env.getSpecifiedTypeDeclarations()) {
                typeDecl.accept(getDeclarationScanner(
                        new TableCreationVisitor(), NO_OP));
                sql = sql.substring(0, sql.length() - 1) + ");";
                System.out.println("creation SQL is :\n" + sql);
                sql = "";
            }
        }
        private class TableCreationVisitor
                extends SimpleDeclarationVisitor {
            /**
            *
            *METHOD_NAME:visitClassDeclaration
            *PARAM:
            *RETURN:
            *DATE:14:25 2019/9/3
            *DESCRIPTION:该方法中间检查ClassDeclaration对象是否带有DBTable的注解
            */
            public void visitClassDeclaration(
                    ClassDeclaration d) {
                DBTable dbTable = d.getAnnotation(DBTable.class);
                if(dbTable != null) {
                    sql += "CREATE TABLE ";
                    sql += (dbTable.name().length() < 1)
                            ? d.getSimpleName().toUpperCase()
                            : dbTable.name();
                    sql += " (";
                }
            }
            /**
            *
            *METHOD_NAME:visitFieldDeclaration
            *PARAM:
            *RETURN:
            *DATE:14:25 2019/9/3
            *DESCRIPTION:将检查域声明上的注解，从域声明中提取信息的方法和上一张提到的方法是一直的。
            */
            public void visitFieldDeclaration(
                    FieldDeclaration d) {
                String columnName = "";
                if(d.getAnnotation(SQLInteger.class) != null) {
                    SQLInteger sInt = d.getAnnotation(
                            SQLInteger.class);
                    // Use field name if name not specified
                    if(sInt.name().length() < 1)
                        columnName = d.getSimpleName().toUpperCase();
                    else
                        columnName = sInt.name();
                    sql += "\n    " + columnName + " INT" +
                            getConstraints(sInt.constraints()) + ",";
                }
                if(d.getAnnotation(SQLString.class) != null) {
                    SQLString sString = d.getAnnotation(
                            SQLString.class);
                    // Use field name if name not specified.
                    if(sString.name().length() < 1)
                        columnName = d.getSimpleName().toUpperCase();
                    else
                        columnName = sString.name();
                    sql += "\n    " + columnName + " VARCHAR(" +
                            sString.value() + ")" +
                            getConstraints(sString.constraints()) + ",";
                }
            }
            private String getConstraints(Constraints con) {
                String constraints = "";
                if(!con.allowNull())
                    constraints += " NOT NULL";
                if(con.primaryKey())
                    constraints += " PRIMARY KEY";
                if(con.unique())
                    constraints += " UNIQUE";
                return constraints;
            }
        }
    }
} ///:~
