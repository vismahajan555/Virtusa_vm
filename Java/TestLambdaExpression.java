//Example for Lambda Expression
interface Test{  
    int operation(int a,int b); 
    //public String say(String name);
}  
  
public class TestLambdaExpression{  
    public static void main(String[] args) {  
          
        Test t1 = (a, b) -> (a + b);  
        System.out.println(t1.operation(10, 20));  
          
        Test t2=(int a, int b) -> (a - b);  
        System.out.println(t2.operation(100, 200)); 

       /*Test s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Jeon"));*/
    }  
}  