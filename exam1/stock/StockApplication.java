import  java.io.*;
import  java.util.*;

/* DOCUMENT THIS CLASS */
public class StockApplication  {

	/* Standard input stream */
	private static BufferedReader  stdIn =
		new  BufferedReader(new  InputStreamReader(System.in));

	/* Standard output stream */
	private static PrintWriter  stdOut =
		new  PrintWriter(System.out, true);

	/* Standard error stream */
	private static PrintWriter  stdErr =
		new  PrintWriter(System.err, true);

	/* DOCUMENT THIS PUBLIC METHOD */
	public static void main(String[]  args) throws IOException  {

		Stock stock = readStock();

		stdOut.println(stock.getXML());
	}

	/* DOCUMENT THIS PUBLIC METHOD */
	public static Stock readStock() throws IOException {

		/* Delimiter of stock data */
		final String DELIM = "_";

		String symbol = "";
		String name = "";
		double highestPrice = 0.0;
		double lowestPrice = 0.0;
		double lastPrice = 0.0;

		/* PLACE YOUR CODE HERE */
		
		do{
			try{
				stdErr.print("[symbol_name_price1_ ... _priceN]>");
				stdErr.flush();
				StringTokenizer tokenizer = new StringTokenizer(stdIn.readLine() , "_");
				if(tokenizer.countTokens() < 3){
					stdErr.println("Incomplete data");
				}else{
					symbol = tokenizer.nextToken();
					name = tokenizer.nextToken();
					highestPrice = Double.parseDouble(tokenizer.nextToken());
					lowestPrice = highestPrice;
					while(tokenizer.hasMoreTokens()){
						double price = Double.parseDouble(tokenizer.nextToken());
						if(price > highestPrice){
							highestPrice = price;
						}
						if(price < lowestPrice){
							lowestPrice = price;
						}
						lastPrice = price;
					}
					return new Stock(symbol, name, highestPrice, lowestPrice, lastPrice);
				}
			}catch(NumberFormatException nfe){
				stdErr.println("Incorrect number format");
			}
		}while(true);

		
	}
}