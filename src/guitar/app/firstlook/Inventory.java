package guitar.app.firstlook;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
	private List<Instrument> instruments;
	
	public Inventory() {
		instruments  = new LinkedList<Instrument>(); 
	}
	
	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
		
		Instrument instrument = new Instrument(serialNumber, price, spec);
		instruments.add(instrument);
	}
	
	public Instrument getInstrument(String serialNumber) {
		for(Instrument g : instruments) {
			if(g.getSerialNumber().equalsIgnoreCase(serialNumber)) {
				return g;
			}
		}
		return null;
	}
	
	public List<Instrument> searchInstrument(InstrumentSpec spec) {
		
		List<Instrument> matchedInstrument = new  LinkedList<Instrument>();
		for(Instrument instrument : instruments) {
			if(instrument.getSpec().matches(spec))
				matchedInstrument.add((instrument));
		}
		return matchedInstrument;
	}
}
