// importing java and other necessity 
import java.awt.*;
import hsa.Console;
public class Echo
{
    static Console c;
    public static void main ( String [] args)
    {
	c = new Console();
	
	// varible Declaration 
	String march;

	// Input Section 
	// type what you need to be displayed
	
	c.println("Type");
	march = c.readLine();
	
	// Output section
	c.println("You typed");
	c.println(march);
    }
}
