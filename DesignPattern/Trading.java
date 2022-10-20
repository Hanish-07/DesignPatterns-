public class Trading extends Reminder {

	private Product product;

	private OfferingList offeringList;
	
	public Reminder accept(NodeVisitor nodeVisitor) {
		System.out.println("Assignment Reminder ...");
		return nodeVisitor.visitTrading(this);
	}
	public void addTrading() {
		System.out.println("Add Trading ....");
	}

	public void viewTrading() {
		System.out.println("View Trading ....");
	}
}
