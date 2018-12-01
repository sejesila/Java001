

package linearsearch;


public class Linear extends LinearSearch
        
{
    int linear;

        int size;
        int A[] = {43,45,65,75,46};
        
        int target;

    public void setSize(int size) {
        this.size = size;
    }

    public void setA(int[] A) {
        this.A = A;
    }

    public void setTarget(int target) {
        this.target = target;
    }
    
    public int getLinear()
    {
        
        for(int i=0;i<size-1;i++)
        {
            if(A[i]==target)
            
                return i;
        
        else 
                return -1;
        }
        
        
        return linear;
    }
        
//    public int linear()
//            
//        
//    {
//        
//        return linear;
//    }
    
    
    
}
