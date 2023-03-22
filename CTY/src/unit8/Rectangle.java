package unit8;

public class Rectangle {
	
	private int length;
	private int width;
	
	/**
	 * @param width of rectangle
	 */
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	/**
	 * @param length of rectangle
	 */
	public void setLength(int length)
	{
		this.length = length;
	}
	
	/**
	 * @return current length of rectangle 
	 */
	public int getLength()
	{
		return length;
	}
	
	/**
	 * @return current width of rectangle 
	 */
	public int getWidth()
	{
		return width;
	}
	
	/**
	 * @return current area of rectangle 
	 */
	public int getArea()
	{
		return length * width;	//Area of Rectangle formula
	}
	
	/**
	 * @return current perimeter of rectangle 
	 */
	public int getPerimeter()
	{
		return (2 * length) + (2 * width);	//Perimeter of Rectangle formula
	}
	
/**
 * Draws a rectangle based on the current dimensions of the rectangle
 */
	public void drawRectangle()
	{
		for(int i = 0; i < width; i++)	//Prints rows of * until the amount of rows of * matches the width of the rectangle
		{
			for(int j = 0; j < length; j++)	//Prints a * until the amount of * matches the length of rectangle
				System.out.print("* ");
			System.out.println();
		}
	}
	
	/**
	 * Default constructor
	 */
	public Rectangle()
	{
		length = 1;
		width = 1;
	}
	
	/**
	 * Constructor
	 * @param l = length of rectangle
	 * @param w = width of rectangle
	 */
	public Rectangle(int l, int w)
	{
		if(l >= 1 && l <= 30 && w >= 1 && w <= 30)
		{
			length = l;
			width = w;
		}
		else	//If length and width are not in range of 1-30, give error
			System.out.print("Error: Out of bounds");
	}

}
