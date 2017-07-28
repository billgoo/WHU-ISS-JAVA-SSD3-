import  java.io.*;

/**
 * Objects of this class store stock information for a company.
 * The following information is stored.
 * <ol>
 * <li>the Dow Jones symbol for the company, a <code>String</code>.</li>
 * <li>the name of the company, a <code>String</code>.</li>
 * <li>the highest price reached during the course of the day,
 *     a <code>double</code></li>
 * <li>the lowest price reached during the course of the day,
 *     a <code>double</code></li>
 * <li>the last trading price recorded when the market closed on the day,
 *     a <code>double</code></li>
 * </ol>
 *
 * @author iCarnegie
 * @version  1.0.0
 */
public class Stock  {

	/** Dow Jones symbol for the company */
	private String  symbol;

	/** the name of the company */
	private String  name;

	/** the highest price reached during the course of the day */
	private double  highestPrice;

	/** the lowest price reached during the course of the day */
	private double  lowestPrice;

	/** the last trading price recorded when the market closed on the day */
	private double  lastPrice; 

	/**
	 * Constructs a <code>Stock</code> object.
	 *
	 * @param initialSymbol  the symbol of the stock.
	 * @param initialName  the name of the company.
	 * @param initialHighestPrice   the highest price of the stock.
	 * @param initialLowestPrice   the lowest price of the stock.
	 * @param initialLastPrice   the close price of the stock.
	 */
	public Stock (
		String initialSymbol,
		String initialName,
		double initialHighestPrice,
		double initialLowestPrice,
		double initialLastPrice) {

		this.symbol = initialSymbol;
		this.name = initialName;
		this.highestPrice = initialHighestPrice;
		this.lowestPrice = initialLowestPrice;
		this.lastPrice = initialLastPrice;
	}

	/**
	 * Obtains the symbol of this stock.
	 *
	 * @return  the symbol of this stock.
	 */
	public String  getSymbol()  {

		return  this.symbol;
	}

	/**
	 * Obtains the name of this stock.
	 *
	 * @return  the name of this stock.
	 */
	public String  getName()  {

		return  this.name;
	}

	/**
	 * Obtains the highest price of the stock.
	 *
	 * @return  the highest price of this stock.
	 */
	public double  getHighestPrice()  {

		return  this.highestPrice;
	}

	/**
	 * Obtains the lowest price of the stock.
	 *
	 * @return  the lowest price of this stock.
	 */
	public double  getLowestPrice()  {

		return  this.lowestPrice;
	}

	/**
	 * Obtains the close price of the stock.
	 *
	 * @return  the close price of this stock.
	 */
	public double  getLastPrice()  {

		return  this.lastPrice;
	}

	/**
	 * Returns a {@link String} with the stock info in a XML format
	 *
	 * @return  the newly created {@link String} with the stock info
	 */
	public String  getXML()  {

		/* Line separator */
		String NEW_LINE = System.getProperty("line.separator");

		return  "<stock>"
			+ NEW_LINE
			+ "    <symbol> "+ getSymbol() + " </symbol>"
			+ NEW_LINE
			+ "    <company_name> "+ getName() + " </company_name>"
			+ NEW_LINE
			+ "    <highest_price> " + getHighestPrice() + " </highest_price>"
			+ NEW_LINE
			+ "    <lowest_price> " + getLowestPrice() + " </lowest_price>"
			+ NEW_LINE
			+ "    <last_price> " + getLastPrice() + " </last_price>"
			+ NEW_LINE
			+ "</stock>"
			+ NEW_LINE;
	}
}
