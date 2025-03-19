package j_fileHandling;
import java.io.*;
public class charArrayReader {
    public static void main(String[] args){
        String data = "Ayush Prem";
        char[] charArray = data.toCharArray();
        try{
            CharArrayReader car = new CharArrayReader(charArray);
            int i;
            while((i = car.read())!=-1){
                System.out.print((char)i);
            }
            car.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
