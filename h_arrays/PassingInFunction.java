package h_arrays;
import java.util.*;
public class PassingInFunction {
    public static void main(String[] args) {
        int [] a = {1,2,4,5,6};
        System.out.println(Arrays.toString(a));
        passingInFunction(a);
        System.out.println(Arrays.toString(a));
    }

    public static void passingInFunction(int[] array){
        array[2]=3;
        array[3]=4;
        array[4]=5;
    }
}
