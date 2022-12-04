//import java.io.Console;
import java.io.*;
import java.util.*;
import Mathpkg.MathMethods;	//User defined package
class Project1
{ 
 public char Mainch;
 public int Sch,SBch,Ach,Vch;
 String outer_loop_ch;
 
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

 void getMch()throws IOException
 {
 	String ch=br.readLine();
	Mainch=ch.charAt(0);
 }
 
 void string_fun()throws IOException
 {
	do{
 	System.out.println("\t----------String class Methods----------");
	System.out.println();

	System.out.println("1. charAt\t\t2. compareTo");
	System.out.println("3. equals\t\t4. equalsIgnoreCase");
	System.out.println("5. length\t\t6. replace");
	System.out.println("7. startsWith\t\t8. endsWith");
	System.out.println("9. indexOf\t\t10.substring");
	System.out.println("11. lastIndexOf");
	
	System.out.print("Select choice from 1-11 : ");
	Sch=Integer.parseInt(br.readLine());
	if(Sch<1 || Sch>11)
		System.out.println("Invalid Choice !!!");
	else{
	System.out.println("Enter a string");
	String str=br.readLine();
	
	switch(Sch)
	{
	   case 1 :
	           System.out.println("Enter position ");
	           int pos=Integer.parseInt(br.readLine());
	           System.out.println("Character at position "+pos+" is : "+str.charAt(pos));
	            break;
	   case 2 :
		   System.out.println("Enter another string");
		   String tstr=br.readLine();
		   System.out.println(str.compareTo(tstr));
		   if(str.compareTo(tstr) == 0)
			System.out.println("Result is zero, hence "+str+" & "+tstr+" strings are equal");
		   else if(str.compareTo(tstr) >0)
			System.out.println("Result is positive, hence "+str+" string is greater than string "+tstr);
		   else
			System.out.println("Result is negative, hence "+str+" string is less than string "+tstr);
		   break;	
	   case 3 :
		   System.out.println("Enter another string");
		   tstr=br.readLine();
		   System.out.println(str+" and "+tstr+" are equals : "+str.equals(tstr));
		   break;
	   case 4 :
		   System.out.println("Enter another string");
		   tstr=br.readLine();
		   System.out.println(str+" and "+tstr+" are equals by Ignoring case : "+str.equalsIgnoreCase(tstr));
		   break;
	   case 5 :
		   System.out.println("Length of "+str+" is : "+str.length());
		   break;
	   case 6 :
		   System.out.println("You have entered : "+str);
		   System.out.print("Enter old characters of entered string which you want to replace : ");
		   String oldch=br.readLine();
		   System.out.print("Enter new character for replacing them in the entered string : ");
		   String newch=br.readLine();
		   System.out.println(str+" after replacement : "+str.replace(oldch,newch));
		   break;	
	   case 7 :
	           System.out.print("Enter a character to check whether this string starts with the character entered by you : ");
		   oldch=br.readLine();
		   System.out.print(str+" starts with "+oldch+" ? : "+str.startsWith(oldch));
		   break;
	   case 8 :
		   System.out.print("Enter a character to check whether this string ends with the character entered by you : ");
		   oldch=br.readLine();
		   System.out.print(str+" ends with "+oldch+" ? : "+str.endsWith(oldch));
		   break;
	   case 9 :
		   System.out.print("Enter a character of this string to check index of that character : ");
		   oldch=br.readLine();
		   if(str.indexOf(oldch)<0)
			System.out.print("'"+oldch+"' is not present in "+str);
		   else
	           	System.out.println("Index of "+oldch+" : "+str.indexOf(oldch));
		   break;
	   case 10:
		   System.out.println("Enter positions to get substring of "+str);
		   System.out.print("Starting position : ");
		   int start=Integer.parseInt(br.readLine());	
		   System.out.print("Ending position : ");
		   int end=Integer.parseInt(br.readLine());
		   System.out.println("Substring of "+str+" is : "+str.substring(start,end));
		   break;
	   case 11:
		   System.out.print("Enter a character to check its index(first occurence) from last position : ");
	     	   oldch=br.readLine();
		   if(str.indexOf(oldch)<0)
			System.out.print("'"+oldch+"' is not present in "+str);
		   else
		   	System.out.println("Occurenece of "+oldch+" from last position : "+str.lastIndexOf(oldch));
	   	   break;
	}
        }//else block terminated 
	System.out.print("Do you want you use any other method of String Buffer class (y/n) : ");
        outer_loop_ch=br.readLine();	
      }while(outer_loop_ch.equals("Y") || outer_loop_ch.equals("y"));	//Outer do while terminated
 } 

