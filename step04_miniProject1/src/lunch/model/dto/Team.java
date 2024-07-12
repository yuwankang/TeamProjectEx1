
package lunch.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter  
@ToString  
public class Team {
	// 팀번호
	private int no;
	
	//이름
	private String name1;
	
	private String name2;
	
	private String name3;
	
	private String name4;
	
	private String food;
	
	@Override  
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("기부를 희망하는 사원번호 : ");
		builder.append(empno);
		builder.append(", 사원명 : ");
		builder.append(ename);
		builder.append(", 이메일 주소 : ");
		builder.append(email);
		builder.append(", 재능 : ");
		builder.append(talent);
		return builder.toString();  //String으로 반환 메소드 호출
	}
	
	
}



