
public class VHSMovie extends Movie implements VHS{
	private String format;
	private String language;
	public VHSMovie(String initialTitle , String[] initialActors , String initialDirector , String initialFormat , String initialLanguage){
		super(initialTitle , initialActors , initialDirector);
		this.format = initialFormat;
		this.language = initialLanguage;
	}
	public String getFormat(){
		return this.format;
	}
	public String getLanguage(){
		return this.language;
	}
	public String toString(){
		return super.getTitle()+","+getFormat()+","+getLanguage();
	}
}