 void string_buffer_fun()throws IOException
 {
  String str1,ch;
  int sbindx,len;
	do{
	System.out.println("\t----------String buffer class Methods----------");
	System.out.println();

	System.out.println("1. append\t\t2. insert");
	System.out.println("3. setLength\t\t4. setCharAt");
	System.out.println("5. reverse");

	System.out.print("Select choice from 1-5 : ");	
	SBch=Integer.parseInt(br.readLine());

	if(SBch<1 || SBch>5)
		System.out.println("Invalid choice !!!");
	else{
	 StringBuffer sb=new StringBuffer("Hello");
	 System.out.println("'"+sb+"' String is created");
	 switch(SBch)
	 {
	  case 1 :
		  System.out.print("Enter a string to append it with Hello :");
		  str1=br.readLine();
		  sb.append(str1);
		  System.out.println("String is appended");
		  System.out.println("Output : "+sb);
		  break;
	  case 2 :
		  System.out.println("Enter index and value to insert in "+sb);
		  System.out.print("Index : ");
		  sbindx=Integer.parseInt(br.readLine());
		  System.out.print("Value : ");
		  ch=br.readLine();
		  sb.insert(sbindx,ch);
		  System.out.println(ch+" inserted at index "+sbindx);
		  System.out.println("Output : "+sb);
		  break;
	  case 3 :
		  System.out.println("Initial Length : "+sb.length());
		  System.out.print("Enter new length : ");
		  len=Integer.parseInt(br.readLine());
		  sb.setLength(len);
		  System.out.println("Current length : "+sb.length());
		  break;
	  case 4 :
		  System.out.println("Enter index and a character to insert in "+sb);
		  System.out.print("Index : ");
		  sbindx=Integer.parseInt(br.readLine());
		  System.out.print("Character : ");
		  ch=br.readLine();
		  char ch1=ch.charAt(0);
		  sb.setCharAt(sbindx,ch1);
		  System.out.println(ch1+" is set at index "+sbindx);
		  System.out.println("Output : "+sb);
		  break;
	  case 5 :
		  System.out.print("Enter a string :");
		  sb=new StringBuffer(br.readLine());
		  System.out.println("String is reversed : "+sb.reverse());		
		  break;
 
	}	
	}//else terminated
        System.out.print("Do you want you use any other method of String Buffer class (y/n) : ");
        outer_loop_ch=br.readLine();	
      }while(outer_loop_ch.equals("Y") || outer_loop_ch.equals("y"));	//Outer do while terminated
 }

