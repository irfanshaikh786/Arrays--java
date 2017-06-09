package array;

import java.util.Arrays;

public class copymethod {
    public static void main(String in[])
    {
   int[]a={10,20,30,40,50};
   int[] b=Arrays.copyOf(a,a.length);
   for(int i=0;i<b.length;i++)
   {
       System.out.println(b[i]);
   }
   b[2]=50;
   System.out.println(b[2]);
   System.out.println(a[2]);
}
}
