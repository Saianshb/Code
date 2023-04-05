// importing java and other necessity 
import java.awt.*;
import hsa.Console;
public class TipCalculator

{
    static Console c;
    public static void main ( String [] args )
    {
	c = new Console();
	
	// Varible declaration 
	double cost;
	double tip;
	double tax;
	double tipCost;
	double finalCost;

	//Input section 
	// Input what is thw cost of the meal 
	c.print("What is the cost of the meal: ");
	cost = c.readDouble();
   
      
	// Input of what is the tip   
	c.print("What percent would you like to give a tip: ");
	tip = c.readDouble();
	c.println();
	
	// Proccesing section 
	// proccesing the cost of tax and as well as the tip of the meal
	tax = (cost * 13) / 100 ;
	tipCost = (cost * tip) / 100;
	finalCost = tax + tipCost + cost; 
	
	//Output section 
	// Output of the tax and as well as the cost of the meal in totall 
	c.println("****Food Receipt****");
	c.print("The taxes (13%) is $");
	c.println(tax , 1 , 2);
	c.println("The tip (" + tip + ") is $" + tipCost , 2);
	c.print("The total cost is ");
	c.println(finalCost , 6);
		
    }
}
