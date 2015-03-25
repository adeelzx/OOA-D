package guitar.app.firstlook;

public enum InstrumentType {
	GUITAR, MENDOLIN, BENJO, BASS, DOBRO, FIDDLE ;
	
	public String toString() {
		switch(this) {
		case GUITAR : return "guitar";
		case MENDOLIN : return "mendolin";
		case BENJO : return "benjo";
		case BASS : return "bass";
		case DOBRO : return "dobro";
		case FIDDLE : return "fiddle";
		default : return "any instrument";
		}
	}
}
