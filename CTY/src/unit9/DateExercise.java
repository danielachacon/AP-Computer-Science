package unit9;

public class DateExercise {

	public static void main(String[] args) 
	{
		Date date = new Date();
		Date testDateMonth = new Date(2);
		Date testDateNoParam = new Date();
		Date testDateMonthDay = new Date (2,28);
		Date testDateMonthDayYear = new Date(3,14,2002);
		
		date.setMonth(Input.getInt("Enter Month: "));
		date.setDay(Input.getInt("Enter Day: "));
		date.setyear(Input.getInt("Enter Year: "));
		
		date.displayDate();
		testDateMonth.displayDate();
		testDateNoParam.displayDate();
		testDateMonthDay.displayDate();
		testDateMonthDayYear.displayDate();
	}

}
