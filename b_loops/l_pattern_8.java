package b_loops;
import java.util.*;
public class l_pattern_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter no of rows");
        int n = input.nextInt();
        int k = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
        input.close();
    }
}
