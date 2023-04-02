package unit10;

public class MySubscriber extends Subscriber
{
	public void update()
	{
		System.out.println( "Notified of state change" );
	}
}
