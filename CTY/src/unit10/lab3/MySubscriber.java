package unit10.lab3;

public class MySubscriber extends Subscriber
{
	public void update()
	{
		System.out.println( "Notified of state change" );
	}
}
