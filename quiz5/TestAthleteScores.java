import  java.io.*;

/**
 * Test driver for class <code>AthleteScores</code>.
 *
 * @author  author name
 * @version  1.0.0
 */
public class TestAthleteScores  {

	/* Standard output stream */
	private static PrintWriter  stdOut = new  PrintWriter(System.out, true);

	/* Standard error stream */
	private static PrintWriter  stdErr = new  PrintWriter(System.err, true);

	/**
	 * Test driver for class <code>AthleteScores</code>.
	 *
	 * @param args  not used.
	 */
	public static void  main(String[] args)  {
		AthleteScores athleteOne = new AthleteScores("Jordan" , 40 , 30 , 50);
		assertTrue("1: testing method getName()" , athleteOne.getName() == "Jordan");
		assertTrue("2: testing method getScoreOne()" , athleteOne.getScoreOne() == 40);
		assertTrue("3: testing method getScoreTwo()" , athleteOne.getScoreTwo() == 30);
		assertTrue("4: testing method getScoreThree()" , athleteOne.getScoreThree() == 50);
		athleteOne.setScoreOne(20);
		athleteOne.setScoreTwo(40);
		athleteOne.setScoreThree(30);
		assertTrue("5: testing method setScoreOne()" , athleteOne.getScoreOne() == 20);
		assertTrue("6: testing method setScoreTwo()" , athleteOne.getScoreTwo() == 40);
		assertTrue("7: testing method setScoreThree()" , athleteOne.getScoreThree() == 30);
		AthleteScores athleteTwo = new AthleteScores("Kobe" , 30 , 40 , 50);
		assertTrue("8: testing method getMinimum" , athleteTwo.getMinimum() == 30 && athleteTwo.getScoreOne() == 30);
		athleteTwo = new AthleteScores("Kobe" , 40 , 30 , 50);
		assertTrue("9: testing method getMinimum" , athleteTwo.getMinimum() == 30 && athleteTwo.getScoreTwo() == 30);
		athleteTwo = new AthleteScores("Kobe" , 40 , 50 , 30);
		assertTrue("10: testing method getMinimum" , athleteTwo.getMinimum() == 30 && athleteTwo.getScoreThree() == 30);
		AthleteScores athleteThree = new AthleteScores("Jordan" , 30 , 30 , 30);
		assertTrue("11: testing method equals()" , athleteThree.equals(athleteOne));
		assertTrue("12: testing method equals()" , athleteTwo.equals(athleteOne));
		TestAthleteScores athleteFour = new TestAthleteScores();
		assertTrue("13: testing method equals()" , athleteFour.equals(athleteOne));
		String out1 = athleteOne.getName() + "," + athleteOne.getScoreOne() + "," + athleteOne.getScoreTwo()+ "," + athleteOne.getScoreThree();
		String out2 = athleteOne.toString();
		assertTrue("14: testing method equals()" , out1.equals(out2));
		stdOut.println("done");
		/* PLACE YOUR CODE HERE */
	}

	/**
	 * Displays a message in the standard error stream if the value specified
	 * by parameter <code>condition<code> is <code>false</code>.
	 *
	 * @param message  the error message.
	 * @param condition  the test condition.
	 */
	public static void assertTrue(String message, boolean condition) {

		if (! condition) {
			stdErr.print("** Test failure ");
			stdErr.println(message);
		}
	}
}
