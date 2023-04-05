import java.awt.*;
import hsa.Console;
public class read_a_decimal_number

{
    static Console c;
    public static void main ( String [] args)
    {
    
    c = new Console();
    
    double number;
    
    c.println("Please enter a number");
    number = c.readDouble();
    
    if (number > 0){
	c.println("You entered: " + number);
	c.println("Your number is positive");
    }   
    if (number < 0){
	c.println("You entered: " + number);
	c.println("Your number is negative");
    }
    }
}
