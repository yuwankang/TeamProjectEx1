package ch06.sec15;

public class SingletonExam {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	
	}

}

/* 1. 3
 * 2. 4
 * 3. 4
 * 4. 3
 * 5. 1
 * 6. 4
 * 7. 2
 * 8. 2
 * 9. 2
 * 10. 4
 * 11. 3
 * 12. 필드, 생성자, 메소드
 * 13. 
 * class Member {
 * 	String name = "이름";
 * 	String id = "아이디";
 * 	String password = "패스워드";
 * 	int age = "나이";
 * }
 * 14.
 * Member(String name, String id) {
 * 		this.name = name;
 * 		this.id = id;
 * }
 * 15.
 * boolean login(String id, String password) {
 * 	if("hong".equals(id) && "12345".equals(password)) {
 * 	System.out.println("로그인되었습니다.");
 * 	return true;
 * 	} else false;
 * 
 * void logout(String id) {
 * 	System.out.println(this.id + "님이 로그아웃 되었습니다.);
 * }
 * 16.
 * void println(int value)(boolean value)(double value)(String value)
 * 17.
 * static 
 * 
 * 18.
 * public class shopService {
 * 	private static shopService shopservice = new shopService();
 * 
 * 	private shopService(){}
 * 
 *  public static shopService getInstance() {
 * 		return shopservice;
 * }
 * 19.
 * private int balance;
 * static final MIN_BALANCE = 0;
 * static final MAX_BALANCE = 1000000;
 * 
 * public void setBalance(int balance) {
 * 	if(MIN_BALANCE<=balance<=MAX_BALANCE) {
 *		this.balance = balance;
 *	} else return; 
 *	public int getBalance() {
 *		 return balance;
 *		 
 */