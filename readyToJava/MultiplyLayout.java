// importing java and other necessity 
import java.awt.*;
import hsa.Console;
import java.awt.Color;
public class MultiplyLayout

{
    static Console c;
    public static void main ( String [] args )
    {
	c = new Console();
	 
	// introducing the varibels
	double number1, number2, number3, answer;
	
	// first input of the number one
	c.println("What is the first number");
	number1 = c.readDouble();
	
	// second input of number two
	c.println("What is the second number");
	number2 = c.readDouble();
	
	// third inout of the numebr 3
	c.println("What is the third number");
	number3 = c.readDouble();
	c.println();
	
	// proccessing unit
	answer = number1 * number2 *number3;
	
	//output unit
	c.println(number1, 10, 3);
	c.println(number2, 10, 3);
	c.setCursor(10, 1);
	c.print("X");
	c.println(number3,9,3);
	c.println("---------");
	c.println(answer, 10, 3);
    }
}
