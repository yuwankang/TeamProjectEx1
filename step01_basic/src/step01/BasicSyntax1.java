package step01;

public class BasicSyntax1 {
	//사용자 정의 메소드 구현 -> 사용자가 직접 필요시에 호출
	/* 호출시 문법적인 제약조건
	 * -객체라는 것을 실제 메모리에 생성 후 메소드 호출
	 * 
	 * 1.객체 - 범용적으로 사용되는 표현법
	 * 2.인스턴스 - 실제 메모리에 사용 가능한 객체
	 * 
	 * -객체 생성 문법
	 * new 생성자;
	 * 
	 * -클래스 구성 요소
	 * 1.데이터 - 변수
	 * 2.기능 - 메소드
	 * 3.해당 클래스에 종속적인 객체 생성 기능 - 생성자
	 * 
	 * 객체 지향의 객체 생성 주 목적
	 * -데이터를 메모리에 생성 후 사용
	 * 
	 * 프로그램 관점에서의 객체 생성 주 목적
	 * -생성된 데이터 사용과 메소드 호출
	 * -예외
	 * 	데이터가 없는 클래스, 메소드는 다수 존재
	 * 	-객체 생성 필요성이 없는 경우의 해결점
	 *		-메소드 구현시 객체 생성없이 호출 가능한 방법: static 키워드, static로 구성된 메소드를 다수 보유한 API 활용
	 */
	
	//실행을 위한 특별 메소드
	//java BasicSYntax1 실행시 main 메소스 자동 실행
	//main 호출은 jre가 함
	public static void main(String[] args) {
		//문자열 : String / int32 정수
		String name = "웅빈";
		int age = 20;
		
		System.out.println(name);
	}

}
