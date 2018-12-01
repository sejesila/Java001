
package error_check;

import java.util.*;
public class Error_Check {

    
    public static void main(String[] args)
    {
        int a;
        int b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = input.nextInt();
        System.out.println("Enter the value of b");
        b= input.nextInt();
        
       
        try
        {
        c=(double) a/b;
       
         System.out.println("The value of c is "+c) ;
        }
        catch(Exception e)
        {
            System.out.println("Division by zero error occured, Please enter a valid number" +e.getMessage());
             c=0;
        }
        finally 
       
        { // System.out.println("The value of c is ");
        }
        
        //System.out.println("The value of c is " +e.getMessage());
                
        
        
    }
    
}
