package sorting;
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){
        int [] a = new int [5];
        Scanner input = new Scanner(System.in);
        System.out.println("enter your array");
        for(int i=0;i<a.length;i++){
            a[i]=input.nextInt();
        }
        bubbleSort(a);
        System.out.println("array after sorting");
        System.out.println(Arrays.toString(a));
        input.close();
    }

    static void bubbleSort(int [] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}
