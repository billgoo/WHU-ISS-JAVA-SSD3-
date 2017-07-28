import java.io.*;

/**
 * Tests the class <code>EmployeeArray</code>
 *
 * @author iCarnegie
 * @version 1.0.0
 * @see EmployeeArray
 * @see Employee
 */
public class  TestEmployeeArray  {

	/* Standard output stream */
	private static PrintWriter  stdOut =
		new  PrintWriter(System.out, true);

	/* Standard error stream */
	private static PrintWriter  stdErr =
		new  PrintWriter(System.err, true);

	/* Variables that contains the test objects */
	private Employee  first;
	private Employee  second;
	private Employee  third;
	private Employee  fourth;
	private Employee[]  empty;
	private Employee[]  array;
	private int nonEmployeeId;

	/**
	 * Tests methods of class {@link EmployeeArray}
	 *
	 * @param args  not used
	 */
	public static void main (String args[]) {

		stdOut.println("");
		stdOut.println("Testing class EmployeeArray...");

		TestEmployeeArray tester = new TestEmployeeArray();

		if (tester.testMakeArray() &
			tester.testCopyArray() &
			tester.testGetEmployee() &
			tester.testCountHigherSalaries() &
			tester.testSumSalaries() &
			tester.testGetHighestSalary() &
			tester.testIncreaseAll() &
			tester.testDisplayAll()) {
			stdOut.println("All tests passed");
		}
	}

	/**
	 * Displays a message in the standard error stream if the value specified
	 * by parameter <code>condition<code> is <code>false</code>.
	 *
	 * @param message  the error message.
	 * @param condition  the test condition.
	 * @return the value of <code>condition</code>
	 */
	public static boolean assertTrue(String message, boolean condition) {

		if (!condition) {
			stdErr.print("** Test failure ");
			stdErr.println(message);

			return false;
		} else {

			return true;
		}

	}

	/** Assign the initial value to the test variables */
	private void setUp() {

		first = new Employee(101, "First", 1000.0);
		second = new Employee(102, "Second", 100.0);
		third = new Employee(103, "Third", 1000.0);
		fourth = new Employee(104, "Fourth", 500.0);

		nonEmployeeId = 106;

		empty = new Employee[0];

		array = new Employee[4];
		array[0] = first;
		array[1] = second;
		array[2] = third;
		array[3] = fourth;
	}

