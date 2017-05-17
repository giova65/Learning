package speaker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Presentation {

	private final HashMap<String, Speaker> speakers;
	
	public Presentation(List <String> presentators, List <String> notAvailable){
		this.speakers = new HashMap<String, Speaker>(); 
		
		for(String speak: presentators){
			this.insertSpeakers(new Speaker(speak));
		}
		for(String speak: notAvailable){
			if(this.speakers.containsKey(speak))
				this.speakers.get(speak).setNotAvailable();
		}
		
	}
	
	public void insertSpeakers(Speaker speaker){
			this.speakers.put(speaker.getName(), speaker);
	}
	
	
	public HashMap<String, Speaker> getSpeakers(){
		return this.speakers;
	}
	
	public Speaker getSpeaker(){
		Random random = new Random();
		List<String> keys = new ArrayList<String>();
		for (String key : this.speakers.keySet()) {
			if(!this.speakers.get(key).getAlreadyTalked() && !this.speakers.get(key).getNotAvailable()){
				keys.add(key);
			}
		}
		if(keys.size() > 0){
			String randomKey = keys.get( random.nextInt(keys.size()) );
			Speaker value = this.speakers.get(randomKey);
			this.speakers.get(randomKey).setAlreadyTalked(true);
			return value;
		}else{
			return new Speaker("");
		}
	}
		
}
