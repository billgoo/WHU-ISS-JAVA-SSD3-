
public class OrderItem {
	private Product product;
	private int quantity;
	public OrderItem(Product initialProduct , int initialQuantity){
		this.product = initialProduct;
		this.quantity = initialQuantity;
	}
	public Product getProduct(){
		return this.product;
	}
	public int getQuantity(){
		return this.quantity;
	}
	public void setQuantity(int newQuantity){
		this.quantity = newQuantity;
	}
	public double getValue(){
		return getQuantity()*product.getPrice();
	}
	public String toString(){
		return getQuantity()+" "+product.getCode()+" "+product.getPrice();
	}
}
