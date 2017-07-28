
public class CoffeeBrewer extends Product{
	private String model;
	private String waterSupply;
	private int numberOfCups;
	public CoffeeBrewer(String initialCode , String initialDescription , double initialPrice , String initialModel , String initialWaterSupply , int initialNumberOfCups){
		super(initialCode , initialDescription , initialPrice);
		this.model = initialModel;
		this.waterSupply = initialWaterSupply;
		this.numberOfCups = initialNumberOfCups;
	}
	public String getModel(){
		return this.model;
	}
	public String getWaterSupply(){
		return this.waterSupply;
	}
	public int getNumberOfCups(){
		return this.numberOfCups; 
	}
	public String toString(){
		return super.toString()+"_"+getModel()+"_"+getWaterSupply()+"_"+getNumberOfCups();
	}
}

