import java.util.Iterator;

public abstract class ListIterator {   //Abstract class ListIterator of Iterator design pattern 
	@SuppressWarnings("rawtypes")
	public abstract boolean hasNext(Iterator iterator);

	@SuppressWarnings("rawtypes")
	public abstract void MoveToHead(Iterator iterator);

	@SuppressWarnings("rawtypes")
	public abstract String Next(Iterator iterator);
	
	@SuppressWarnings("rawtypes")
	public abstract void Remove(Iterator iterator);

}
