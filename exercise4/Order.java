import java.util.*;

public class Order implements Iterable<OrderItem>{
	private ArrayList<OrderItem> items;
	public Order(){
		this.items = new ArrayList<OrderItem>();
	}
	public void addItem(OrderItem orderItem){
		this.items.add(orderItem);
	}
	public void removeItem(OrderItem orderItem){
		this.items.remove(orderItem);
	}
	public Iterator<OrderItem> iterator(){
		return this.items.iterator();
	}
	public OrderItem getItem(Product product){
		for(OrderItem orderItem: items){
			if(orderItem.getProduct().equals(product)){
				return orderItem;
			}
		}
		return null;
	}
	public int getNumberOfItems(){
		return this.items.size();
	}
	public double getTotalCost(){
		double total = 0.0;
		for(OrderItem orderItem: this.items){
			total += orderItem.getValue();
		}
		return total;
	}
}
