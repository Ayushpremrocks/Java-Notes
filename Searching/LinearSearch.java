package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        int [] a = new int [5];
        Scanner in = new Scanner(System.in);
        System.out.println("enter your array");
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        System.out.println("enter the element you want to search");
        int x = in.nextInt();
        int soln = linearSearch(a,x);
        System.out.println("element found at index "+ soln);
        in.close();
    }

    public static int linearSearch(int [] array,int element){
        for(int index=0;index<array.length;index++){
            if(array[index]==element){
                return index;
            }
        }
        return -1;
    }
    
}
