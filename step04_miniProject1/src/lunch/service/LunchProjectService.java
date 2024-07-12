/**
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  TalentDonationProjectService.java
 * DESC  :  재능 기부 프로젝트를 저장, 수정, 삭제, 검색하는 서비스 로직
 *
 * @author
 * @version 1.0
*/
package lunch.service;
import java.util.ArrayList;
import lunch.model.dto.Food;
import lunch.model.dto.LunchProject;
import lunch.model.dto.Team;
public class LunchProjectService {
	// singleton design pattern
	private static LunchProjectService instance = new LunchProjectService();
	/**
	 * 진행중인 Project를 저장
	 */
	private ArrayList<LunchProject> teamProjectList = new ArrayList<LunchProject>();
	private LunchProjectService() {}
	public static LunchProjectService getInstance() {
		return instance;
	}
	/**
	 * 모든 Project 검색
	 *
	 * @return 모든 Project
	 */
	public ArrayList<LunchProject> getTeamProjectsList() {
		return teamProjectList;
	}
	// TO DO - 구현 및 완성해야 할 job
	/**
	 * Project 이름으로 검색 - 객체된 Project 반환하기
	 *
	 * @param projectName 프로젝트 이름
	 * @return TalentDonationProject 검색된 프로젝트
	 */
	public LunchProject getTeamProject(String projectTeam) {
		for (LunchProject Team : teamProjectList) {
			if (Team != null && Team.getTeamName().equals(projectTeam)) {
				return Team; //메소드 자체의 종료
			}
		}
		return null;
	}
	// TO DO
	/**
	 * 새로운 Project 추가
	 *
	 * @param project 저장하고자 하는 새로운 프로젝트
	 */
	
	/* Controller의 메소드
	 * 	public void donationProjectInsert(TalentDonationProject project){}
	 * */
	public void teamProjectInsert(LunchProject project) throws Exception {
		
		LunchProject p = getTeamProject(project.getTeamName());
		if (p != null) {
			throw new Exception("해당 project명은 이미 존재합니다. 재 확인하세요");
		}
		teamProjectList.add(project);
		
	}
	/**
	 * Project의 기부자 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 기부자 수정
	 *
	 * @param projectName 프로젝트 이름
	 * @param people      기부자
	 */
	public void teamProjectUpdate(String projectName, Team people) throws Exception {
		for (LunchProject project : teamProjectList) {
			if (project != null && project.getTeamName().equals(projectName)) {
				if (people != null) {
					project.setProjectTeam(people);
					break;
				} else {
					throw new Exception("프로젝트 이름은 있으나 기부자 정보 누락 재확인 하세요");
				}
			} else {
				throw new Exception("프로젝트 이름과 기부자 정보 재 확인 하세요");
			}
		}
	}
	// TO DO
	/**
	 * Project의 수혜자 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 수혜자 수정
	 *
	 * @param projectName 프로젝트 이름
	 * @param people      수혜자
	 */
	public void foodProjectUpdate(String projectName, Food people) {
		for (LunchProject project : teamProjectList) {
			if (project != null && project.getTeamName().equals(projectName)) {
				project.setProjectFood(people);
				break;
			}
		}
	}
	// TO DO
	/**
	 * Project 삭제 - 프로젝트 명으로 해당 프로젝트 삭제
	 *
	 * @param projectName 삭제하고자 하는 프로젝트 이름
	 */
	public void teamProjectDelete(String projectName) {
		LunchProject project = getTeamProject(projectName);
		if (project != null) {
			teamProjectList.remove(project);
		}
	}
	
}