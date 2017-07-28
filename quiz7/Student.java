/**
 * This class models a student. The following information is maintained:
 * </p>
 * <ol>
 * <li>the ID of the student, an <code>int</code></li>
 * <li>the name of the student, a <code>String</code></li>
 * <li>the grade of the student, an <code>int</code></li>
 * </ol>
 *
 * @author  iCarnegie
 * @version  1.0.0
 */
public class  Student {

	/* the ID of the student */
	private int  id;

	/* the name of the student */
	private String  name;

	/* the grade of the student */
	private int  grade;

	/**
	 * Creates a <code>Student</code> object.
	 *
	 * @param initialId  the ID of the student.
	 * @param initialName  the name of the student.
	 * @param initialGrade  the grade of the student.
	 */
	public Student(int  initialId, String  initialName, int  initialGrade)  {

		this.id = initialId;
		this.name = initialName;
		this.grade = initialGrade;
	}

	/**
	 * Returns the ID of this student.
	 *
	 * @return  the ID of this student.
	 */
	public int  getId()  {

		return  this.id;
	}

	/**
	 * Returns the name of this student.
	 *
	 * @return  the name of this student.
	 */
	public String  getName()  {

		return  this.name;
	}

	/**
	 * Modifies the name of this student.
	 *
	 * @param newName  the new name of this student.
	 */
	public void  setName(String  newName)  {

		this.name = newName;
	}

	/**
	 * Returns the grade of this student.
	 *
	 * @return  the grade of this student.
	 */
	public int  getGrade()  {

		return  this.grade;
	}

	/**
	 * Modifies the grade of this student.
	 *
	 * @param newGrade  the new grade of this student.
	 */
	public void  setGrade(int  newGrade)  {

		this.grade = newGrade;
	}

	/**
	 * Returns <code>true</code> if the ID of this student matches the ID
	 * of the argument.
	 * </p>
	 *
	 * @param  object  the student with which this student will be compared.
	 * @return  <code>true</code> if the ID of this student matches the ID
	 *          of the argument; <code>false</code> otherwise.
	 */
	public boolean  equals(Object  object)  {

		return object instanceof Student
		       && getId() == ((Student) object).getId();
	}

	/**
	 * Returns the string representation of this student in the following
	 * format: Student[<i>ID</i>,<i>name</i>,<i>grade</i>]
	 *
	 * @return a string representation of this object.
	 */
	public String  toString()  {

		return "Student[" + getId() + "," + getName() + "," + getGrade() + "]";
	}
}