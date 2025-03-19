package g_switch;

import java.util.Scanner;

public class enhancedSwitch{
    public static void main(String[] agrs){
        Scanner x = new Scanner(System.in);
        System.out.println("choose week");
        int week = x.nextInt();
        switch (week) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tue");
            case 3 -> System.out.println("wed");
            case 4 -> System.out.println("thu");
            case 5 -> System.out.println("fri");
            case 6 -> System.out.println("sat");
            case 7 -> System.out.println("sun");
            default -> System.out.println("invalid input");
        }
        x.close();
    }
}