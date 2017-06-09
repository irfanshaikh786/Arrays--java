package array;

import java.util.Scanner;

public class specificindex {
    public static void main(String arg[])
    {
   
      Scanner sn = new Scanner(System.in);
      System.out.println("Enter Size of Array");
      int s =sn.nextInt();
      int[] num = new int[s];
      System.out.println("Enter Elements");
     for(int i=0;i<s;i++)
     {
         num[i]=sn.nextInt();
     }
      System.out.println("Printing all elemts");
      for(int i=0;i<s;i++)
      {
          System.out.println(num[i]);
      }
      
      System.out.println("Eneter Insert Element");
      int insert=sn.nextInt();
      System.out.println("at which opsition (Eneter index number)");
      int pos =sn.nextInt();
      for(int i=s-1;i>pos;i--)
      {
          num[i]=num[i-1];
      }
      num[pos]=insert;
         
       System.out.println("Element inserted Successfully..!!\n");
	   
       System.out.println("Now the New Array is :\n");
       for(int i=0; i<s; i++)
       {
           System.out.print(num[i]+ " ");
       }
  
    }
}
