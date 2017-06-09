package array;

import java.util.Scanner;

public class contains {
     public static boolean contains(int[] arr,int item)
        {
            for(int i :arr)
            {
                if(item==i)
                {
                    return true;
                }
            }
            return false;
        }

public static void main(String in[])
{
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int no = sn.nextInt();
        System.out.println("Enter Elements");
        int[] num= new int[no];
        for(int i=0;i<no;i++)
        {
            num[i]=sn.nextInt();
        }
        System.out.println("Which Number you are find...?");
        int n =sn.nextInt();
        System.out.println(contains(num,n));
        
   }
}
