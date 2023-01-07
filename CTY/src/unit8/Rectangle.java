package unit8;

public class Rectangle {	//done
	
	private int length;
	private int width;
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setLength(int length)
	{
		this.length = length;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getArea()
	{
		return length * width;
	}
	
	public int getPerimeter()
	{
		return (2 * length) + (2 * width);
	}
	
	public void drawRectangle()
	{
		for(int i = 0; i < width; i++)
		{
			for(int j = 0; j < length; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
	
	public Rectangle()
	{
		length = 1;
		width = 1;
	}
	
	public Rectangle(int l, int w)
	{
		if(l >= 1 && l <= 30 && w >= 1 && w <= 30)
		{
			length = l;
			width = w;
		}
		else
			System.out.print("Error: Out of bounds");
	}

}
