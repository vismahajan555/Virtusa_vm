import java.time.*;  

public class TestDateTime {  
  public static void main(String[] args) {  
    LocalDate myObj = LocalDate.now();  
    System.out.println("Current Date : "+myObj);
    LocalTime myObj1 = LocalTime.now();  
    System.out.println("Current Time : "+myObj1);
  }  
}  
