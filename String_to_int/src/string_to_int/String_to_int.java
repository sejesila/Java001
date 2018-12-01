
package string_to_int;

import javax.swing.*;
import java.util.*;
public class String_to_int
{

    public static void main(String[] args)
    {
       String inputString;
       int inputNum;
       int result;
       final int FACTOR=10;
      // Scanner input = new Scanner(System.in);
      inputString= JOptionPane.showInputDialog(null, "Enter result");
      inputNum = Integer.parseInt(inputString);
      result = inputNum*FACTOR;
      JOptionPane.showMessageDialog(null,inputNum + "*"+ "FACTOR" + "=" + result);
      
        
    }
    
}
