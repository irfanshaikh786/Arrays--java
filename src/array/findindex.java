package array;

import static array.contains.contains;
import java.util.Scanner;

public class findindex {
    public static int finder(int[] arry,int t)
    {
        if(arry==null)
        {
            return -1;
        }
        int i=0;
        int len=arry.length;
        while(i<len)
        {
            if(arry[i]==t)
            {
                return i;
            }
            else{
                    i=i+1;
            }
            
        }
        return -1;
        
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
        System.out.println("Which index of Number you are find...?");
        int n =sn.nextInt();
        System.out.println(finder(num,n));
        
       
        
   }

}
