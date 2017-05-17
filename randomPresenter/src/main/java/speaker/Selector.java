package speaker;

import static java.util.Arrays.*;
import static org.apache.commons.io.FileUtils.*;

import java.io.File;
import java.util.List;

public class Selector {
	
		private static final String SPEAKER_SET = "speakers.txt";

		public void execute(String[] args) throws Exception {
			
			File file = new File(SPEAKER_SET);
			List<String> speakers = readLines(file, "UTF-8");
			List<String> notAvailable = asList(args);
			Presentation presentation = new Presentation(speakers, notAvailable);
			Speaker speaker = presentation.getSpeaker();
			System.out.println(speaker.getName());
			
		}
}
