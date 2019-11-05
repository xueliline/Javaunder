import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Ref;

public class Reflectt {
    private String name;
    public void getname()
    {
        System.out.println("你的名字");
    }
    public void geteee()
    {
        System.out.println("你的名字");
    }

    public static void main(String[] args) {
        Reflectt reflectt;
        try {
            Class c=Class.forName("Reflectt");
            c.getName();
            Method []method=c.getDeclaredMethods();
            for (Method method1:method)
            {
                System.out.println(method1.getName());
            }
            Constructor[] field=c.getDeclaredConstructors();
            for (Constructor constructor:field)
            {
             //   System.out.println(constructor.getName());
            }
        }catch (Exception e)
        {
            System.out.println("有异常");
        }
    }
}
