package array;

import static java.lang.System.arraycopy;

public class arraycopy {
    public static void main(String in[])
    {
        int[] a={1,2,3,4,5};
        int[] b=new int[a.length];
        arraycopy(a,0,b,0,a.length);
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        b[2]=40;
        System.out.println(a[2]);
    }
}
