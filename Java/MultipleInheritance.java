//Java program to calculate Result of a student by using Multiple Inheritance
import java.io.*;
import java.util.*;
interface Sports{
    int sp_marks = 10;
    public void sportsMarks();
}
class Exam{
    int sub1, sub2;
    public void examMarks(){
        System.out.println("\nMarks of Subject 1 : "+sub1+"/100");
        System.out.println("\nMarks of Subject 2 : "+sub2+"/100");
    }
}
class MultipleInheritance extends Exam implements Sports{
    MultipleInheritance(int s1, int s2){   //Parameterized Constructor
        sub1 = s1;
        sub2 = s2;
    }
    public void sportsMarks(){
        System.out.println("\nSports Marks : "+sp_marks);
    }
    public void result(){
        System.out.println("\nResult : "+ (((sub1 + sub2)/2) + sp_marks));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s1, s2;
        System.out.println("\nEnter Marks of Subject 1 : ");
        s1 = sc.nextInt();
        System.out.println("\nEnter Marks of Subject 2 : ");
        s2 = sc.nextInt();
        MultipleInheritance r1 = new MultipleInheritance(s1, s2);
        r1.examMarks();
        r1.sportsMarks();
        r1.result();
    }
}