public class Final {
    public   final StringBuilder stringBuilder;
    Final()
    {
        stringBuilder=new StringBuilder();
    }
    public void change()
    {
        stringBuilder.append("ddddddddddddddd");
    }
    public static void main(String[] args) {
        Final ff=new Final();
        ff.change();
        ff.change();
        System.out.println("over-----------");

    }
}
