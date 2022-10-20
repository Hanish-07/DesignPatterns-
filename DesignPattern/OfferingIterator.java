import java.util.Iterator;

public class OfferingIterator extends ListIterator {

	private OfferingList offeringList;  //Because the relation may not be correct

	@SuppressWarnings("rawtypes")
	@Override
	public boolean hasNext(Iterator iterator) {
		return iterator.hasNext();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void MoveToHead(Iterator iterator) {
		System.out.println("Head Moved ");
	}

	@SuppressWarnings("rawtypes")
	@Override
	public String Next(Iterator iterator) {
		if (this.hasNext(iterator)) {
			return (String)iterator.next();
		} else {
			return null;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void Remove(Iterator iterator) {
		if (this.hasNext(iterator)) {
			iterator.next();
		}

	}

}
