package array;

public class copy {

    public static void main(String in[]) {
        int[] a = {10, 20, 30, 40};
        int[] b = a;
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        a[2] = 5;
        System.out.println(b[2]);
        b[3]=2;
        System.out.println(a[3]);

    }
}
