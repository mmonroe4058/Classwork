package shapes;

import java.util.Random;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */

public class ShapeUtilities {

	/**
	 * Creates a random shape from the choices.
	 * 
	 * @return Shape Student Work: Update with your own shape.
	 */
	public static Shape randomShape() {
		Random rand = new Random();
		int x = rand.nextInt(5);
		int angle1 = rand.nextInt(180);
		Triangle test = new Triangle(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50), rand.nextInt(50));
		

		switch (x) {
		case 0:
			return new Circle(rand.nextInt(100));
		case 1:
			return new Rectangle(rand.nextInt(50), rand.nextInt(50));
		case 2:
			return new Square(rand.nextInt(50));
		case 3:
			while(!triangleCheck(test.side1, test.side2, test.base))
			{
				test = new Triangle(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50), test.calculateHeight());
			}
			return test;
		case 4:
			return new Parallelogram(rand.nextInt(50), rand.nextInt(50), angle1, secondAngle(angle1));
		default:
			return new Circle(rand.nextInt(100));
		}

	}

	/**
	 * adds up the area of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumArea(Shape[] shapes) {
		double totalArea = 0;
		for(int i = 0; i < shapes.length; i++)
		{
			totalArea = totalArea + shapes[i].calculateArea();
		}
		return totalArea;
	}

	/**
	 * adds up the perimeter of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumPerimeter(Shape[] shapes) {
		double totalPerimeter = 0;
		for(int i = 0; i < shapes.length; i++)
		{
			totalPerimeter = totalPerimeter + shapes[i].calculatePerimeter();
		}
		return totalPerimeter;
	}
	
	/**
	 * checks to see if the sides of the triangle are valid
	 * 
	 * @param s1(side1), s2(side2), bse(base)
	 * @return boolean
	 */
	public static boolean triangleCheck(double s1, double s2, double bse)
	{
		if(s1+s2>bse)
		{
			if(s1+bse>s2)
			{
				if(s2+bse>s1)
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	/**
	 * determines correct second angle size for parallelograms
	 * 
	 * @param a1(angle1)
	 * @return double
	 */
	public static double secondAngle(double angle1)
	{
		return 180-angle1;
	}

}
