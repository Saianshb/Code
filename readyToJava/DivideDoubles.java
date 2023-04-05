// importing java and other necessity 
import java.awt.*;
import hsa.Console;
public class DivideDoubles

{
    static Console c;
    public static void main ( String [] args )
    {
	c = new Console();
	
	// Varible declaration 
	double n1;
	double n2;
	double answer;
	String hi;
	
	// Input section
	// What is the firsst number and the second number 
	c.print("What is the first number: ");
	n1 = c.readDouble();
	c.print("What is the second number: ");
	n2 = c.readDouble();
	c.println();
	
	
	// Proccesing section 
	//  n1 * n2
	hi = n1 + " / " + n2;  
       answer = n1 / n2;
    
       // output section 
       // print of the answer
	 c.println(hi + " = " + answer);
		
    }
}
