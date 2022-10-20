import java.util.*;

public class OfferingList {

	private Trading trading;

	private OfferingIterator offeringIterator;

	ArrayList<String> offering = new ArrayList<>();

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
