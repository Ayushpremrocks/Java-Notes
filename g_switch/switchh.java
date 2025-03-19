package g_switch;

import java.util.Scanner;

public class switchh{
    public static void main(String[] agrs){
        Scanner x = new Scanner(System.in);
        System.out.println("choose week");
        int week = x.nextInt();
        switch(week){
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tue");
            break;
            case 3:
            System.out.println("wed");
            break;
            case 4:
            System.out.println("thu");
            break;
            case 5:
            System.out.println("fri");
            break;
            case 6:
            System.out.println("sat");
            break;
            case 7:
            System.out.println("sun");
            break;
            default:
            System.out.println("invalid input");
        }
        x.close();
    }
}
