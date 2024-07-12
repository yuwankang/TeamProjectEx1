/* 학습내용
 * -상속 다형성 리뷰
 */

package step01.basic;

import model.domain.PeopleDTO;

public class OOP2 {
	//Object o = new Parent(); 자동 형변환(promotion)
	static Object m1() { //반환히 Object인 상위 타입으로 자동형변환 되어 반환
		
		return new Parent(); //Object의 자식 객체 생성
	}
	
	static Object[] m2() {
		
		Object[] o = new Object[3]; //모든 클래스 최상위 root
		o[0] = "str"; //문자열 생성 -> Object로 변환되면서 저장
		o[1] = 3;
		o[2] = new PeopleDTO("id", 11);
		
		return o;
	}
	
	public static void main(String[] args) {

		//? m2() 호출
		Object[] ans = m2();
		
		//? m2() index 0번째 문자열 길이 출력
		String data = (String)ans[0];
		System.out.println(data.length());
		System.out.println(((String)ans[0]).length());
		
		//? index 2의 id값만 출력
		PeopleDTO p = (PeopleDTO)ans[2];
		System.out.println(p.getName());
		System.out.println(((PeopleDTO)ans[2]).getName());
		
		//? index 2의 id값을 다른 id값으로 수정
		PeopleDTO p2 = (PeopleDTO)ans[2];
		p2.setName("New data");
		((PeopleDTO)ans[2]).setName("ee");
		
		//? index 2의 id값만 출력
		System.out.println(((PeopleDTO)ans[2]).getName());
		((PeopleDTO)ans[2]).getName();
		
		//step01
//		Parent p = (Parent)m1(); //Object 타입으로 반환, 자식타입 변수엔 명시적인 형변환(typecasting)
//		p.id = "fisa man";
//		p.printAll();
		
		
	}

}
