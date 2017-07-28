
public class Coffee extends Product{
	private String origin;
	private String roast;
	private String flavor;
	private String aroma;
	private String acidity;
	private String body;
	public Coffee(String initialCode , String initialDescription , double initialPrice , String initialOrigin , String initialRoast , String initialFlavor , String initialAroma , String initialAcidity , String initialBody){
		super(initialCode , initialDescription , initialPrice);
		this.origin = initialOrigin;
		this.roast = initialRoast;
		this.flavor = initialFlavor;
		this.aroma = initialAroma;
		this.acidity = initialAcidity;
		this.body = initialBody;
	}
	public String getOrigin(){
		return this.origin;
	}
	public String getRoast(){
		return this.roast;
	}
	public String getFlavor(){
		return this.flavor;
	}
	public String getAroma(){
		return this.aroma;
	}
	public String getAcidity(){
		return this.acidity;
	}
	public String getBody(){
		return this.body;
	}
	public String toString(){
		return super.toString()+"_"+getOrigin()+"_"+getRoast()+"_"+getFlavor()+"_"+getAroma()+"_"+getAcidity()+"_"+getBody();
	}
}