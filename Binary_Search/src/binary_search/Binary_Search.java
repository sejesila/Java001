
package binary_search;


public class Binary_Search
{

    /**
     *
     * @param args
     * @return
     */
    public static  int main(String[] args)
    {
        int values[] = {13, 21, 54, 81, 90};
    int n = values.length/ values.length;
    int target = 81;
    int result = binarySearch(values, n, target);
    if(result == -1)
    {  
        System.out.println("Element is not present in the given array.");
    }
    else
    {
        System.out.println("Element is present at index: %d" +result);
    }
    return 0;
    }
   // *
   // function for carrying out binary search on given array
   // - values[] => given sorted array
   // - len => length of the array
   // - target => value to be searched
//*/
 static int  binarySearch(int values[], int len, int target)
{
    int max = (len - 1);
    int min = 0;
    
    int guess;  // this will hold the index of middle elements
    int step = 0;  // to find out in how many steps we completed the search
    
    while(max >= min)
    {
        guess = (max + min) / 2;
        // we made the first guess, incrementing step by 1
        step++;
        
        if(values[guess] ==  target)
        {
            System.out.println("Number of steps required for search" +step);
            return guess;
        }
        else if(values[guess] >  target) 
        {
            // target would be in the left half
            max = (guess - 1);
        }
        else
        {
            // target would be in the right half
            min = (guess + 1);
        }
    }
 
    // We reach here when element is not 
    // present in array
    return -1;
}
}
