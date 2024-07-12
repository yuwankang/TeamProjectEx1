/* 학습 내용
 * - 상속 다형성 리뷰 
 */

package step01.basic;

import model.domain.PeopleDTO;

public class OOP2 {
	//Object o = new Parent();  자동 형변환(promotion)
	static Object m1() {	//반환시 Object인 상위 타입으로 자동형변환 되어 반환
		return new Parent();  //Object 의 자식 객체 생성
	}
	
	static Object[] m2() {
		Object[] o = new Object[3];// 모든 클래스 최상위 root
		o[0] = "str";//문자열 생성 -> Object로 변환되면서 저장 Object o = "str"
		o[1] = 3;
		o[2] = new PeopleDTO("id", 11);
		
		return o;
	}
	
	/* 50분까지
	 * 2~3 4지선다형 문제 제출 하기(리뷰)
	 * 
	 */
	
	public static void main(String[] args) {
		//? m2() 호출
		Object[] o = m2();
				
		//? index 2의 name값을 다른 name값으로 수정
		PeopleDTO p2 = (PeopleDTO)o[2];
		p2.setName("new name");
		( (PeopleDTO)o[2] ).setName("ee");
				
		//? index 2의 name 값만 출력 - id는 상속받지 않은 PeopleDTO 만의 멤버 변수
		PeopleDTO p = (PeopleDTO)o[2];
		System.out.println(p.getName());
		System.out.println( ( (PeopleDTO)o[2] ).getName() );
		
		//? index 2의 id값만 출력 
		//? index 0 번째의 문자열 길이 출력
				// String / lenght() / 형변환
				/* (String)o[0]
				 * 	- o -> [0] -> (String) 
				 */
				String data = (String)o[0]; 
				System.out.println(data.length());
				
				System.out.println( (  (String)o[0] ).length() );

		//step01
		//Object 타입으로 반환, 자식타입의 변수엔 명시적인 형변환(typecasting)		
//		Parent p = (Parent)m1();
//		p.id = "fisa man";
//		p.printAll();
	}

}
