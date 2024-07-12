package lunch.model.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class LunchProject {
	/** 프로젝트 고유 이름 : lunch- 프로젝트 구분 데이터 */
	private String lunchProjectName;
	/** 팀  : 팀번호 , 팀원명, 팀원명 정보 */
	private Team projectTeam;
		
	/** 음식 */
	private Food projectFood;
	/** 점심 타입 */
	private LunchType LunchType;
	/** 프로젝트 시작일 */
	private String startDate;
	/** 프로젝트 종료일 */
	private String endDate;
	/** 진행되는 project의 상세 내용 */
	private String talentDonationProjectDetail;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("프로젝트명 : ");
		builder.append(talentDonationProjectName);
		builder.append(", 기부자 : ");
		builder.append(projectDonator);
		builder.append(", 수혜자 : ");
		builder.append(projectBeneficiary);
		builder.append(", 진행되는 기부 타입 : ");
		builder.append(talentDonationType);
		builder.append(", 기부 시작일 : ");
		builder.append(startDate);
		builder.append(", 기부 종료일 : ");
		builder.append(endDate);
		builder.append(", 기부 상세 내용 : ");
		builder.append(talentDonationProjectDetail);
		return builder.toString();
	}
}