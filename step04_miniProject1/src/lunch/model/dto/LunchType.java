/**
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  TalentDonationType.java
 * DESC  :  재능기부 종류(Data)
 *
 * @author
 * @version 1.0
*/
package lunch.model.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LunchType {
	/** 재능 기부 타입(종류) */
	private String foodType;
	
	/** 재능 기부 활동 영역 */
	private String restaurant1;
	
	/** 재능 기부 활동 영역 */
	private String restaurant2;
	
	/** 재능 기부 활동 영역 */
	private String restaurant3;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("음식 종류 : ");
		builder.append(foodType);
		builder.append(", 맛집 1 : ");
		builder.append(restaurant1);
		builder.append(", 맛집 2 : ");
		builder.append(restaurant2);
		builder.append(", 맛집 3 : ");
		builder.append(restaurant3);
		return builder.toString();
	}
}
