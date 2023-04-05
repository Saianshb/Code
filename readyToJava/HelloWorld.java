import java.awt.*;
import hsa.Console;
public class K
{
    static Console c;
    public static void main (String [] args)
    {
	c = new Console();
	c.println("Hello World");
	c.println("1" , 1);
	c.println(1, 2);
	c.println(2 , 40);
	c.println(2.0/3.0, 10, 1);
	c.println(2 , 2 ,2);
	double cost;
	cost = 29.95;
	c.println("Your price:  $");
	c.println(cost, 0 ,2);
	c.println("1234567890123456789012345678901234567890");
	double n;
	n = 2222.222;
	c.print(n , 10 , 1 );
	c.println(42 ,20);
	double s , w, f ,r;
	s = 2738.32;
	w = 485.858;
	f = 741.238;
	r = 0.7;
	c.println(s - w + f * r , 30 ,3);
	c . println ( " \t ddddddd \n " ) ;
    }
}
