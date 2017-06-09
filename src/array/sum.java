package array;

import java.util.Scanner;

public class sum {
    public static void main(String[] in)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("How many Element Are You Enter..?");
        int no=sn.nextInt();
        int[] a= new int[no];
        int sum=0;
        int add=0;
        for(int i=0;i<no;i++)
        {
            a[i]=sn.nextInt();
        }
        double avg=0;
   for(int i=0;i<no;i++)
        {
            sum=sum+a[i];
                avg = sum/a.length;
                
        }
        System.out.println(sum);
    
         System.out.println(avg);/*
       System.out.println("Enhanced for loop");
        for(int i : a)
        {
            add=add+i;
           System.out.println(add);
        }*/
         
    }
}
