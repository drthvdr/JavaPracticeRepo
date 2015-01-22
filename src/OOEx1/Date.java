package OOEx1;

public class Date {
	
	private int month; //instance variable
	private int day;
	private int year;
	
	
	public Date ( int month, int day, int year ) { // constructor
		
		this.month = month;
		this.day = day;
		this.year = year;
		
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if ( month >= 1 && month <= 12) {
			this.month = month;
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		String result;
		result = month + "/" + day + "/" + year;
		return result;
	}

}
