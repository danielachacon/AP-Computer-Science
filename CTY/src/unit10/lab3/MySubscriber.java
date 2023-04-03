package unit10.lab3;

public class MySubscriber extends Subscriber
{
	public void update(int i)
	{
		System.out.println( "Subscriber " + i + " has been notified of state change" );
	}
}
