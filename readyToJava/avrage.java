import java.awt.*;
import hsa.Console;
public class avrage 

{
    static Console c;
    public static void main ( String [] args)
    {
	c = new Console();
	// Varible Declaration 
       int number;
       int otherNumber;
       double Avrage;
       //Input section one 
       c.println("What is the number; ");
       number = c.readInt();
       // Input sectorn for the other number 
       c.println("What is the other number: ");
       otherNumber = c.readInt();
       // Processing Section 
       // Calculate the avrage of the number
       Avrage = (number + otherNumber) / 2;
       // Output Section 
       // Display of the Avrage
       c.println("The avrage of the number is: " + Avrage);
	
    }
}
