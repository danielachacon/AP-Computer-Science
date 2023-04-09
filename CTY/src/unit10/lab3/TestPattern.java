package unit10.lab3;

public class TestPattern
{
	public static void main( String [] args )
	{
		// Create Publisher & Subscriber objects
		MySubscriber aSubscriber = new MySubscriber(1);
		MySubscriber bSubscriber = new MySubscriber(2);
		MySubscriber cSubscriber = new MySubscriber(3);

		MyPublisher aPublisher = new MyPublisher(3);

		// Register a Subscriber
		aPublisher.register( aSubscriber );
		aPublisher.register( bSubscriber );
		aPublisher.register( cSubscriber );

		// Increment Publisher object to cause state changes
		aPublisher.increment();
		aPublisher.increment();
		aPublisher.increment();
		aPublisher.increment();
				
		
	}
}
