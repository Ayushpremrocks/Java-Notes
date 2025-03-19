package h_arrays;
import java.util.*;
public class arrays {
    public static void main(String[] args){
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("enter your array");
        for(int i=0;i<array.length;i++){
            array[i]=in.nextInt();
        }
        System.out.println("your array is");
        System.out.print(Arrays.toString(array));
        in.close();
    }
    
}
