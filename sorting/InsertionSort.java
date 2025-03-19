package sorting;
import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort{
    public static void main(String[] args) {
         int [] a = new int [5];
        Scanner input = new Scanner(System.in);
        System.out.println("enter your array");
        for(int i=0;i<a.length;i++){
            a[i]=input.nextInt();
        }
        insertionSort(a);
        System.out.println("array after sorting");
        System.out.println(Arrays.toString(a));
        input.close();
    }

    static void insertionSort(int [] array){
        
    }
}
