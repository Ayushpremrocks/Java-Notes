package i_exceptionHandling;
import java.util.*;
public class example {
    static void workHours(int n) throws Exception{
        if(n<0 || n<40){
            throw new Exception("low work hours, you have worked just "+n+" hours!");
        }else{
            System.out.println("you have worked "+n+" hours!!!");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter no of hours done");
        int hours = input.nextInt();
        try{
            workHours(hours);
        }catch (Exception e){
            System.out.println("exception found"+e.getMessage());
        }finally {
            input.close();
        }
    }
}