	/**
	 * Tests the method <code>makeArray</code>.
	 *
	 * @return <code>true</code> if all test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testMakeArray() {

		setUp();

		boolean test = true;

		Employee[] result =
			EmployeeArray.makeArray(first, second, third);

		test = test && assertTrue("1, testing method makeArray",
			result instanceof Employee[]);
		test = test && assertTrue("2, testing method makeArray",
			result.length == 3);
		test = test && assertTrue("3, testing method makeArray",
			result[0].equals(first));
		test = test && assertTrue("4, testing method makeArray",
			result[1].equals(second));
		test = test && assertTrue("5, testing method makeArray",
			result[2].equals(third));

		return test;
	}

	/**
	 * Tests the method <code>copyArray</code>.
	 *
	 * @return <code>true</code> if all test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testCopyArray() {

		setUp();

		boolean test = true;

		Employee[]  resultEmpty = EmployeeArray.copyArray(empty);

		test = test && assertTrue("1, testing method copyArray",
			resultEmpty instanceof Employee[]);
		test = test && assertTrue("2, testing method copyArray",
			resultEmpty.length == 0);

		Employee resultArray[] = EmployeeArray.copyArray(array);

		test = test && assertTrue("3, testing method copyArray",
			resultArray instanceof Employee[]);
		test = test && assertTrue("4, testing method copyArray",
			resultArray.length == 4);
		test = test && assertTrue("5, testing method copyArray",
			resultArray[0] == first);
		test = test && assertTrue("6, testing method copyArray",
			resultArray[1] == second);
		test = test && assertTrue("7, testing method copyArray",
			resultArray[2] == third);
		test = test && assertTrue("8, testing method copyArray",
			resultArray[3] == fourth);

		return test;
	}

	/**
	 * Tests the method <code>getEmployee</code>.
	 *
	 * @return <code>true</code> if all test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testGetEmployee() {

		setUp();

		boolean test = true;

		test = test && assertTrue("1, testing method getEmployee",
			EmployeeArray.getEmployee(empty, nonEmployeeId) == null);

		Employee employee;
		
		employee = EmployeeArray.getEmployee(array, first.getId());
		test = test && assertTrue("2, testing method getEmployee",
			employee !=null && employee.equals(first));
		employee = EmployeeArray.getEmployee(array, second.getId());
		test = test && assertTrue("3, testing method getEmployee",
			employee !=null && employee.equals(second));
		employee = EmployeeArray.getEmployee(array, third.getId());
		test = test && assertTrue("4, testing method getEmployee",
			employee !=null && employee.equals(third));
		employee = EmployeeArray.getEmployee(array, fourth.getId());
		test = test && assertTrue("5, testing method getEmployee",
			employee !=null && employee.equals(fourth));
		test = test && assertTrue("6, testing method getEmployee",
			EmployeeArray.getEmployee(array, nonEmployeeId) == null);

		return test;
	}

	/**
	 * Tests the method <code>countHigherSalaries</code>.
	 *
	 * @return <code>true</code> if all test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testCountHigherSalaries() {

		setUp();

		boolean test = true;

		test = test && assertTrue("1, testing method countHigherSalaries",
			EmployeeArray.countHigherSalaries(empty, 0.0) == 0);

		test = test && assertTrue("2, testing method countHigherSalaries",
			EmployeeArray.countHigherSalaries(array, 0.0) == 4);
		test = test && assertTrue("3, testing method countHigherSalaries",
			EmployeeArray.countHigherSalaries(array, 100.0) == 3);
		test = test && assertTrue("4, testing method countHigherSalaries",
			EmployeeArray.countHigherSalaries(array, 100000.0) == 0);

		return test;
	}

	/**
	 * Tests the method <code>sumSalaries</code>
	 *
	 * @return <code>true</code> if all test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testSumSalaries() {

		setUp();

		boolean test = true;

		test = test && assertTrue("1, testing method sumSalaries",
			EmployeeArray.sumSalaries(empty) == 0.0);
				
		test = test && assertTrue("2, testing method sumSalaries",
			EmployeeArray.sumSalaries(array) ==
				first.getSalary() + second.getSalary() +
				third.getSalary() + fourth.getSalary());

		return test;
	}

	/**
	 * Tests the method <code>getHighestSalary</code>
	 *
	 * @return <code>true</code> if test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testGetHighestSalary() {

		setUp();

		boolean test = true;

		test = test && assertTrue(
			"1, testing method getHighestSalary",
			EmployeeArray.getHighestSalary(array) == 1000);

		Employee[] arrayTwo = new Employee[5];
		arrayTwo[0] = new Employee(101, "First", 2000.0);
		arrayTwo[1] = new Employee(102, "Second", 100.0);
		arrayTwo[2] = new Employee(103, "Third", 1000.0);
		arrayTwo[3] = new Employee(104, "Fourth", 500.0);
		arrayTwo[4] = new Employee(105, "Fifth",  500.0); 
		
		test = test && assertTrue(
			"2, testing method getHighestSalary",
			EmployeeArray.getHighestSalary(arrayTwo) == 2000);
		
		return test;
	}

	/**
	 * Tests the method <code>increaseAll</code>.
	 *
	 * @return <code>true</code> if all test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testIncreaseAll() {

		setUp();

		boolean test = true;

		double amount = 100.0;
		double salaryFirst = first.getSalary();
		double salarySecond = second.getSalary();
		double salaryThird = third.getSalary();
		double salaryFourth = fourth.getSalary();
		
		EmployeeArray.increaseAll(array, amount);
		test = test && assertTrue("1, testing method increaseAll",
			first.getSalary() == salaryFirst + amount);
		test = test && assertTrue("2, testing method increaseAll",
			second.getSalary() == salarySecond + amount);
		test = test && assertTrue("3, testing method increaseAll",
			third.getSalary() == salaryThird + amount);
		test = test && assertTrue("4, testing method increaseAll",
			fourth.getSalary() == salaryFourth + amount);

		return test;
	}

	/**
	 * Tests the method <code>displayAll</code>.
	 *
	 * @return <code>true</code> if all test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testDisplayAll() {

		setUp();

		boolean test = true;
		
		test = test && assertTrue("1, testing method displayAll",
			EmployeeArray.displayAll(empty).equals(""));

		String result = EmployeeArray.displayAll(array);
		
		test = test && assertTrue("2, testing method displayAll",
			EmployeeArray.displayAll(array).equals(
				first.toString() + "\n" + second.toString() + "\n" +
				third.toString() + "\n" + fourth.toString()));

		return test;
	}
}