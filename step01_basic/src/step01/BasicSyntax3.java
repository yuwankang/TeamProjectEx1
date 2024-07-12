/*
 * 
 */
package step01;

public class BasicSyntax3 {
	/*static: 메모리에 name 변수를 실제화 하는 객체 생성 작업 없이도 호출 가능
	  static 키워드가 선언된 변수가 실제 생성되는 시점
	  	- 실행 명령어 시작하자마자 class byte code 메모리에 저장(적재,로딩)
	  	- 로딩시 자동 생성
	  	- 객체생성시 별도의 name 변수 공간 생성하지 않음
	  non-static 변수들은 객체 생성시에 메모리에 생성
	*/
	static String name = "상민"; //생성되는 모든 객체가 공유
	int age = 21;
	
	static int num1 = 0;
	int num2 = 0;
	
	BasicSyntax3()
	{
		num1 = num1 + 1;
		num2 = num2 + 1;
		
	}
	static void info()
	{
		String name2 = "동길";
		int age2 = 22;
		System.out.println(name + " " + name2);
	}
	
	public static void main(String[] args) {
		// static 변수와 non-static변수 차이점 보기
		BasicSyntax3 bs1 = new BasicSyntax3();
		BasicSyntax3 bs2 = new BasicSyntax3();
		System.out.println(bs1.num1 + " " + num1);
		System.out.println(bs2.num1 + " " + num1);
		System.out.println(bs1.num2 + " " + bs2.num2);
		
		info();//한 코드가 구현된 클래스 내에서 static 메소드 검색해서 호출
		BasicSyntax3.info(); //명시적 호출
		
//		BasicSyntax3 c = new BasicSyntax3();
//		System.out.println(c);
//		c.info();
		
//		name = "fisaman";
//		System.out.println(name);
//		System.out.println(c.name);
	
		//API 활용
		/*
		 * Math 데이터가 중요한게 아니라 max값 산출되는 메소드 가능
		 * API 설계자 자체도 사용자들이 주는 값 받고 비교하고 반환하고
		 * 즉 Math객체 생성할 이유와 필요가 없어서 static으로 제시
		 */
		int v1 = Math.max(10, 20);
		System.out.println(v1);
	}

}
