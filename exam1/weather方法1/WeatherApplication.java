import  java.io.*;
import  java.util.*;

/* DOCUMENT THIS CLASS */
public class WeatherApplication {
	
	/* Standard input stream */
	private static BufferedReader  stdIn =
		new  BufferedReader(new  InputStreamReader(System.in));

	/* Standard output stream */
	private static PrintWriter  stdOut =
		new  PrintWriter(System.out, true);

	/* Standard error stream */
	private static PrintWriter  stdErr =
		new  PrintWriter(System.err, true);

	/**
	 * This program reads min and max temperature observations
	 * for cities and displays the lowest and highest temperature
	 *
	 * @param args  not used
	 * @throws IOException  if error reading from the standard input.
	 */
	public static void main(String[] args) throws IOException {

		Weather weather = readWeather();

		stdOut.println(weather.getXML());
	}
	
	/* DOCUMENT THIS METHOD */
	public static Weather readWeather() throws IOException {

		String city = "";
		double lowestTemp = 0;
		double highestTemp = 0;

		/* PLACE YOUR CODE HERE */
		lobel:do{
			try{
				stdErr.print("[city_TEMP_minTemp1_maxTemp1_ ...]>");
				stdErr.flush();
				StringTokenizer tokenizer = new StringTokenizer(stdIn.readLine() , "_");
				if(tokenizer.countTokens() < 4){
					stdErr.println("Error: Incorrect data. Need at least 4 tokens");
				}else if(tokenizer.countTokens()%2 != 0){
					stdErr.println("Error: Missing temperature value. Need min max pairs.");
				}else{
					city = tokenizer.nextToken();
					if(!tokenizer.nextToken().equals("TEMP")){
						stdErr.println("Error: Missing literal TEMP after city.");
						continue;
					}
					lowestTemp = Double.parseDouble(tokenizer.nextToken());
					highestTemp = Double.parseDouble(tokenizer.nextToken());
					if(lowestTemp > highestTemp){
						stdErr.println("Error: minTemp "+lowestTemp+" > maxTemp "+highestTemp);
						continue lobel;
					}						
					while(tokenizer.hasMoreTokens()){
						double tempMin = Double.parseDouble(tokenizer.nextToken());
						double tempMax = Double.parseDouble(tokenizer.nextToken());
						if(tempMin > tempMax){
							stdErr.println("Error: minTemp "+tempMin+" > maxTemp "+tempMax);
							continue lobel;
						}						
						if(tempMax > highestTemp){
							highestTemp = tempMax;
						}
						if(tempMin < lowestTemp){
							lowestTemp = tempMin;
						}						
					}
					return new Weather(city, lowestTemp, highestTemp);
				}
			}catch(NumberFormatException nfe){
				stdErr.println(nfe.toString());
			}
		}while(true);
	}		
}