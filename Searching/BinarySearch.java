package Searching;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){
        int [] a = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("enter your array");
        for(int i=0;i<a.length;i++){
            a[i]=input.nextInt();
        }
        System.out.println("enter the element you want to found");
        int x = input.nextInt();
        int soln = binarySearch(a, x);
        System.out.println("element found at index "+ soln);
        input.close();
    }

    static int binarySearch(int [] array, int element){
        int l=0;
        int r=array.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(element==array[mid]){
                return mid;
            }
            else if(element<array[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }   
}