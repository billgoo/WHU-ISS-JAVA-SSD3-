import java.util.*;

public class PlainTextSalesFormatter implements SalesFormatter{
	private final static String NEW_LINE = System.getProperty("line.separator");
	static private PlainTextSalesFormatter singletonInstance = null;
	static public PlainTextSalesFormatter getSingletonInstance(){
		if(singletonInstance == null){
			singletonInstance = new PlainTextSalesFormatter();
		}
		return singletonInstance;
	}
	private PlainTextSalesFormatter(){
	}
	public String formatSales(Sales sales){
		String out = NEW_LINE;
		int number = 1;
		for(Order order: sales){
			out += "------------------------";
			out += NEW_LINE;
			out += "Order "+number+NEW_LINE;
			for(OrderItem orderItem: order){
				out +=orderItem.getQuantity()+" "+orderItem.getProduct().getCode()+" "+orderItem.getProduct().getPrice();
				out += NEW_LINE;
			}
			out += "Total = ";
			out	+= order.getTotalCost();
			out += NEW_LINE;
			number++;
		}
		return out;
	}
}
