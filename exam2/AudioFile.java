
public class AudioFile implements MediaFile{
	private String name;
	private int duration;
	public AudioFile(String initialName , int initialDuration){
		this.name = initialName;
		this.duration = initialDuration;
	}
	public String getName(){
		return this.name;
	}
	public int getDuration(){
		return this.duration;
	}
	public boolean equals(Object object){
		return object instanceof AudioFile && ((AudioFile) object).getName().equals(getName());
	}
	public String toString(){
		return getName()+","+getDuration();
	}
}
