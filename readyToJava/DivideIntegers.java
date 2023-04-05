// importing java and other necessity 
import java.awt.*;
import hsa.Console;
public class DivideIntegers

{
    static Console c;
    public static void main ( String [] args )
    {
	c = new Console();
	// Varible declaration 
	int n1;
	int n2;
	int answer;
	String hi;
	 
	// Input section 
	// What is the firsst number and the second number 

	c.print("What is the first number: ");
	n1 = c.readInt();
	c.print("What is the second number: ");
	n2 = c.readInt();
	c.println();
	
	// Proccesing section 
	hi = n1 + " / " + n2;  
	answer = n1 / n2;        
	// Output section 
	       // print of the answer
// print of the answer

	c.println(hi + " = " + answer);
		
    }
}
