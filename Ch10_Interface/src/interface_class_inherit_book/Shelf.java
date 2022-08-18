package interface_class_inherit_book;

import java.util.ArrayList;

public class Shelf {
	//private : 정보보안 => 캡슐화, 상속불가
	//protected 자식클래스에서 접근할 수 있도록
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
