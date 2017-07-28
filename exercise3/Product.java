
public class Product {
	private String Code;
	private String description;
	private double price;
	public Product(String initialCode , String initialDescription , double initialPrice){
		this.Code = initialCode;
		this.description = initialDescription;
		this.price = initialPrice;
	}
	public String getCode(){
		return this.Code;
	}
	public String getDescription(){
		return this.description;
	}
	public double getPrice(){
		return this.price;
	}
	public boolean equals(Object object){
		return object instanceof Product && getCode().equals(((Product) object).getCode());
	}
	public String toString(){
		return getCode()+"_"+getDescription()+"_"+getPrice();
	}
}
