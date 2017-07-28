
public class DVDMovie extends Movie implements DVD{
	private int regionCode;
	private String[] audioTracks;
	private String[] subtitles;
	public DVDMovie(String initialTitle , String[] initialActors , String initialDirector , int initialRegionCode , String[] initialAudioTracks , String[] initialSubtitles){
		super(initialTitle , initialActors , initialDirector);
		this.regionCode = initialRegionCode;
		this.audioTracks = initialAudioTracks;
		this.subtitles = initialSubtitles;
	}
	public int getRegionCode(){
		return this.regionCode;
	}
	public String[] getAudioTracks(){
		return this.audioTracks;
	}
	public String[] getSubtitles(){
		return this.subtitles;
	}
	public String toString(){
		return super.getTitle()+","+getRegionCode();
	}
}
