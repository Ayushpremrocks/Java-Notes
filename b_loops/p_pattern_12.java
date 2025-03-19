package b_loops;
import java.util.*;
public class p_pattern_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = input.nextInt();
        for(int i = 1; i <=n; i++){
            for(int j = n-i;j>=1;j--){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        input.close();
    }
}
