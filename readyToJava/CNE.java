import java.awt.*;
import hsa.Console;
public class CNE 

{
    static Console c;
    public static void main ( String [] args)
    {
	c = new Console();
	
	int age;
	
	c.println("What is your age");
	age = c.readInt();
	
	  if (age < 10) {
	    c.println("No fee for the admission");
	} else if (age >= 10 && age <= 18) {
	   c.println("The cost for the admmission is $45");
	} else if (age >= 19 && age <= 64) {
	    c.println("The cost for the admmission is $70");
	} else if (age >= 65) {
	    c.println("The cost for the admmission is  $30");
	}
    }
}
