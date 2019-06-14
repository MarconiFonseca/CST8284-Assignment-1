/* Course Name: 19W_CST8284_310  Object Oriented Programming (JAVA)
 Student Name: Marconi Fonseca 040934024
 Assignment title: COMPANY MANAGEMENT TOOL PROTOTYPE
 Assignment due date: 2019-02-11
 */
package company;

import java.util.Calendar;

/*
	Class to set up day, month and year. 
*/

public class OurDate {
	
	private static Calendar calendar = Calendar.getInstance();
	private int day;
		private int month;
	private int year;

	/*
	 * Default Constructor OurDate(),
	 */

	public OurDate() {

		this(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR));

	}

	/*
	 * Initial Constructor OurDate(),
	 */

	public OurDate(int day, int month, int year) {

		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}
	/*
	 * Get methods to access the Day, Month and year
	 */

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	/*
	 * Settlers methods
	 */

	private void setDay(int day) {
		this.day = day;
	}

	private void setMonth(int month) {
		this.month = month;
	}

	private void setYear(int year) {
		this.year = year;
	}

	/*
	 * Overrides
	 */
	@Override
	public String toString() {
		return String.format("%02d", getDay()) + "/" + String.format("%02d", getMonth()) + "/" + getYear();

	}

	@Override

	public boolean equals(Object obj) {
		if (obj.getClass().getName().equals("OurDate")) {
			return false;
		} else {
			OurDate newDate = OurDate.class.cast(obj);

			if (this.getDay() != newDate.getDay() || this.getMonth() != newDate.getMonth()
					|| this.getYear() != newDate.year) {
				return false;
			}
			return true;
		}
	}

}
