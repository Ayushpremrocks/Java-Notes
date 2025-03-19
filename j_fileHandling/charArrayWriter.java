package j_fileHandling;
import java.io.*;
public class charArrayWriter {
    public static void main(String[] args){
        CharArrayWriter caw = new CharArrayWriter();
        try{
            caw.write("Ayush Prem");
            char[] charArray = caw.toCharArray();
            String s = caw.toString();
            System.out.println(s);
            caw.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
