import java.util.*;

public class Sales implements Iterable<Order>{
	private ArrayList<Order> items;
	public Sales(){
		this.items = new ArrayList<Order>();
	}
	public void addOrder(Order order){
		this.items.add(order);
	}
	public Iterator<Order> iterator(){
		return this.items.iterator();
	}
	public int getNumberOfOrders(){
		return this.items.size();
	}
}
