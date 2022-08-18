package interface_class_inherit_book;

public class BookShelfMain {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		Queue queue = bookShelf;
		queue.endQueue("토지1");
		queue.endQueue("토지2");
		queue.endQueue("토지3");
		
//		System.out.println(queue.firstQueue());
//		System.out.println(queue.firstQueue());
//		System.out.println(queue.firstQueue());
		
		int temp = queue.getSize();
		for(int i = 0; i < temp; i++) {
			System.out.println(queue.firstQueue());
		}
		
	}

}
