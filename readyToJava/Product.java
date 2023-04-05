// importing java and other necessity 
import java.awt.*;
import hsa.Console;
public class Product

{
    static Console c;
    public static void main ( String [] args )
    {
	c = new Console();

	// Varible declaration 
	int n1;
	int n2;
	String hi;
	double answer;

	
	// Input section 
	c.print("What is the number: " );  
	n1 = c.readInt();
	
	c.print("What is the number: " );  
	n2 = c.readInt();
	c.println();
	
	// Proccesing section 
	//  n1 * n2
	hi = n1 + " * " + n2;  
	answer = n1 * n2;
	
	// output section 
       // print of the answer
	 c.println(hi + " = " + answer);
      
		
    }
}
