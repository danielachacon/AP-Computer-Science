package unit8;

public class TestRectangle	
{
	public static void main(String[] args) 
	{
		Rectangle rect = new Rectangle(5,5);
		Rectangle rect2 = new Rectangle(10,10);
		
		System.out.println("Length is: " + rect.getLength() 
		+ " Width is: " + rect.getWidth()
		+ "\nArea is: " + rect.getArea()
		+ " Perimeter is: " + rect.getPerimeter());
		
		System.out.println("Length is: " + rect2.getLength() 
		+ " Width is: " + rect2.getWidth()
		+ "\nArea is: " + rect2.getArea()
		+ " Perimeter is: " + rect2.getPerimeter());
		
		rect.drawRectangle();
		
		System.out.println("Area is: " + rect.getArea()
						+ " Perimeter is: " + rect.getPerimeter());
		
		rect.setLength(10);
		rect.setWidth(20);
	
		System.out.println("Length is: " + rect.getLength() 
							+ " Width is: " + rect.getWidth()
							+ "\nArea is: " + rect.getArea()
							+ " Perimeter is: " + rect.getPerimeter());
	}
}
