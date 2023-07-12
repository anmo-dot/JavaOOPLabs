package lab3;

import java.util.Date;

public class Dates {
	int day;
	int month;
	int year;
	
	public Dates(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Dates [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	

}
