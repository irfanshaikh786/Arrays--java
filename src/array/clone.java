
package array;

public class clone {
    public static void main(String in[])
    {
        int[] a = {10,20,70,40};
        int[] b =a.clone();
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        b[2]=100;
        System.out.print(a[2]);
    }
}