 void math_fun()throws IOException
 {
  double n1;
  int num1,num2;

	do{
	System.out.println("\t----------Math Class Methods----------");
	System.out.println();

	System.out.println("1. sin\t\t2. cos");
	System.out.println("3. tan\t\t4. pow");
	System.out.println("5. exp\t\t6. sqrt");
	System.out.println("7. ceil\t\t8. floor");
	System.out.println("9. round\t10. abs");

	System.out.print("Select choice from 1-10 : ");	
	Ach=Integer.parseInt(br.readLine());

	if(Ach<1 || Ach>10)
		System.out.println("Invalid choice !!!");
	else{

	MathMethods m1=new MathMethods();
	System.out.println("Object is created " );
	switch(Ach)
	{
	  case 1 :
		  System.out.println("Enter a number " );
		  n1=Double.parseDouble(br.readLine());
		  m1.sinFun(n1);
		  break;
	  case 2 :
		  System.out.println("Enter a number " );
		  n1=Double.parseDouble(br.readLine());
		  m1.cosFun(n1);
		  break;
	  case 3 :
		  System.out.println("Enter a number " );
		  n1=Double.parseDouble(br.readLine());
		  m1.tanFun(n1);
		  break;
	  case 4 :
		  System.out.println("Enter a base number and its exponent " );
		  System.out.print("Base Number : ");
		  num1=Integer.parseInt(br.readLine());
		  System.out.print("Exponent : ");
		  num2=Integer.parseInt(br.readLine());
		  m1.powFun(num1,num2);
		  break;
	  case 5 :
		  System.out.println("Enter a number " );
		  n1=Double.parseDouble(br.readLine());
		  m1.expFun(n1);
		  break;
	  case 6 :
		  System.out.println("Enter a number " );
		  n1=Double.parseDouble(br.readLine());
		  m1.sqrtFun(n1);
		  break;
	  case 7 :
		  System.out.println("Enter a number " );
		  n1=Double.parseDouble(br.readLine());
		  m1.ceilFun(n1);
		  break;
	  case 8 :
		  System.out.println("Enter a number " );
		  n1=Double.parseDouble(br.readLine());
		  m1.floorFun(n1);
		  break;
	  case 9 :
		  System.out.println("Enter a number " );
		  n1=Double.parseDouble(br.readLine());
		  m1.roundFun(n1);
		  break;
	  case 10:
		  System.out.println("Enter a number " );
		  n1=Double.parseDouble(br.readLine());
		  m1.absFun(n1);
		  break;	  
	}	//switch closed
	}	//else terminated
	System.out.print("Do you want you use any other methods of Math  class (y/n) : ");
        outer_loop_ch=br.readLine();	
      }while(outer_loop_ch.equals("Y") || outer_loop_ch.equals("y"));	//Outer do while terminated
 }

