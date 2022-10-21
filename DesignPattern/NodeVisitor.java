public abstract class NodeVisitor {  // From the Visitor design pattern it implements the node vistior

	public abstract Reminder visitProduct(Product product);

	public abstract Reminder visitTrading(Trading trading);

	public abstract void visitFacade(Facade facade);

}
