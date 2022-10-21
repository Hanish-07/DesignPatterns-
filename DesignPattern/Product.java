import java.util.*;
@SuppressWarnings("rawtypes")

public class Product extends Reminder{						// Implemention of the iterator pattern diagram

	ArrayList<String> prod = new ArrayList<>();

	Product(MeatProductMenu m){
		prod.add("Meat:Beef");
		prod.add("Meat:Pork");
		prod.add("Meat:Mutton");
	}
	Product(ProduceProductMenu p){
		prod.add("Produce:Tomato");
		prod.add("Produce:Onion");
	}

	public Iterator createIterator() {
		return this.prod.iterator();						// Calling the iterator pattern object
	}

	public Reminder accept(NodeVisitor nodeVisitor) {
		System.out.println("Product List Reminder ...");
		return nodeVisitor.visitProduct(this);
	}

}

