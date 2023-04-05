// importing java and other necessity 
import java.awt.*;
import hsa.Console;
public class MixedVarible

{
    static Console c;
    public static void main ( String [] args )
    {
	c = new Console();
	
	// Varible declaration 
	String  name;
	String  color;
	int  age;
	c = new Console();
	
	// Input section 
	//  Input of what is your name
	c.print("What is your name: ");
	name = c.readString();
	
	// input of what is your favourite color 
	c.print("What is your favourite colour: ");
	color = c.readString();
	
	// Input of what is your age
	c.print("What is your age: ");
	age = c.readInt();
	c.println();
	
	// Output section
	c.println("Hi " + name + "! I hear you're " + age + "! " + color + " Rocks!");
	
	
       
    }
}
