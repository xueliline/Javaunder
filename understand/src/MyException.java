

import java.io.*;

public class MyException  extends Exception{
    public String  info;
    public  MyException(String str)
    {
        this.info=str;
    }
    public static void main(String[] args)  {
        int i=0;
        i=10;
//        File f=new File("test.txt");
        try {
            i=100;
            throw new MyException("自定义异常");
        } catch (NullPointerException w)
        {


        }catch (MyException e)
        { System.out.println("空指针");
            System.out.println(e.info);
        }
        finally {
            System.out.println("ddddddddddddddd");
        }

    }
}
