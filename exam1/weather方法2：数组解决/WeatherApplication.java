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
		String TEMP ="";
		double lowestTemp;
		double highestTemp;
		double[] maxX;
		double[] minX;
		int numOfTokens; 
		label:do {
        	stdErr.print("[city_TEMP_minTemp1_maxTemp1 ...]>");
        	stdErr.flush();
        	StringTokenizer tokenizer = new StringTokenizer (stdIn.readLine(), "_");
    		numOfTokens = tokenizer.countTokens();
			try {
				if(numOfTokens < 4){
					stdErr.println("Error: Incomplete data. Need at least 4 tokens.");
				}else{
					city = tokenizer.nextToken();
					TEMP = tokenizer.nextToken();
					if(!TEMP.equals("TEMP")){
						stdErr.println("Error: Missing literal TEMP after city.");
						}else if(numOfTokens % 2 != 0 ){
						stdErr.println("Error: Missing temperature value. Need min max pairs.");
					}else{
						maxX = new double[(numOfTokens - 2)/2];
						minX = new double[(numOfTokens - 2)/2];
						
						for(int i = 0;i < (numOfTokens - 2)/2;i++){
							minX[i] = Double.parseDouble(tokenizer.nextToken());
							maxX[i] = Double.parseDouble(tokenizer.nextToken());
							if(minX[i]>maxX[i]){
								stdErr.println("Error: minTemp "+minX[i]+" > maxTemp "+maxX[i]);
								continue label;
								}
							}
						highestTemp = maxX[0];
						lowestTemp = minX[0];
						
						for(int j = 0;j < (numOfTokens - 2)/2;j++){
							if(minX[j] <= lowestTemp)
								lowestTemp = minX[j];
						    if(maxX[j] >= highestTemp)
							    highestTemp = maxX[j];
						    }
					    return new Weather(city, lowestTemp, highestTemp);
						}
					
					}
			}catch(NumberFormatException e){
				stdErr.println("Error: Incorrect number format: " );
			}
			
		}while(true);
		
		

		/* PLACE YOUR CODE HERE */

	}

}