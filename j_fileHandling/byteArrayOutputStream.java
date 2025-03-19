package j_fileHandling;
import java.io.*;
public class byteArrayOutputStream {
    public static void main(String [] args){
        try{
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            String s = "Ayush Prem";
            byte[] bytes = s.getBytes();
            baos.write(bytes);
            byte[] resultArray = baos.toByteArray();
            String resultString = baos.toString();
            System.out.println("Byte String");
            for(byte b: resultArray){
                System.out.print(b+" ");
            }
            System.out.println("\nAs String: "+ resultString);
            baos.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

//ByteArrayOutputStream is an output stream that writes data into a byte array
