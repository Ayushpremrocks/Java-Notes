// exception is the event that occurs during the execution of the program that disrupts the normal flow of the instructions
package i_exceptionHandling;
public class exceptionHandling {
    public static void main (String [] args){
        try{
            int myNum = Integer.parseInt("Ayush"); // when string is input, it shows error, when int is input, no error is shown
            System.out.println("no error");
        }
        catch (Exception e){
            System.out.println("exception caught"); //use to catch the exception
        }
        finally {
            System.out.println("finally blocked called"); //finally block always get called
        }
    }
}
