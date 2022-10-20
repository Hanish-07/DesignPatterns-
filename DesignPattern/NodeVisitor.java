public abstract class NodeVisitor {

	public abstract Reminder visitProduct(Product product);

	public abstract Reminder visitTrading(Trading trading);

	public abstract void visitFacade(Facade facade);

}
