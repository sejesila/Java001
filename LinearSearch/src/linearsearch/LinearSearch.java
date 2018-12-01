
package linearsearch;
import java.util.*;
public class LinearSearch {

    public static void main(String[] args)
    {
        Linear ln = new Linear();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        ln.setSize(input.nextInt());
        System.out.println("Enter the number to be searched ");
        ln.setTarget(input.nextInt());
        
       
        ln.getLinear();
         
        
       
        
    }
    
}
