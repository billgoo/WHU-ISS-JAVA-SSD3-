import java.util.*;

public class Catalog implements Iterable<Product>{
	private ArrayList<Product> items;
	public Catalog(){
		this.items = new ArrayList<Product>();
	}
	public void addProduct(Product product){
		this.items.add(product);
	}
	public Iterator<Product> iterator(){
		return this.items.iterator();
	}
	public Product getProduct(String code){
		for(Product product: this.items){
			if(product.getCode() == code){
				return product;
			}
		}
		return null;
	}
	public int getNumberOfProducts(){
		return this.items.size();
	}
}
