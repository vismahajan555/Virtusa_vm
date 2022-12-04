//Java Collection Framework
import java.util.*;  
class TestJavaCollection1{  
    public static void main(String args[]){  

        //Array List
        System.out.println("\n<-----Array List----->");
        ArrayList <String> list = new ArrayList<String>();
        list.add("Shiv");
        list.add("Onkar");  
        list.add("Mahesh");  
        list.add("Mayur");  
          
        Iterator itr = list.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  

        //LinkedList
        System.out.println("\n<-----Linked List----->");
        LinkedList<String> al = new LinkedList<String>();  
        al.add("Ravi");  
        al.add("Vijay");  
        al.add("Ravi");  
        al.add("Ajay");  
        //Iterator<String> 
        itr = al.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());
        }  

        //Vector
        System.out.println("\n<-----Vector----->");
        Vector<String> v = new Vector<String>();  
        v.add("Ayushi");  
        v.add("Amit");  
        v.add("Astha");  
        v.add("Ashish");  
        //Iterator<String> 
        itr = v.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        } 

        //Stack
        System.out.println("\n<-----Stack----->");
        Stack<String> stack = new Stack<String>();  
        stack.push("Gauri");  
        stack.push("Vaishnavi");  
        stack.push("Anjali");  
        stack.push("Samruddhi");  
        stack.push("Latika");  
        stack.pop();  
        //Iterator<String> 
        itr = stack.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }

        //Priority Queue
        System.out.println("\n<-----Priority Queue----->");
        PriorityQueue<String> queue = new PriorityQueue<String>();  
        queue.add("Taylor Swift");  
        queue.add("Charlie Puth");  
        queue.add("JungKook");  
        queue.add("Kim");  
        System.out.println("head:"+queue.element());  
        System.out.println("head:"+queue.peek());  
        System.out.println("\nQueue elements:");  
        //Iterator 
        itr = queue.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
        queue.remove();  
        queue.poll();  
        System.out.println("After removing two elements:");  
        Iterator<String> itr2 = queue.iterator();  
        while(itr2.hasNext()){  
            System.out.println(itr2.next());  
        } 

        //Set/HashSet
        System.out.println("\n<-----Set (HashSet)----->");
        HashSet<String> set=new HashSet<String>();  
        set.add("Rose");  
        set.add("Lisa");  
        set.add("Nancy");  
        set.add("Tzuyu");  
          
        //Iterator<String> 
        itr = set.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }      
    } 
} 