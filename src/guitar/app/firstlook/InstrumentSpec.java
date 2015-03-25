package guitar.app.firstlook;

import java.util.HashMap;
import java.util.Map;

public class InstrumentSpec {
	
	private Map<Object, Object> properties;

	public InstrumentSpec(Map<Object, Object> properties) {
		if(properties == null) {
			this.properties = new HashMap<Object, Object>();
		} else {
			this.properties = new HashMap<Object, Object>(properties);
		}
	}
	public Map<Object, Object> getProperties() {
		return properties;
	}

	public void setProperties(Map<Object, Object> properties) {
		this.properties = properties;
	}
	
	public Object getProperty(String propertyName) {
		return properties.get(propertyName);
	}

public boolean matches(InstrumentSpec spec) {
		
	for(Object propertyName : spec.getProperties().keySet()) {
		if(!properties.get(propertyName).equals(spec.getProperties().get(propertyName))) {
			return false;
		}
	}
	return true;
	}
	
}
