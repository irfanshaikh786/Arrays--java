package array;

import java.util.Scanner;
import java.util.Arrays;
public class trying {

  /*  public static void main(String in[]) {

        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d", a[j][j]);
            }
            System.out.println();
        }
    } */
    public static void main (String[] args){
	    Scanner sn = new Scanner(System.in);
	    System.out.println("How many String You are sort..?");
	    int nm = sn.nextInt();
	    
        String[] name = new String[nm];
        System.out.println("Enter "+nm+" String");
        for(int i=0;i<nm;i++)
        {
            name[i]=sn.next();    
        }
        System.out.print(" How Many  Numeric You Are Sort..?");
        int n = sn.nextInt();
        int[] a = new int[n];
        System.out.println("Enter "+n+" Numbers");
        for(int i=0;i<n;i++)
        {
            a[i]=sn.nextInt();
        }   
   /*     for(String i: name){
            System.out.println(i);
        }
        for(int j : a){
            System.out.println(j);
        } */
   
        System.out.println("Originals String "+Arrays.toString(name));
        Arrays.sort(name);
         System.out.println("Sorted String "+Arrays.toString(name));
        System.out.println("Numbers "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(" Sorted Numbers "+Arrays.toString(a));
        
       
	}
}
