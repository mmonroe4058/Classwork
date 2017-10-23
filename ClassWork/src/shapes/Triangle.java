package shapes;


public class Triangle implements Shape{

	double side1;
	double side2;
	double base;
	double height;
	
	public Triangle(double side1, double side2, double base, double height)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.base = base;
		this.height = height;
	}
	
	
	public double calculateHeight() {
		return 2*(calculateArea()/base);
	}
	
	@Override
    public double calculateArea() {
       return(.5 * base * height);
    }
	
	@Override
	public double calculatePerimeter() {
		return(side1 + side2 + base);
	}
	
	@Override
    public String toString()
    {
    	return "Triangle Side1: " + side1 + " Side2: " + side2 + " Base: " + base + " Height: " + height + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
    }
	
}
