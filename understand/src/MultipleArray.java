public class MultipleArray {
    public static void main(String[] args) {
        int[][]res=new int[10][];
 for (int i=0;i<10;i++)
     res[i]=new int[i+1];
        for (int[] tmp:res)
        {
            for (int tmp2:tmp)
            {
                System.out.println(tmp2);
            }
        }
        System.out.println("overing-----------------------");
    }
}
