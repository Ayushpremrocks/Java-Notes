import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            String pos = sc.next();

            long count = 0;
            int j = 0;

            for (int i = 0; i < k; i++) {
                if (pos.charAt(j % n) == 'L') {
                    x -= 1;
                    j++;
                } else if (pos.charAt(j % n) == 'R') {
                    x += 1;
                    j++;
                }
                if (x == 0) {
                    count++;
                    j = 0;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
