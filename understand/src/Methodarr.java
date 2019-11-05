import java.lang.reflect.Method;

public class Methodarr {
    public String name="shirley";
    Methodarr(String name)
    {
        this.name=name;
    }
public  static  void change(Methodarr methodarr)
{
    methodarr=new Methodarr("222222222");
}
    public static void main(String[] args) {
        Methodarr methodarr=new Methodarr("111111");
        change(methodarr);
        System.out.println("结束-----------------");
    }
}
