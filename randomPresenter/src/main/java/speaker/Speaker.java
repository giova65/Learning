package speaker;

public class Speaker {

	private final String name;
	private boolean alreadyTalked;
	private boolean notAvailable;
	
	public Speaker(String name){
		this.name = name;
		this.alreadyTalked = false;
		this.notAvailable = false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Speaker other = (Speaker) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public String getName(){
		return this.name;	
	}
	
	public void setAlreadyTalked(boolean alreadyTalked) {
		this.alreadyTalked = alreadyTalked;
	}
	
	public boolean getAlreadyTalked() {
		return alreadyTalked;
	}
	
	public void setNotAvailable(){
		this.notAvailable = true;
	}
	
	public boolean getNotAvailable(){
		return this.notAvailable;
	}
	
	
}
