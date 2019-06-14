
/* Course Name: 19W_CST8284_310  Object Oriented Programming (JAVA)
 Student Name: Marconi Fonseca 040934024
 Assignment title: COMPANY MANAGEMENT TOOL PROTOTYPE
 Assignment due date: 2019-02-11
 */
package company;

/*
	Class Employee - Declaring variables. 

*/

public class Employee {

	private String name;
	private int employeeNumber;
	private OurDate startDate;
	private double salary;

	/*
	 * Default Constructor
	 */

	public Employee() {
		this("unknown”", -9, new OurDate(), -1);

	}
	/*
	 * Initial Constructor
	 */

	public Employee(String name, int employeeNumber, OurDate startDate, double salary) {

		this.setName(name);
		this.setEmployeeNumber(employeeNumber);
		this.setStartDate(startDate);
		this.setSalary(salary);
	}

	/*
	 * Getters Method
	 */

	public String getName() {
		return name;

	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public OurDate getStartDate() {
		return startDate;
	}

	public double getSalary() {
		return salary;
	}

	// Settlers method
	private void setName(String name) {
		this.name = name;

	}

	private void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;

	}

	private void setStartDate(OurDate startDate) {
		this.startDate = startDate;

	}

	private void setSalary(double salary) {
		this.salary = salary;

	}

	// Overrides
	@Override
	public String toString() {
		return (name + "\t\t" + employeeNumber + "\t\t" + startDate + "\t\t" + salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (obj.getClass().getName().equals("Employee")) {
			return false;
		} else {
			Employee newemployee = Employee.class.cast(obj);

			if ((this.getName().equals(newemployee.getName())
					&& this.getEmployeeNumber() == newemployee.getEmployeeNumber()
					&& this.getStartDate().equals(newemployee.getStartDate())
					&& this.getSalary() == newemployee.getSalary())) {
				return true;
			}
		}
		return false;
	}
}
