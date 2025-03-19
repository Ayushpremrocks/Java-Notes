package h_arrays;
import java.util.Scanner;
//fixed size arrays on the basis of memory allocation
public class fixedSizedArrays {
    public static void main(String[] args) {
        String a[]=new String[5];
        Scanner in = new Scanner(System.in);
        System.out.println("enter your array:");
        for(int i=0;i<a.length;i++){
            a[i]=in.next();
        }
        System.out.println("your array is:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        in.close();
    }
}