 void vector_fun()throws IOException
 {
	System.out.println("\t----------Vector class Methods----------");
	System.out.println("\t________________________________________");
	System.out.println();
	int i_ele,ele_at;
	String c_ele;
	String s_ele;
	float f_ele;
	String loop_ch;
	//String outer_loop_ch;

	System.out.println("Enter size and increment of vector to create a vector : ");
	  System.out.print("Size : ");
	  int vsize=Integer.parseInt(br.readLine());
	  System.out.print("Increment : ");
	  int vinc=Integer.parseInt(br.readLine());
	  Vector v=new Vector(vsize,vinc);
	  System.out.println("<<<-Vector v is created->>> !!");
	System.out.println();

	do{
	System.out.println("1. addElement\t\t2. capacity");
	System.out.println("3. contains\t\t4. clear");
	System.out.println("5. elementAt\t\t6. firstElement");
	System.out.println("7. lastElement\t\t8. indexOf");
	System.out.println("9. insertElementAt\t10. removeElementAt");
	System.out.println("11. removeElement\t12. size");

	System.out.print("Select choice from 1-13 : ");	
	Vch=Integer.parseInt(br.readLine());
		
	if(Vch<1 || Vch>13)
		System.out.println("Invalid Choice !!!");
	else{
	  

	  System.out.println("Initial Size of vector : "+v.size());
	  System.out.println("Initial Capacity of vector : "+v.capacity());

	switch(Vch)
	{
	  case 1 :
		  System.out.println("Enter type and element to add in vector : ");
		  do{
	 	  System.out.print("Type : ");
		  String typ=br.readLine();
		  System.out.print("Element : ");
		  if(typ.equals("int") || typ.equals("integer"))
		       {i_ele=Integer.parseInt(br.readLine());
			v.addElement(i_ele);
			System.out.println("Element added !!");}
		  else if(typ.equals("char") || typ.equals("character"))
		       {c_ele=br.readLine();
			v.addElement(c_ele);
			System.out.println("Element added !!");}
		  else if(typ.equals("string") || typ.equals("String"))
		       {s_ele=br.readLine();
			v.addElement(s_ele);
			System.out.println("Element added !!");}
		  else if(typ.equals("float") || typ.equals("Float"))
		       {f_ele=Float.parseFloat(br.readLine());
			v.addElement(f_ele);
			System.out.println("Element added !!");}
		  System.out.print("Do you want to add more elements in vector? (y/n) : ");
		  loop_ch=br.readLine();
		  }while(loop_ch.equals("Y") || loop_ch.equals("y"));	
		 break; 
	  case 2 :
		  System.out.println("Current capacity of vector : "+v.capacity());
	   	  break;
	  case 3 :
		  System.out.println("Enter an element & its type to check whether it is present in vector or not : ");
		  System.out.print("Type : ");
		  String typ=br.readLine();
		  System.out.print("Element : ");
		  if(typ.equals("int") || typ.equals("integer"))
		       {i_ele=Integer.parseInt(br.readLine());
			System.out.println("Element "+i_ele+" is present : "+v.contains(i_ele));}
		  else if(typ.equals("char") || typ.equals("character"))
		       {c_ele=br.readLine();
			System.out.println("Element "+c_ele+" is present : "+v.contains(c_ele));}
		  else if(typ.equals("string") || typ.equals("String"))
		       {s_ele=br.readLine();
			System.out.println("Element "+s_ele+" is present : "+v.contains(s_ele));}
		  else if(typ.equals("float") || typ.equals("Float"))
		       {f_ele=Float.parseFloat(br.readLine());
			System.out.println("Element "+f_ele+" is present : "+v.contains(f_ele));}
		  break;
	  case 4 :
		  v.clear();
	  	  System.out.println("All elements of vector are Cleared");
		  System.out.println();
		  System.out.println("Current size of vector : "+v.size());
		  System.out.println("Current capacity of vector : "+v.capacity());
		  break;
	  case 5 :
		  System.out.println("Total elements in vector are : "+v.size());
		  System.out.print("Enter position to get element from that position : ");
		  ele_at=Integer.parseInt(br.readLine());
		  System.out.println("Element at position "+ele_at+" is : "+v.elementAt(ele_at));
		  break;
	  case 6 :
		  System.out.println("First element in vector is : "+v.firstElement());
		  break;
	  case 7 :
		  System.out.println("Last element in vector is : "+v.lastElement());
		  break;
	  case 8 :
		  System.out.println("Elements of vector are : ");
		  for(int i=0;i<v.size();i++)
			System.out.println(v.elementAt(i));
		  System.out.println();
		  System.out.println("Enter type and element which is present in vector to get its index : ");
		  System.out.print("Type : ");
		  typ=br.readLine();
		  System.out.print("Element : ");
		  if(typ.equals("int") || typ.equals("integer"))
		      	{i_ele=Integer.parseInt(br.readLine());
			  System.out.println("Index of "+i_ele+" is : "+v.indexOf(i_ele));}
		  else if(typ.equals("char") || typ.equals("character"))
		        {c_ele=br.readLine();
			  System.out.println("Index of "+c_ele+" is : "+v.indexOf(c_ele));}
		  else if(typ.equals("string") || typ.equals("String"))
		        {s_ele=br.readLine();
			  System.out.println("Index of "+s_ele+" is : "+v.indexOf(s_ele));}
		  else if(typ.equals("float") || typ.equals("Float"))
		        {f_ele=Float.parseFloat(br.readLine());
			  System.out.println("Index of "+f_ele+" is : "+v.indexOf(f_ele));}
		  break;
	  case 9 :
		  System.out.println("Enter type and element and index to which you want to insert an element : ");
		  System.out.print("Index : ");
		  ele_at=Integer.parseInt(br.readLine());
		  System.out.print("Type : ");
		  typ=br.readLine();
		  System.out.print("Element : ");
		  if(typ.equals("int") || typ.equals("integer"))
		      	{i_ele=Integer.parseInt(br.readLine());
			 v.insertElementAt(i_ele,ele_at);
			 System.out.println(i_ele+" is inserted at index "+ele_at+" !! ");}
		  else if(typ.equals("char") || typ.equals("character"))
		        {c_ele=br.readLine();
			 v.insertElementAt(c_ele,ele_at);
			 System.out.println(c_ele+" is inserted at index "+ele_at+" !! ");}
		  else if(typ.equals("string") || typ.equals("String"))
		        {s_ele=br.readLine();
			 v.insertElementAt(s_ele,ele_at);
			 System.out.println(s_ele+" is inserted at index "+ele_at+" !! ");}
		  else if(typ.equals("float") || typ.equals("Float"))
		        {f_ele=Float.parseFloat(br.readLine());
			 v.insertElementAt(f_ele,ele_at);
			 System.out.println(f_ele+" is inserted at index "+ele_at+" !! ");}
		  break;
	  case 10:
		  System.out.println("Enter index of an element to remove element from that index : ");
		  System.out.print("Index : ");
		  ele_at=Integer.parseInt(br.readLine());
		  v.removeElementAt(ele_at);
		  System.out.println("Element is Removed !! ");
		  break;
	  case 11:
		  System.out.println("Enter type and element which you want to remove from vector : ");
		  System.out.print("Type : ");
		  typ=br.readLine();
		  System.out.print("Element : ");
		  if(typ.equals("int") || typ.equals("integer"))
		      	{i_ele=Integer.parseInt(br.readLine());
			  System.out.println("Element "+i_ele+" is removed : "+v.removeElement(i_ele));}
		  else if(typ.equals("char") || typ.equals("character"))
		        {c_ele=br.readLine();
			  System.out.println("Element "+c_ele+" is removed : "+v.removeElement(c_ele));}
		  else if(typ.equals("string") || typ.equals("String"))
		        {s_ele=br.readLine();
			  System.out.println("Element "+s_ele+" is removed : "+v.removeElement(s_ele));}
		  else if(typ.equals("float") || typ.equals("Float"))
		        {f_ele=Float.parseFloat(br.readLine());
			  System.out.println("Element "+f_ele+" is removed : "+v.removeElement(f_ele));}
		  break;
	  case 12:
		  System.out.println("Size of vector v is : "+v.size());
		  break;
		  
	}//Switch
       }//else
       System.out.print("Do you want you use any other method of Vector class (y/n) : ");
       outer_loop_ch=br.readLine();	
      }while(outer_loop_ch.equals("Y") || outer_loop_ch.equals("y"));	//Outer do while terminated
 }
 
