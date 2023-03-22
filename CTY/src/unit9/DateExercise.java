package unit9;

public class DateExercise {

	public static void main(String[] args) 
	{
		Date date = new Date();
		
		date.setDay(Input.getInt("Enter Day: "));
		date.setMonth(Input.getInt("Enter Month: "));
		date.setyear(Input.getInt("Enter Year: "));
		
		date.displayDate();
	}

}
