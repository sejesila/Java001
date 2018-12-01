

package partyclass;


import java.util.*;

public class UseDinnerParty2 
{
    public static void main(String[] args)
    {
        int choice;
        int guests;
        Party aParty = new Party();
        DinnerParty2 aDinnerParty= new DinnerParty2();
       // new DinnerParty2().setGuests(guests);
        
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of guests for the party ");
        guests=input.nextInt();
        aParty.setGuests(guests);
        
        System.out.println("The party has " + aParty.getGuests() + " guests");
        
        aParty.displayInvitation();
        
        System.out.println("Enter number of guests for the dinner party" );
        guests= input.nextInt();
        aDinnerParty.setGuests(guests);
        
        System.out.println("Enter the menu option  -- 1 for chicken or 2 for beef ");
        choice = input.nextInt();
        aDinnerParty.setDinnerChoice(choice);
        System.out.println("The dinner has " + aDinnerParty.getGuests() + " guests");
        System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be served");
        
        aDinnerParty.displayInvitation();
       
        
    }
    
}
