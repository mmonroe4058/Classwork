package shapes;


public class Parallelogram implements Shape
{
	private double side1;
	private double side2;
	private double angle1;
	private double angle2;

    public Parallelogram(double side1, double side2, double angle1, double angle2) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle1 = angle1;
        this.angle2 = angle2;
    }

    @Override
    public double calculateArea() {
       return(side1*side2*Math.sin(Math.toRadians(angle1)));
    }
    
    @Override
    public double calculatePerimeter() {
        return(2*side1 + 2*side2);
    }

    @Override
    public String toString()
    {
        return "Parallelogram Side1: " + side1 + " Side2: " + side2 + " Angle1: " + angle1 + " Angle2: " + angle2 + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
    }
}
