import java.io.*;
import java.util.*;

public class SecondsCalculator {
	private static BufferedReader stdIn =
		new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter stdOut =
		new PrintWriter(System.out , true);
	private static PrintWriter stdErr =
		new PrintWriter(System.err , true);
	public static void main(String[] args) throws IOException{
		do{
			try{
				int hours=0;
				int minutes=0;
				int seconds=0;
				stdErr.print("time [hours:minutes:seconds]>");
				stdErr.flush();
				StringTokenizer tokenizer = new StringTokenizer(stdIn.readLine() , ":");
				if(tokenizer.countTokens()!=3){
					stdErr.println("Invalid value");
				}else{
					hours = Integer.parseInt(tokenizer.nextToken());
					minutes = Integer.parseInt(tokenizer.nextToken());
					seconds = Integer.parseInt(tokenizer.nextToken());
					if(hours<0|hours>23){
						stdErr.println("Invalid value");
					}else if(minutes<0|minutes>59){
						stdErr.println("Invalid value");
					}else if(seconds<0|seconds>59){
						stdErr.println("Invalid value");
					}else{
						int total = hours*3600+minutes*60+seconds;
						stdOut.println("The munber of seconds is: "+total);
						break;
					}
				}
				
			}catch(NumberFormatException nfe){
				stdErr.println("Invalid value");
			}
			
		}while(true);
	}
}
