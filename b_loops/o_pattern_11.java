package b_loops;
import java.util.*;
public class o_pattern_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = input.nextInt();
        for(int i = 1; i <=n; i++){
            for(int j = n-i;j>=1;j--){
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++){
                System.out.print("*");
            }

            for(int j = i-1; j<n-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        input.close();
    }
}
