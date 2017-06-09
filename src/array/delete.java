package array;

import static array.findindex.finder;
import java.util.Scanner;

public class delete {

    public static void main(String[] arg)
    {
                int count=0;
         Scanner sn = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int no = sn.nextInt();
        System.out.println("Enter Elements");
        int[] num= new int[no];
        for(int i=0;i<no;i++)
        {
            num[i]=sn.nextInt();
        }

        System.out.println("Which Element Are you want to delete...?");
        int del =sn.nextInt();
        
        for(int i=0;i<no;i++)
        {
            if(num[i]==del)
            {
                for(int j=i;j<(no-1);j++)
                {
                    num[j] = num[j+1];
                }
                count++;
                break;
            
          }
        }    
            if(count==0)
            {
                System.out.println("Number are not found in Array");
            }
            else{
                System.out.println("Element are successfuly delete");
                System.out.println("Currents Elemets are");
            }
                for(int k=0;k<no-1;k++)
                {
                    System.out.println(num[k]);
                }
            }
        }
        
    
    

