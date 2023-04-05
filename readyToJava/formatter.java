// importing java and other necessity 
import java.awt.*;
import hsa.Console;
import java.awt.Color;
public class formatter

{
    static Console c;
    public static void main ( String [] args )
    {
	c = new Console();
	
	// introducing the varibels 
	double number;
	int fieldWidth , decimalPlace;
	
	// input what is the first number
	c.print("What is the number: ");
	number = c.readDouble();
	c.println();
	
	// input of the field width
	c.print("How big is the field width: ");
	fieldWidth = c.readInt();
	c.println();
	
	// input of the decimal place
	c.print("How many decimal places: ");
	decimalPlace = c.readInt();
	c.println();
	
	c.println(number, fieldWidth , decimalPlace);
    }
}
