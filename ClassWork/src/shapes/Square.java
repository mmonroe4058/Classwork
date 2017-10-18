package shapes;

public class Square extends Rectangle {
	
    double side;

    public Square(double side)
    {
        super(side,side);
        this.side = side;
    }

    @Override
    public String toString()
    {
    	return "Square Side: " + side + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
    }

}
