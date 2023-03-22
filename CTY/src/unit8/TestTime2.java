package unit8;

public class TestTime2 {

	public static void main(String[] args)
	{
		Time2 testNoParam = new Time2();
		System.out.println("TestNoParam initialization: " + testNoParam.toUniversalString() + ", " + testNoParam.toString() + "\n");
		
		Time2 testHour = new Time2(3);
		System.out.println("TestHour initialization (3): " + testHour.toUniversalString() + ", " + testHour.toString() + "\n");
		
		Time2 testHourMinute = new Time2(3,45);
		System.out.println("TestHourMinute initialization 3:45: " + testHourMinute.toUniversalString() + ", " + testHourMinute.toString() + "\n");
		
		Time2 testObj = new Time2(testHour);
		System.out.println("TestObj initialization (3): " + testObj.toUniversalString() + ", " + testObj.toString() + "\n");
		
		Time2 test = new Time2(3,45,20);
		System.out.println("Test initialization 3:45:20: " + test.toUniversalString() + ", " + test.toString() + "\n");
		
		test.setTime(1, 15, 40);
		System.out.println("Time set to 1:15:40: " + test.toUniversalString() + ", " + test.toString() + "\n");
		test.setHour(17);
		System.out.println("Hour Set to 17: " + test.toUniversalString() + ", " + test.toString() + "\n");
		test.setMinute(50);
		System.out.println("Minute Set to 50: " + test.toUniversalString() + ", " + test.toString() + "\n");
		test.setSecond(0);
		System.out.println("Second Set to 0: " + test.toUniversalString() + ", " + test.toString() + "\n");
		
		System.out.println("Hour: " + test.getHour());
		System.out.println("Minute: " + test.getMinute());
		System.out.println("Second " + test.getSecond());

	}

}
