package array;


import java.util.Random;

public class ArrayNavin {
    
        public static void main(String in[]){
          int[] a= new int[5];
       //   Random r = new Random(50);
          
          for(int i=0; i<a.length; i++)
          {
                    a[i]=i;
          }
       
          for(int i: a)
          {
              System.out.println(i);
          }
          try{
              
           System.out.print(a[51]);
          }
          catch(Exception e){
              System.out.print(e);
          }
            
        }
}
