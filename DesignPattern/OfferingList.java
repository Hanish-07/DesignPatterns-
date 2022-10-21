import java.util.*;

public class OfferingList {  // Implemention of the Offering List class that connects with the Offering Iterator of the Iterator Design Pattern.

	ArrayList<String> offering = new ArrayList<>(); // Displaying the lists of things offered.

	OfferingList(MeatProductMenu m) {
		offering.add("Offering for Beef");
		offering.add("Offering for Pork");
		offering.add("Offering for Mutton");
	}
	
	OfferingList(ProduceProductMenu p) {
		offering.add("Offering for Tomato");
		offering.add("Offering for Onion");
	}

	@SuppressWarnings("rawtypes")
	public Iterator createIterator() {
		return this.offering.iterator();
	}

}
