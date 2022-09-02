package define_exception;
/*
 * 사용자 정의 예외 클래스
 * 예외 클래스 만드는 방법
 */

//1.반드시 Exception을 부모로 상속 받는다
class IDFormatException extends Exception {
	
	IDFormatException(String message) {
		super(message);//예외발생 시 얻어 올 예외 메세지
		//Exception() 생성자한테 전달되어 e.getMessage() 메서드 호출 하면 리턴되는 문자열
	}
	
	
}

public class IDFormatTest {
	private String userID; //사용자 아이디 : 8자 이상 ~ 20자 이하
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
//		if(userID == null) {
//			System.out.println("아이디는 null일 수 없습니다.");
//		} else if ( !(8 <= userID.length() && userID.length() <= 20)) {
//			System.out.println("아이디는 8자 이상 20자 이하로 쓰세요");
//		} else {
//			this.userID = userID;
//		}
//		return;
		
		if (userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다");
		} else if (!(8 <= userID.length() && userID.length() <= 20)) {
			throw new IDFormatException("아이디는 8자리 이상 20자리 이하만 가능합니다");
		} else {
			this.userID = userID;
		}
	}

	public static void main(String[] args) {//throws IDFormatException
		IDFormatTest test = new IDFormatTest();
		
		try {
			test.setUserID(null);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		System.out.println("실행");
	}

}
