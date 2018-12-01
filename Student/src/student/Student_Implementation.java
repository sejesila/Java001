
package student;

public class Student_Implementation extends Student1
{
    @Override
    public void Profiler()
    {
        if(age>=18)
            System.out.println("Senior Student");
        else
            System.out.println("Junior Student");
            
    }
    
}
