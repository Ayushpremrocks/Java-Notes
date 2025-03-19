package h_arrays;
import java.util.ArrayList;
import java.util.*;
public class ArrayListJava {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> array_1 = new ArrayList<>();
        ArrayList<Integer> array_2 = new ArrayList<>(n);
        for(int i=n;i>0;i--){
            array_1.add(i);
            array_2.add(i);
        }
        System.out.println(array_1);
        System.out.println(array_2);
        System.out.println(array_1.size()); //to find the size of arraylist
        Collections.sort(array_1); //sorting
        System.out.println(array_1); 
        array_1.set(2,10); //replacing element from a position(index,element)
        System.out.println(array_1);
        array_1.add(3,38); //adding element in a specific position
        System.out.println(array_1);
        array_2.remove(4); //removing element
        System.out.println(array_2);
        in.close();
    }
    
}
