package b_loops;
import java.util.*;
public class e_pattern_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter no of rows");
        int n = input.nextInt();
        System.out.println("enter no of coloums");
        int m = input.nextInt();
        for(int i = 0; i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
