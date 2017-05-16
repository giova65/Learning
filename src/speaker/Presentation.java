import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Presentation {

	private final HashMap<String, Speaker> speakers;
	
	public Presentation(){
		this.speakers = new HashMap<String, Speaker>(); 
	}
	
	public void insertSpeakers(Speaker...speaker){
		for(Speaker speak: speaker)
		this.speakers.put(speak.getName(), speak);
	}
	
	public HashMap<String, Speaker> getSpeakers(){
		return this.speakers;
	}
	
	public Speaker getSpeaker(){
		Random random = new Random();
		List<String> keys = new ArrayList<String>(this.speakers.keySet());
		String randomKey = keys.get( random.nextInt(keys.size()) );
		Speaker value = this.speakers.get(randomKey);
		return value;
	}
		
}
