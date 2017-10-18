package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */

public class Circle implements Shape{
	
    //fields
    private int radius;
    private static double pi = 3.14;

    /**
     * Constructor method
     * @param radius
     */
    public Circle(int radius){
       //to be implemented by student
    }



    @Override
    public double calculateArea() {
    	return(pi*radius*radius);
    }

    @Override
    public double calculatePerimeter()
    {
    	return(2*pi*radius);
    }

    @Override
    public String toString()
    {
    	return "Cricle Radius:" + radius + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
    }
}
