import java.util.Iterator;

public class ProductIterator extends ListIterator {

	private ClassProductList classProductList;

	@SuppressWarnings("rawtypes")
	public boolean hasNext(Iterator iterator) {
		return iterator.hasNext();
	}

	@SuppressWarnings("rawtypes")
	public String Next(Iterator iterator) {
		if (this.hasNext(iterator)) {
			return (String) iterator.next();
		} else {
			return null;
		}
	}

	@SuppressWarnings("rawtypes")
	public void MoveToHead(Iterator iterator) {
		System.out.println("Head Moved..");
	}

	@SuppressWarnings("rawtypes")
	public void Remove(Iterator iterator) {
		if (this.hasNext(iterator)) {
			iterator.next();
		}
	}

}

