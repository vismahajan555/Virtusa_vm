// User Defined Exception Example 
class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
        super(str);  
    }  
}  
    
public class TestCustomException1  
{  
  
    static void validate (int age) throws InvalidAgeException{    
       if(age < 18){  
        throw new InvalidAgeException("\nYou are not eligible to vote");    
    }  
       else {   
        System.out.println("\nWelcome to vote");   
        }   
     }    
  
    public static void main(String args[])  
    {  
        try  
        {  
            validate(13);  
        }  
        catch (InvalidAgeException ex)  
        {  
            
            System.out.println("\nException occured: " + ex);  
        }  
    }  
}  