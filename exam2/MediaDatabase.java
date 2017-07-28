import java.util.*;

public class MediaDatabase implements Iterable<MediaFile>{
	private ArrayList<MediaFile> files;
	public MediaDatabase(){
		this.files = new ArrayList<MediaFile>();
	}
	public void addFile(MediaFile mediaFile){
		this.files.add(mediaFile);
	}
	public void removeFile(MediaFile mediaFile){
		this.files.remove(mediaFile);
	}
	public Iterator<MediaFile> iterator(){
		return this.files.iterator();
	}
	public MediaFile getFile(String name){
		for(MediaFile mediaFile: this.files){
			if(mediaFile.getName().equals(name)){
				return mediaFile;
			}
		}
		return null;
	}
	public int getNumberOfFiles(){
		return this.files.size();
	}
	public String[] getFileNames(){
		String[] fileNames = new String[this.files.size()];
		int i = 0;
		for(MediaFile mediaFile: this.files){
			fileNames[i] = mediaFile.getName();
			i++;
		}
		return fileNames;
	}
}
