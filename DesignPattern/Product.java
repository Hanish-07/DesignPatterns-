import java.util.*;
@SuppressWarnings("rawtypes")

public class Product extends Reminder{
	
	private ClassProductList classProductList;

	private Trading trading;

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
		return this.prod.iterator();
	}

	public Reminder accept(NodeVisitor nodeVisitor) {
		System.out.println("Product List Reminder ...");
		return nodeVisitor.visitProduct(this);
	}

}

