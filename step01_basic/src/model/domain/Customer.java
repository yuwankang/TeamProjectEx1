/* 학습내용
 *
 * 1. lombok 설치
 *  - 다운로드 -> maven 설정 파일에 설정 후 저장
 *   -> library가 maven Dependenices 폴더에 자동 다운로드
 *   -> 자바코드에 애노테이션 설정으로 코드 자동생성
 *
 * 2. 애노테이션
 *  - 1. 표현 : @(엣)
 *  - 2. 기능 : 고유한 이름별 고유한 기능
 *            jdk1.5 버전 부터 활성화 & framework들 주도적인 설정
 *  - 3. lombok
 *      1. setXxx() 메소드 자동 생성
 *      2. getXxx() 메소드 자동 생성
 *      3. 생성자들도 생성
 *      4. builder pattern 지원
 */
package model.domain;
/*import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Setter // 각 변수별 데이터 수정 메소드 자동 생성하는 표현
@Getter //
*/
public class Customer {
	public String id;
	public String pw;
	public int age;
	public String grade;
}