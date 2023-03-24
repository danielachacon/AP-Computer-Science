package unit9;

public class DateExercise {

	public static void main(String[] args) 
	{
		Date date = new Date();
		
		date.setMonth(Input.getInt("Enter Month: "));
		date.setDay(Input.getInt("Enter Day: "));
		date.setyear(Input.getInt("Enter Year: "));
		
		date.displayDate();
	}

}
