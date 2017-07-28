import  java.io.*;

/**
 * Objects of this class store weather information for a city.
 * The following information is stored.
 * <ol>
 * <li>the city name, a <code>String</code>.</li>
 * <li>the lowest temperature observed, a <code>double</code>.</li>
 * <li>the highest temperature observed, a <code>double</code>.</li>
 * </ol>
 *
 * @author iCarnegie
 * @version  1.0.0
 */
public class Weather  {

	/** name of the city*/
	private String  city;

	/** lowest temperature*/
	private double  lowestTemp;

	/** highest temperature*/
	private double  highestTemp;
	
	/**
	 * Constructs a <code>Weather</code> object.
	 *
	 * @param initialCity  the name of the city.
	 * @param initialLowestTemp  the lowest temperature observed.
	 * @param initialHighestTemp  the highest temperature observed.
	 */
	public Weather (
		String initialCity,
		double initialLowestTemp,
		double initialHighestTemp) {

		this.city = initialCity;
		this.lowestTemp = initialLowestTemp;
		this.highestTemp = initialHighestTemp;
	}

	/**
	 * Obtains the name of the city.
	 *
	 * @return  the name of the city.
	 */
	public String  getCity()  {

		return  this.city;
	}

	/**
	 * Obtains the lowest temperature of the city.
	 *
	 * @return  the lowest temperature of city.
	 */
	public double  getLowestTemp()  {

		return  this.lowestTemp;
	}

	/**
	 * Obtains the highest temperature of the city.
	 *
	 * @return  the highest temperature of city.
	 */
	public double  getHighestTemp()  {

		return  this.highestTemp;
	}

	/**
	 * Returns a {@link String} with the weather info in a XML format
	 *
	 * @return  the newly created {@link String} with the weather info
	 */
	public String  getXML()  {

		/* Line separator */
		String NEW_LINE = System.getProperty("line.separator");

		return  "<city>"
			+ NEW_LINE
			+ "    <name> "+ getCity() + " </name>"
			+ NEW_LINE
			+ "    <lowest_temperature> " + getLowestTemp() 
			+ " </lowest_temperature>"
			+ NEW_LINE
			+ "    <highest_temperature> " + getHighestTemp() 
			+ " </highest_temperature>"
			+ NEW_LINE
			+ "</city>"
			+ NEW_LINE;
	}
}