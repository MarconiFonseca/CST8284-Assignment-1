package TestCompany;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import company.Employee;
import company.OurDate;

import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	Employee employee;

	/*
	  Method setUpBeforeAll, print Starting Tests!!
	   before every tests.
	 */
		@BeforeAll 
		public static void setUpBeforeAll() {
			System.out.println("Starting Tests!!");
		}

	/*
	 *  Method setUpBeforeEach, Before each tests
	    this method will create a new Employee() 
	    and print Testing case for each test.
	 */
		@BeforeEach
		public void setUpBeforeEach() {
			employee = new Employee();
			
			System.out.println("Testing case");
		}
		
	/*
	  Method tearDownAfterEach, this method
	  will set employee = null after each test.
	 */
		
		@AfterEach() 
		public void tearDownAfterEach() {
			employee = null;
		}

	/* 
	   Method tearDownAfterAll, after all tests
	   this method will print Ending Tests!!.
	 */
		@AfterAll() 
		public static void tearDownAfterAll() {
			System.out.println("Ending Tests!!");
		}

		@Test
		public void testEmployeeEquals() {
			
			Employee  test1 = new Employee("Alvin Spring", 14, new OurDate(02,12,2014), 150000.0);
			Employee  test2 = new Employee("Alvin Spring", 14, new OurDate(02,12,2014), 150000.0);
					
			assert(test1.equals(test2));
			
		}
	
		@Test
		public void testEmployeeNotEquals() {
			
			Employee  test1 = new Employee("Alvin Spring", 14, new OurDate(02,12,2014), 150000.0);
			Employee  test2 = new Employee("Grant Barge ",  21,  new OurDate(18,5,2009),40000.0);
			Employee  test3 = new Employee("Ross Chuttle", 23, new OurDate(22,2,2010), 43269.0);
						
			assertFalse(test1.equals(test2));
			assertFalse(test1.equals(test3));
			assertFalse(test2.equals(test3));
			
		}
		@Test
		
		public 	void testDefaultOurDateConstructor() {
			
			OurDate ourdate = new OurDate();
			Calendar calendar = Calendar.getInstance();
			
			assertNotNull(ourdate);
			assertEquals(calendar.get(Calendar.DATE), ourdate.getDay());
			assertEquals(calendar.get(Calendar.MONTH), ourdate.getMonth());
			assertEquals(calendar.get(Calendar.YEAR), ourdate.getYear());
		}
		@Test
		public 	void testOverloadedOurDateConstructor() {
			
			OurDate ourdate = new OurDate(11,02,2019);
			
			assertNotNull(ourdate);
			assertEquals(11, ourdate.getDay());
			assertEquals(02, ourdate.getMonth());
			assertEquals(2019, ourdate.getYear());
		}


}
