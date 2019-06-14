

/* Course Name: 19W_CST8284_310  Object Oriented Programming (JAVA)
 Student Name: Marconi Fonseca 040934024
 Assignment title: COMPANY MANAGEMENT TOOL PROTOTYPE
 Assignment due date: Feb - 11 -2019 
 */

package company;

import java.util.Scanner;

/*
	Declaring CompanyConsole Class and the respective variables
*/

public class CompanyConsole {

	private static final int ADDEMPLOYEE = 1;
	private static final int DISPLAYEMPLOYEES = 2;
	private static final int DISPLAYSENIOREMPLOYEE = 3;
	private static final int EXIT = 9;
	private Company startUp;
	private Scanner in = new Scanner(System.in);

	/*
	 * Represents an abstraction of a CompanyConsole
	 */

	public CompanyConsole() {
		startUp = new Company();

	}

	/*
	 * Represents the menu of the program.
	 */
	public void menu() {

		int selector;
		// Using 'do' as a statement to building a loop of options.
		do {
			System.out.println("********************************************************");
			System.out.println("1. ADD EMPLOYEE");
			System.out.println("2. DISPLAY EMPLOYEES");
			System.out.println("3. DISPLAY SENIOR EMPLOYEE");
			System.out.println("9. EXIT");
			System.out.println("********************************************************");
			System.out.print("\nSELECTION: ");

			while (!in.hasNextInt())
				System.out.print(in.next() + " is a invalid input, please insert a valid value: ");
				selector = in.nextInt();

			
			//selector = in.nextInt();

			switch (selector) {
			case ADDEMPLOYEE:
				addEmployee();
				break;
			case DISPLAYEMPLOYEES:
				displayEmployees();
				break;
			case DISPLAYSENIOREMPLOYEE:
				displaySeniorEmployee();
				break;
			case EXIT:
				System.out.println("Goodbye");
				break;

			default:
				System.out.println("Select only one of the options available above  ");
			}

		} while (selector != EXIT);

	}
	/*
	  	Represents the method to add employee into the system.
	 */

	private void addEmployee() {
		String name;
		int employeeNumber;
		int year;
		int month;
		int day;
		double salary;

		if (!startUp.isMaximumEmployees()) {

			in.nextLine();
			System.out.println("ENTER NEW EMPLOYEE INFORMATION");

			System.out.print("NAME: ");
			name = in.nextLine();

			System.out.print("EMPLOYEE NUMBER: ");
			employeeNumber = in.nextInt();

			System.out.println("HIRING DATE");
			System.out.print("YEAR: ");
			year = in.nextInt();

			System.out.print("MONTH: ");
			month = in.nextInt();

			System.out.print("DAY: ");
			day = in.nextInt();

			System.out.print("SALARY:");
			salary = in.nextDouble();

			startUp.addEmployee(name, employeeNumber, new OurDate(day, month, year), salary);
		}

		else {
			System.out.println("Employee limit reached");
		}

	}
/*
	Represents the method to display all employees that were inserted into the system. 
*/
	private void displayEmployees() {

		System.out.printf("\nNAME" + "\t\t" + "EMPLOYEE NO." + "\t\t" + "START DATE" + "\t\t" + "SALARY\n");

		for (int i = 0; i < startUp.currentNumberEmployees(); i++) {
			System.out.println(startUp.getEmployees()[i].toString());

		}

	}
/*
	Represents the method to display the oldest  employee
*/
	private void displaySeniorEmployee() {

		System.out.printf("\nNAME" + "\t\t" + "EMPLOYEE NO." + "\t\t" + "START DATE" + "\t\t" + "SALARY\n");

		System.out.println(startUp.findSeniorEmployee().toString());

	}

	
/*
	Represents the Main method
*/

	public static void main(String[] args) {

		CompanyConsole companyConsole = new CompanyConsole();
		companyConsole.menu();

	}

}

