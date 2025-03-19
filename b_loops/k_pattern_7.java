package b_loops;
import java.util.*;
public class k_pattern_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter no of rows");
        int n = input.nextInt();
        for(int i = n;i>=1;i--){
            for(int j = i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        input.close();
    }
}
