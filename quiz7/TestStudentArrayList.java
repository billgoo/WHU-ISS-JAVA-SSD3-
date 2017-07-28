import java.io.*;
import java.util.*;

/**
 * Test the class <code>StudentArrayList</code>
 *
 * @author iCarnegie
 * @version 1.0.0
 * @see Student
 * @see StudentArrayList
 */
public class  TestStudentArrayList  {

	/* Standard output stream */
	private static PrintWriter  stdOut =
		new  PrintWriter(System.out, true);

	/* Standard error stream */
	private static PrintWriter  stdErr =
		new  PrintWriter(System.err, true);

	/* Variables that contains the test objects */
	private Student  first;
	private Student  second;
	private Student  third;
	private Student  fourth;
	private Student  fifth;
	
	private Student  firstArrayListTwo;
	private Student  secondArrayListTwo;
	private Student  thirdArrayListTwo;
	private Student  fourthArrayListTwo;
	private Student  fifthArrayListTwo;
	
	private ArrayList<Student>  emptyArrayList;
	private ArrayList<Student>  arrayList;
	private ArrayList<Student>  arrayListTwo;

	/**
	 * Tests methods of class {@link StudentArrayList}
	 *
	 * @param args  not used
	 */
	public static void main (String args[]) {

		stdOut.println("");
		stdOut.println("Testing class StudentArrayList...");

		TestStudentArrayList tester = new TestStudentArrayList();

		if (tester.testMakeArrayList() &
			tester.testMakeArrayListFromArray() &
			tester.testHasStudent() &
			tester.testCountGradeGreaterOrEqual() &
			tester.testGetMinGrade() &
			tester.testGetGradeAverage() &
			tester.testRemoveGradeLess() &
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

		if (! condition) {
			stdErr.print("** Test failure ");
			stdErr.println(message);

			return false;
		} else {

			return true;
		}

	}

	/**
	 * Displays a message in the standard error stream.
	 *
	 * @param message  the error message.
	 * @return false
	 */
	public static boolean fail(String message) {

		stdErr.print("** Test failure ");
		stdErr.println(message);

		return false;
	}

	/** Assign the initial value to the test variables */
	private void setUp() {

		first = new Student(10, "First", 100);
		second = new Student(20, "Second", 90);
		third = new Student(30, "Third", 80);
		fourth = new Student(40, "Fourth", 90);

		firstArrayListTwo = new Student(10, "First", 50);
		secondArrayListTwo = new Student(20, "Second", 90);
		thirdArrayListTwo = new Student(30, "Third", 80);
		fourthArrayListTwo = new Student(40, "Fourth", 80);
		fifthArrayListTwo = new Student(50, "Fifth", 90);

		emptyArrayList = new ArrayList<Student>();

		arrayList = new ArrayList<Student>();
		arrayList.add(first);
		arrayList.add(second);
		arrayList.add(third);
		arrayList.add(fourth);

		arrayListTwo = new ArrayList<Student>();
		arrayListTwo.add(firstArrayListTwo);
		arrayListTwo.add(secondArrayListTwo);
		arrayListTwo.add(thirdArrayListTwo);
		arrayListTwo.add(fourthArrayListTwo);
		arrayListTwo.add(fifthArrayListTwo);
	}

	/**
	 * Test the method <code>makeArrayList3</code>
	 *
	 * @return <code>true</code> if all test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testMakeArrayList() {

		setUp();

		boolean test = true;

		ArrayList<Student> result =
			StudentArrayList.makeArrayList(first, second, third);

		test = test && assertTrue("1, testing method makeArrayList",
			result instanceof ArrayList);
		test = test && assertTrue("2, testing method makeArrayList",
			result.size() == 3);
		test = test && assertTrue("3, testing method makeArrayList",
			result.get(0) == first);
		test = test && assertTrue("4, testing method makeArrayList",
			result.get(1) == second);
		test = test && assertTrue("5, testing method makeArrayList",
			result.get(2) == third);

		return test;
	}

	/**
	 * Test the method <code>makeArrayListFromArray</code>
	 *
	 * @return <code>true</code> if all test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testMakeArrayListFromArray() {

		setUp();

		boolean test = true;

		ArrayList<Student> listFromEmptyArray =
			StudentArrayList.makeArrayListFromArray(new Student[0]);

		test = test && assertTrue("1, testing method makeArrayListFromArray",
			listFromEmptyArray instanceof ArrayList);
		test = test && assertTrue("2, testing method makeArrayListFromArray",
			listFromEmptyArray.size() == 0);

		Student array[] = {first, second, third};
		ArrayList<Student> result =
			StudentArrayList.makeArrayListFromArray(array);

		test = test && assertTrue("3, testing method makeArrayListFromArray",
			result instanceof ArrayList);
		test = test && assertTrue("4, testing method makeArrayListFromArray",
			result.size() == 3);
		test = test && assertTrue("5, testing method makeArrayListFromArray",
			result.get(0) == first);
		test = test && assertTrue("6, testing method makeArrayListFromArray",
			result.get(1) == second);
		test = test && assertTrue("7, testing method makeArrayListFromArray",
			result.get(2) == third);

		return test;
	}

	/**
	 * Test the method <code>hasStudent</code>.
	 *
	 * @return <code>true</code> if all test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testHasStudent() {

		setUp();

		boolean test = true;

		test = test && assertTrue("1, testing method hasStudent",
			! StudentArrayList.hasStudent(emptyArrayList, first.getId()));
		test = test && assertTrue("2, testing method hasStudent",
			StudentArrayList.hasStudent(arrayList, first.getId()));
		test = test && assertTrue("3, testing method hasStudent",
			StudentArrayList.hasStudent(arrayList, second.getId()));
		test = test && assertTrue("4, testing method hasStudent",
			StudentArrayList.hasStudent(arrayList, third.getId()));
		test = test && assertTrue("5, testing method hasStudent",
			StudentArrayList.hasStudent(arrayList, fourth.getId()));
		test = test && assertTrue("6, testing method hasStudent",
			! StudentArrayList.hasStudent(arrayList, 555));

		return test;
	}

	/**
	 * Test the method <code>countGradeGreaterOrEqual</code>.
	 *
	 * @return <code>true</code> if all test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testCountGradeGreaterOrEqual() {

		setUp();

		boolean test = true;

		test = test && assertTrue("1, testing method countGradeGreaterOrEqual",
			StudentArrayList.countGradeGreaterOrEqual(arrayList, 50) == 4);

		test = test && assertTrue("2, testing method countGradeGreaterOrEqual",
			StudentArrayList.countGradeGreaterOrEqual(arrayList, 100) == 1);

		return test;
	}

	/**
	 * Test the method <code>getMinGrade</code>.
	 *
	 * @return <code>true</code> if test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testGetMinGrade() {

		setUp();

		boolean test = true;
		
		test = test && assertTrue("1, testing method getMinGrade",
			StudentArrayList.getMinGrade(arrayList) == 80);
			
		test = test && assertTrue("2, testing method getMinGrade",
			StudentArrayList.getMinGrade(arrayListTwo) == 50);
			
		return test;

	}

	/**
	 * Test the method <code>getGradeAverage</code>.
	 *
	 * @return <code>true</code> if test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testGetGradeAverage() {

		setUp();

		return assertTrue("1, testing method getGradeAverage",
			StudentArrayList.getGradeAverage(arrayList) ==
				(first.getGrade() + second.getGrade() + third.getGrade() +
				fourth.getGrade()) / 4.0);
	}

	/**
	 * Test the method <code>removeGradeLess</code>.
	 *
	 * @return <code>true</code> if all test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testRemoveGradeLess() {

		setUp();

		boolean test = true;

		try {

			StudentArrayList.removeGradeLess(emptyArrayList, 100);
			test = test && assertTrue("1, testing method removeGradeLess",
				emptyArrayList.size() == 0);
	
			StudentArrayList.removeGradeLess(arrayList, 90);
			test = test && assertTrue("2, testing method removeGradeLess",
				arrayList.size() == 3);
			test = test && assertTrue("3, testing method removeGradeLess",
				arrayList.get(0) == first);
			test = test && assertTrue("4, testing method removeGradeLess",
				arrayList.get(1) == second);
			test = test && assertTrue("5, testing method removeGradeLess",
				arrayList.get(2) == fourth);
	
			StudentArrayList.removeGradeLess(arrayListTwo, 90);
			test = test && assertTrue("6, testing method removeGradeLess",
				arrayListTwo.size() == 2);
			test = test && assertTrue("7, testing method removeGradeLess",
				arrayListTwo.get(0) == secondArrayListTwo);
			test = test && assertTrue("8, testing method removeGradeLess",
				arrayListTwo.get(1) == fifthArrayListTwo);
		} catch (Exception e) {
			test = fail("9, testing method removeGradeLess: " + e.toString());
		}

		return test;
	}

	/**
	 * Test the method <code>displayAll</code>.
	 *
	 * @return <code>true</code> if test passed; otherwise returns
	 *         <code>false</code>.
	 */
	public boolean testDisplayAll() {

		setUp();

		return assertTrue("1, testing method displayAll",
			StudentArrayList.displayAll(arrayList).equals(
				first.toString() + "\n" + second.toString() + "\n" +
				third.toString() + "\n" + fourth.toString()));
	}
}