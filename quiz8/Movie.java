
public abstract class Movie {
	private String title;
	private String[] actors;
	private String director;
	public Movie(String initialTitle , String[] initialActors , String initialDirector){
		this.title = initialTitle;
		this.actors = initialActors;
		this.director = initialDirector;
	}
	public String getTitle(){
		return this.title;
	}
	public String[] getActors(){
		return this.actors;
	}
	public String getDirector(){
		return this.director;
	}
	public String toString(){
		return this.title;
	}
}

