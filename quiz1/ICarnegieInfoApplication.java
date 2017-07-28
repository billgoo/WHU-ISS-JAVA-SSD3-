import  java.io.*;
import  java.util.*;

/* DOCUMENT THIS CLASS */
public class ICarnegieInfoApplication  {

	private static BufferedReader  stdIn =
		new  BufferedReader(new  InputStreamReader(System.in));
	private static PrintWriter  stdOut =
		new  PrintWriter(System.out, true);
	private static PrintWriter  stdErr =
		new  PrintWriter(System.err, true);

	/* DOCUMENT THIS PUBLIC METHOD */
	public static void main(String[]  args) throws IOException  {

		ICarnegieInfo companyInfo = ICarnegieInfo.getInstance();

		int  choice = getChoice();

		while (choice != 0)  {

			if (choice == 1)  {
				stdOut.println(companyInfo.getName());
			} else if (choice == 2)  {
				stdOut.println(companyInfo.getAddress());
			} else if (choice == 3)  {
				stdOut.println(companyInfo.getTelephone());
			} else if (choice == 4)  {
				stdOut.println(companyInfo.getEmail());
			} else if (choice == 5)  {
				stdOut.println(companyInfo.getUrl());
			}

			choice = getChoice();
		}
	}

	private  static int  getChoice() throws IOException  {

		/* PLACE YOUR CODE HERE */
		int value;
		do{
			try{
				stdErr.println("0 每 Quit");
				stdErr.println("1 每 Display name");
				stdErr.println("2 每 Display address");
				stdErr.println("3 每 Display telephone");
				stdErr.println("4 每 Display email");
				stdErr.println("5 每 Display URL");
				stdErr.print("choice>");
				stdErr.flush();
				value = Integer.parseInt(stdIn.readLine());
				
				if(value<0|value>5){
					stdErr.println("Invalid choice: "+value);
				}
				return value;
			}catch(NumberFormatException nfe){
				stdErr.println(nfe);
			}
		}while(true);
  /* CHANGE THIS STATEMENT AS NEEDED */
	}
}