 public static void main(String args[])throws IOException
 {
       	Project1 p1=new Project1();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String m_loop_ch="";

	do{
	System.out.println("\t\t<<==========MAIN MENU==========>>");
	System.out.println("\t_____________________________________________");
	
	System.out.println("A.String class Methods\t\tB.String Buffer class Methods");
	System.out.println("C.Arithmetic Functions\t\tD.Vector Methods");
	System.out.println("Enter your choice from A-D");

	try{
	p1.getMch();
	}catch(IOException e){}
	
	if((p1.Mainch=='A') || (p1.Mainch=='a'))
	{

	 try{
		p1.string_fun();
	    }catch(IOException e){}
	}
	else if((p1.Mainch=='B') || (p1.Mainch=='b'))
	{
	 try{
		p1.string_buffer_fun();
	    }catch(IOException e){}
	}
	else if((p1.Mainch=='C') || (p1.Mainch=='c'))
	{
	 try{
		p1.math_fun();
	    }catch(IOException e){}
	}
	else if((p1.Mainch=='D') || (p1.Mainch=='d'))
	{
	 try{
		p1.vector_fun();
	    }catch(IOException e){}
	}
	else
	{
		System.out.println("Invalid Choice !!");
	}
	System.out.println("<<< To go in MAIN MENU enter Y >>>");
	System.out.println("<<< To Exit press 1 >>>");
	try{
		m_loop_ch=br.readLine();
	   }catch(IOException e){}
	
	if(m_loop_ch.equals("1") || m_loop_ch.equals("1"))			
		System.exit(0);

	}while(m_loop_ch.equals("Y") || m_loop_ch.equals("y"));

 }	//Main method terminated
}//End of Class
	
	
	
	/* ***** OutPut ******
	admin1@admin:~$ javac Project1.java
Note: Project1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
admin1@admin:~$ java Project1
		<<==========MAIN MENU==========>>
	_____________________________________________
A.String class Methods		B.String Buffer class Methods
C.Arithmetic Functions		D.Vector Methods
Enter your choice from A-D
d
	----------Vector class Methods----------
	________________________________________

Enter size and increment of vector to create a vector : 
Size : 5
Increment : 3
<<<-Vector v is created->>> !!

1. addElement		2. capacity
3. contains		4. clear
5. elementAt		6. firstElement
7. lastElement		8. indexOf
9. insertElementAt	10. removeElementAt
11. removeElement	12. size
Select choice from 1-13 : 1
Initial Size of vector : 0
Initial Capacity of vector : 5
Enter type and element to add in vector : 
Type : int
Element : 8
Element added !!
Do you want to add more elements in vector? (y/n) : y
Type : string
Element : abcd
Element added !!
Do you want to add more elements in vector? (y/n) : y
Type : n
Element : Do you want to add more elements in vector? (y/n) : n
Do you want you use any other method of Vector class (y/n) : y
1. addElement		2. capacity
3. contains		4. clear
5. elementAt		6. firstElement
7. lastElement		8. indexOf
9. insertElementAt	10. removeElementAt
11. removeElement	12. size
Select choice from 1-13 : 3
Initial Size of vector : 2
Initial Capacity of vector : 5
Enter an element & its type to check whether it is present in vector or not : 
Type : int
Element : 8
Element 8 is present : true
Do you want you use any other method of Vector class (y/n) : n
<<< To go in MAIN MENU enter Y >>>
<<< To Exit press 1 >>>
y
		<<==========MAIN MENU==========>>
	_____________________________________________
A.String class Methods		B.String Buffer class Methods
C.Arithmetic Functions		D.Vector Methods
Enter your choice from A-D
a
	----------String class Methods----------

1. charAt		2. compareTo
3. equals		4. equalsIgnoreCase
5. length		6. replace
7. startsWith		8. endsWith
9. indexOf		10.substring
11. lastIndexOf
Select choice from 1-11 : 5
Enter a string
Sanjivani
Length of Sanjivani is : 9
Do you want you use any other method of String Buffer class (y/n) : n
<<< To go in MAIN MENU enter Y >>>
<<< To Exit press 1 >>>
y
		<<==========MAIN MENU==========>>
	_____________________________________________
A.String class Methods		B.String Buffer class Methods
C.Arithmetic Functions		D.Vector Methods
Enter your choice from A-D
c
	----------Math Class Methods----------

1. sin		2. cos
3. tan		4. pow
5. exp		6. sqrt
7. ceil		8. floor
9. round	10. abs
Select choice from 1-10 : 4
Object is created 
Enter a base number and its exponent 
Base Number : 2
Exponent : 4
2 to the power 4 : 16.0
Do you want you use any other methods of Math  class (y/n) : n
<<< To go in MAIN MENU enter Y >>>
<<< To Exit press 1 >>>
1
admin1@admin:~$ 
*/ 
	
		
