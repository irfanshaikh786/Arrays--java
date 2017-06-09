package array;

import java.util.Arrays;
import java.util.Scanner;

public class max_min {
    
    public static void main(String[] in){
        Scanner sn = new Scanner(System.in);
         System.out.println("Enter Size of Array");
        int s=sn.nextInt();
        int[] num = new int[s];
        System.out.println("Enter Elemets in Array");
        for(int i=0;i<s;i++)
        {
            num[i]=sn.nextInt();
        }
       for(int i :num)
       {
           System.out.println(i);
       }
       int large =num[0];
       for(int i=0;i<s;i++)
       {
           if(large<num[i])
           {
               large =num[i];
           }
       }
       System.out.println("Largets Number in Array is"+large);
      int small =num[0];
       for(int i=0 ;i<s;i++)
       {
           if(small > num[i])
           {
               small =num[i];
           }
       }
       System.out.println("Smallest Number in Array is"+small);
    }
}
