package f_questions;
import java.util.Scanner;
public class a_CaseChecker {
    public static void CaseChecker(char word){
        if(word>='a'&& word<='z'){
            System.out.println("lowercase");
        }else if(word>='A' && word<='Z'){
            System.out.println("uppercase");
        }else{
            System.out.println("not an alphabet");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your string");
        char ch = input.next().trim().charAt(0);
        CaseChecker(ch);
        input.close();
    }
}
