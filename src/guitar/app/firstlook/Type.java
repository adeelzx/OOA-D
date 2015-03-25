package guitar.app.firstlook;

public enum Type {
	ACOUSTIC, ELECTRIC;
	
	public String toString() {
		switch(this) {
			case ACOUSTIC : return "acostic";
			case ELECTRIC : return "electric";
			default : return "acostic";
		}
	}
}
