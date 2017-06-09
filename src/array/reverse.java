package array;

import java.util.Scanner;

public class reverse {

    public static void main(String in[]) {
        int i,j,temp,s;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter Size of Array");
       s = sn.nextInt();
        int[] num = new int[s];
        System.out.println("Enter Elemets in Array");
        for (i = 0; i < s; i++) {
            num[i] = sn.nextInt();
        }
       // now j will point to the last element
        j = i - 1;
        i=0; // and i will point to the first element
        while (i < j) {
            temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
            j--;
        }
        System.out.print("Now the Reverse of Array is : \n");
        for (i = 0; i < s; i++) {
            System.out.print(num[i] + "  ");
        }
    }
}
