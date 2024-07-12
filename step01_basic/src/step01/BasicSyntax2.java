/*
 * 
 */
package step01;

public class BasicSyntax2 {
	//멤버 변수 - 실제화(instance)로 메모리에 객체 생성
	String name = "상민";
	int age = 21;
	//생성자 : 필수, 개발자가 생략시에 자동 추가
	
	//메소드 : 로컬 변수 선언, 멤버 변수값과 변수값 출력
	//반환타입 메소드명([parameter]){}
	void info()
	{
		String name2 = "동길";
		int age = 22;
		System.out.println(name + " " + name2);
	}
	
	public static void main(String[] args) {
		//멤버 변수 호출 후 출력, 멤버 변수값 수정 후 출력 
		BasicSyntax2 c = new BasicSyntax2();
		System.out.println(c); //step01.BasicSyntax2@2f4d3709
		System.out.println(c.name); //name 변수가 실제 메모리에 사용 가능하게 존재햐아함 호출 가능
	
		//메소드 호출
		c.info();
	
	}

}

