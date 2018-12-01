
package pkgsuper;


public class eBay extends Company
{
    
    public void address() {
		super.address(); // invokes the super class method
		System.out.println("This is eBay's Address...");
	}
}

