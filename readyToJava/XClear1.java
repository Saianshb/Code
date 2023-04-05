// importing java and other necessity 
import java.awt.*;
import hsa.Console;
import java.awt.Color;
public class XClear1

{
    static Console c;
    public static void main ( String [] args )
    {
	c = new Console();
	// introducing varibels
	int row, column;
	
	// all of the x's
	c.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	c.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	c.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	c.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	c.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	
	// input of where the want to remove the x
	c.println("Please enter a row number between 1 - 5");
	row = c.readInt();
	c.println("Please enter a column number between 1 - 50");
	column = c.readInt();
	
	// removing the x 
	c.setCursor(row, column);
	c.print(" ");

    }
}
