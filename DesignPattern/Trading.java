public class Trading extends Reminder {  // Implemention of the Trading Class extending the Reminder Class in Visitor Design Diagram

	
	public Reminder accept(NodeVisitor nodeVisitor) {
		System.out.println("Assignment Reminder ...");
		return nodeVisitor.visitTrading(this);
	}
	public void addTrading() {
		System.out.println("Add Trading ");
	}

	public void viewTrading() {
		System.out.println("View Trading ");
	}
}
