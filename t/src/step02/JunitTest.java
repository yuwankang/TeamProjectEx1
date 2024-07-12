/*
 * 1.java.lang 제외하고 모든 package는 필요시 import
 * 2.import package명.class명; 선호
 *   import package명.*; 비추코드, class 찾을 때 package 전체 내용 확인 
 * 3.단위 test를 위한 설정
 * 	1.junit 다운로드 및 설정
 *  2.import문장으로 설정
 *  3.@Test로 메소드 기능별 실행
 */
package step02;

import org.junit.Test;

public class JunitTest {
	@Test
	public void Test1() {
		String s = null;
		//int i = s.length();
		System.out.println("성호");
	}
	
}
