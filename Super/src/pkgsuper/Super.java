
package pkgsuper;


public class Super 
{

    
    public static void main(String[] args) 
    {
        
		Company a = new Company(); // Company reference and object
		Company b = new eBay(); // Company reference but eBay object
 
		a.address();// runs the method in Company class
		b.address();// Runs the method in eBay class
	}
    }
    

