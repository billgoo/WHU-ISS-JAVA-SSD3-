/**
 * This class contains methods to process arrays of {@link Employee} objects.
 *
 * @author  author name
 * @version  1.0.0
 * @see  Employee
 */
public class  EmployeeArray  {

	/**
	 * Creates an array with three objects of class {@link Employee}.
	 * <p>
	 * The first element of the array is the object
	 * <code>first</code>, the second element of the array is
	 * the object <code>second</code>, and  the third element of the
	 * array is the object <code>third</code>.
	 * </p>
	 *
	 * @param first  a {@link Employee} object.
	 * @param second  a {@link Employee} object.
	 * @param third  a {@link Employee} object.
	 * @return  an array with the objects <code>first</code>,
	 *           <code>second</code>, and <code>third</code>.
	 */
	public static Employee[] makeArray(Employee  first, Employee  second,
	                                   Employee  third)  {


		/* PLACE YOUR CODE HERE */
		Employee[] employees = {first , second , third};

		return employees; // REMOVE; USED SO THIS FILE COMPILES
	}

	/**
	 * Creates a new array from the specified array of {@link Employee}
	 * objects.
	 * <p>
	 * The elements in the new array have the same order as those in
	 * the specified array.
	 * </p>
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @return  a <i>new</i> array of the objects in the specified array.
	 */
	public static Employee[] copyArray(Employee[]  array)  {


		/* PLACE YOUR CODE HERE */

		return array; // REMOVE; USED SO THIS FILE COMPILES
	}


	/**
	 * Returns the {@link Employee} object with the specified ID.
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @param id  an employee ID.
	 * @return  The {@link Employee} object with the specifed
	 *          ID. Returns <code>null</code> if there are no employees
	 *          in the specified array with the specifed ID.
	 */
	public static Employee getEmployee(Employee[]  array, int id)  {


		/* PLACE YOUR CODE HERE */
		for(Employee employee: array){
			if(employee.getId() == id){
				return employee;
			}
		}
		return null; // REMOVE; USED SO THIS FILE COMPILES
	}

	/**
	 * Returns the number of employees whose salary is higher than the specified
	 * dollar amount.
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @param amount  a dollar amount.
	 * @return  the number of employees whose salary is higher than the
	 *          specified dollar amount.
	 */
	public static int countHigherSalaries(Employee[]  array, double amount)  {

		/* PLACE YOUR CODE HERE */
		int count = 0;
		for(Employee employee: array){
			if(employee.getSalary() > amount){
				count++;
			}
		}

		return count; // REMOVE; USED SO THIS FILE COMPILES
	}

	/**
	 * Returns the sum of the salaries of the employees in the specified
	 * array.
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @return  the sum of the salaries of the employees in the specified
	 *          array.
	 */
	public static double sumSalaries(Employee[]  array)  {


		/* PLACE YOUR CODE HERE */
		double sum = 0.0;
		for(Employee employee: array){
			sum += employee.getSalary();
		}

		return sum; // REMOVE; USED SO THIS FILE COMPILES
	}

	/**
	 * Obtains the highest salary in the specified array.
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @return  the highest salary in the specified array.
	 */
	public static double getHighestSalary(Employee[]  array)  {


		/* PLACE YOUR CODE HERE */
		double highestSalary = 0.0;
		for(int i = 0 ; i < array.length ; i++){
			if(highestSalary < array[i].getSalary()){
				highestSalary = array[i].getSalary();
			}
		}

		return highestSalary; // REMOVE; USED SO THIS FILE COMPILES
	}

	/**
	 * Increases the salary of every employee in the specified array by the
	 * specified amount.
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 */
	public static void increaseAll(Employee[] array, double amount)  {


		/* PLACE YOUR CODE HERE */
		for(Employee employee: array){
			employee.setSalary(employee.getSalary()+amount);
		}

	}

	/**
	 * Returns a string representation of the specified
	 * {@link Employee} array.
	 * <p>
	 * Uses the method <code>toString</code> in class <code>Employee</code>
	 * to obtain the string representation of each object in the array.
	 * </p>
	 * A new line character ( \n ) separates the string representations
	 * of each <code>Employee</code> object. For example:
	 * </p>
	 * <pre>
	 * Employee[102,Mary Jones,68250.0]\n
	 * Employee[101,Joe Smith,36000.0]\n
	 * Employee[103,Richard Wong,92175.0]
	 * </pre>
	 * <p>
	 * Note that the string returned does <i>not</i> end with a new line
	 * character (\n).
	 * </p>
	 * <p>
	 * This method assumes that every element in the specified array
	 * contains a valid reference to an <code>Employee</code> object.
	 * </p>
	 *
	 * @param array  an array that contains objects of class {@link Employee}.
	 * @return  the string representation of the specified array
	 */
	public static String displayAll(Employee[]  array)  {


		/* PLACE YOUR CODE HERE */
		String display = "";
		for(int i = 0 ; i < array.length ; i++){
			display += array[i].toString();
			if(i != array.length - 1){
				display += "\n";
			}
		}

		return display; // REMOVE; USED SO THIS FILE COMPILES
	}
}