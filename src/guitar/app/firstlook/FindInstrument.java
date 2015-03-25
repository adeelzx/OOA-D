package guitar.app.firstlook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindInstrument {
	
	private static void initializeInventory(Inventory inventory) {
		
		Map<Object, Object> properties_1 = new HashMap<Object, Object>();
		properties_1.put("instrumentType", InstrumentType.BASS);
		properties_1.put("builder", Builder.COLLINGS);
		properties_1.put("model", "CJ");
		properties_1.put("type", Type.ACOUSTIC);
		properties_1.put("numStrings", 6);
		properties_1.put("topwood", Wood.INDIAN_ROSEWOOD);
		properties_1.put("backwood", Wood.SITKA);
		
		inventory.addInstrument("1", 500, new InstrumentSpec(properties_1));
		
		Map<Object, Object> properties_2 = new HashMap<Object, Object>();
		properties_2.put("instrumentType", InstrumentType.GUITAR);
		properties_2.put("builder", Builder.COLLINGS);
		properties_2.put("model", "CJ");
		properties_2.put("type", Type.ELECTRIC);
		properties_2.put("numStrings", 6);
		properties_2.put("topwood", Wood.INDIAN_ROSEWOOD);
		properties_2.put("backwood", Wood.SITKA);
		inventory.addInstrument("1", 500, new InstrumentSpec(properties_2));
	}
	
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Map<Object, Object> properties = new HashMap<Object, Object>();
		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.COLLINGS);
		properties.put("model", "CJ");
		properties.put("type", Type.ELECTRIC);
		properties.put("numStrings", 6);
		properties.put("topwood", Wood.INDIAN_ROSEWOOD);
		properties.put("backwood", Wood.SITKA);
		
		
	     InstrumentSpec whatCustomerLikes = new InstrumentSpec(properties);
		
		List<Instrument> matchedInstrument = inventory.searchInstrument(whatCustomerLikes);
		if(!matchedInstrument.isEmpty()) {
			System.out.println("You might like these guitars :\n");
			for(Instrument i : matchedInstrument) {
				System.out.println("We have a "+ i.getSpec().getProperties().get("instrumentType") +" " + i.getSpec().getProperties().get("builder") +" " +i.getSpec().getProperties().get("model"));
				System.out.println("with back "+i.getSpec().getProperties().get("backwood") + " and top " +i.getSpec().getProperties().get("topwood") +" for price only $"+i.getPrice());
				System.out.println("======================================================");
			}
		}
		else {
			System.out.println("Sorry, we don't have any guitar of your choice.");
		}
	}

	
}
