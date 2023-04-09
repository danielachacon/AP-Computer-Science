package unit10.lab3;

public class TestPattern
{
	public static void main( String [] args )
	{
		// Create Publisher & Subscriber objects
		MySubscriber aSubscriber = new MySubscriber();
		MySubscriber bSubscriber = new MySubscriber();
		MySubscriber cSubscriber = new MySubscriber();
		MySubscriber dSubscriber = new MySubscriber();
		MyPublisher aPublisher = new MyPublisher( 6 );

		// Register a Subscriber
		aPublisher.register( aSubscriber );
		aPublisher.register( bSubscriber );
		aPublisher.register( cSubscriber );
		aPublisher.register( dSubscriber );

		// Increment Publisher object to cause state changes
		aPublisher.increment();
		aPublisher.increment();
		aPublisher.increment();
		aPublisher.increment();
	}
}
