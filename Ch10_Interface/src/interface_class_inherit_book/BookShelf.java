package interface_class_inherit_book;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void endQueue(String title) {
		shelf.add(title);
		
	}

	@Override
	public String firstQueue() {
		return shelf.remove(0);
		
	}

	@Override
	public int getSize() {
//		return shelf.size();
		return getCount();
	}

}
