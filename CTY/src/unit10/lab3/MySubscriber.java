package unit10.lab3;

public class MySubscriber extends Subscriber
{
	int subscriberInstance;
	
	public MySubscriber(int subscriberInstance)
	{
		this.subscriberInstance = subscriberInstance;
	}

	public void update()
	{
		System.out.println( "Subscriber " + subscriberInstance + " has been notified." );
	} 
}	

