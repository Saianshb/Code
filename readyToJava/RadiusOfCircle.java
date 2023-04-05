import java.awt.*;
import hsa.Console;
public class RadiusOfCircle
{
    static Console c;
    public static void main(String[] args)
    {
    c = new Console();
    
    int radius;
    double areaOfCircle;
    
    c.print ("What is the Radius ");
    radius = c.readInt();
    
    areaOfCircle = 3.14 * radius * radius;
    
    c.println();
    c.print("The area of your circle is ");
    c.print(areaOfCircle);
    }
}
