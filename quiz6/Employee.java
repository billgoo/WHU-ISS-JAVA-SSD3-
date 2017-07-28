/**
 * This class models an employee. The following information is maintained:
 * <ol>
 * <li>the ID of the employee, an <code>int</code></li>
 * <li>the name of the employee, a <code>String</code></li>
 * <li>the salary of the employee, a <code>double</code></li>
 * </ol>
 *
 * @author  iCarnegie
 * @version  1.0.0
 */
public class  Employee {

	/* The ID of the employee */
	private int id;

	/* The name of the employee */
	private String  name;

	/* The salary of the employee */
	private double  salary;

	/**
	 * Creates an employee object with the specified ID, name and salary.
	 *
	 * @param initialId  the ID of the employee.
	 * @param initialName  the name of the employee.
	 * @param initialSalary  the salary of the employee.
	 */
	public Employee(int initialId, String initialName, double initialSalary) {

		this.id = initialId;
		this.name = initialName;
		this.salary = initialSalary;
	}

	/**
	 * Returns the ID of this employee.
	 *
	 * @return  the ID of this employee.
	 */
	public int  getId()  {

		return  this.id;
	}

	/**
	 * Returns the name of this employee.
	 *
	 * @return  the name of this employee.
	 */
	public String  getName()  {

		return  this.name;
	}

	/**
	 * Returns the salary of this employee.
	 *
	 * @return  the salary of this employee.
	 */
	public double  getSalary()  {

		return  this.salary;
	}

	/**
	 * Modifies the salary of this employee.
	 *
	 * @param newSalary  the new salary of this employee.
	 */
	public void  setSalary(double newSalary)  {

		this.salary = newSalary;
	}

	/**
	 * Returns the string representation of this employee in the following
	 * format: Employee[<i>ID</i>,<i>name</i>,<i>salary</i>]
	 *
	 * @return a string representation of this employee.
	 */
	public String  toString()  {

		return "Employee[" + getId() + "," + getName() + "," + getSalary() +"]";
	}
}
