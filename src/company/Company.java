

/* Course Name: 19W_CST8284_310  Object Oriented Programming (JAVA)
 Student Name: Marconi Fonseca 040934024
 Assignment title: COMPANY MANAGEMENT TOOL PROTOTYPE
 Assignment due date: Feb-11 -2019
 */
package  company;


import java.util.Calendar;
/*
	Declaring class Company  and variables. 
*/
public class Company {
	
	private Employee[] employees;
	private static int numberEmployees;
	private static final int MAXNUMEMPLOYEES =10;


/*
	Represents an abstraction of a Company
*/

public Company() {
	employees = new Employee[MAXNUMEMPLOYEES];
	numberEmployees=0;
	addEmployee("Alvin Spring", 14, new OurDate(02,12,2014), 150000.0);
	addEmployee("Grant Barge ",  21,  new OurDate(18,5,2009),40000.0);
	addEmployee("Ross Chuttle", 23, new OurDate(22,2,2010), 43269.0);
		
}
/*
	Add method - to Add employee data into employees[] array ( name, employeeNumber,startDate,salary)
*/	
	
public void addEmployee(String name, int employeeNumber, OurDate startDate, double salary) {
	employees[numberEmployees] = new Employee(name,employeeNumber,startDate,salary );
	numberEmployees++;
}
/*
	Method to return the current Number of employee
*/
public int currentNumberEmployees() {
	return numberEmployees;
}
/*
	Method to return the max number of employees
*/
public boolean isMaximumEmployees() {
	return currentNumberEmployees()>=MAXNUMEMPLOYEES;
	
}
/*
	Getters  Employee [] 
*/
public Employee[] getEmployees() {
	return employees;
	
}
/*
	Method to find Senior Employee.Using Calendar.getInstance() to compare the dates.   
*/
public Employee findSeniorEmployee() {
	
	Employee findSeniorEmployee = new Employee();
	Calendar findSenior = Calendar.getInstance();
	findSenior.set(findSeniorEmployee.getStartDate().getYear(),findSeniorEmployee.getStartDate().getMonth(),
	findSeniorEmployee.getStartDate().getDay() );

	for(int i = 0; i < currentNumberEmployees(); i++) {
		Calendar employeeDate = Calendar.getInstance();employeeDate.set(employees[i].getStartDate().getYear(), 
		employees[i].getStartDate().getMonth(),employees[i].getStartDate().getDay() );
		if(employeeDate.before(findSenior)) {
			findSeniorEmployee = employees[i];findSenior.set(findSeniorEmployee.getStartDate().getYear(), 
			findSeniorEmployee.getStartDate().getMonth(),findSeniorEmployee.getStartDate().getDay());}
	}

	return findSeniorEmployee;
		
	}
		
}

