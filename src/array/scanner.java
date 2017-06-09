
package array;

import java.util.Scanner;

public class scanner {
    public static void main(String in[])
    {
        Scanner sn = new Scanner(System.in);
  
        System.out.print("Enter Array of Size");
        int n;
        n=sn.nextInt();
             int[] a = new int[n];
             System.out.print("Enter Element in Array");
        
        for(int i=0;i<a.length;i++)
        {
           
            a[i]=sn.nextInt();
        }
        for(int i :a)
        {
            System.out.println("Elements are in Array"+i);
        }
    }
}
