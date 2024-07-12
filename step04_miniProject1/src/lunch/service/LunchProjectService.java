package lunch.service;

import lunch.model.dto.food;
import lunch.model.dto.team;
import probono.model.dto.Beneficiary;
import probono.model.dto.Donator;
import probono.model.dto.TalentDonationProject;
import lunch.model.dto.LunchProject;

public class LunchProjectService {

	// service에서 singleton을 사용하는이유는 뭘까?
	private static LunchProjectService instance = new LunchProjectService();
	
	/*
	 *  진행중인 Project를 저장
	 */
	private ArrayList<LunchProjectService> LunchProjectList = new ArrayList<LunchProject>();

	pirvate LunchProjectService() {}
	
	public static LunchProjectService getInstance() {
		
		return instance;
	}
	
	/*
	 *  모든 Project 검색
	 */
	public ArrayList<LunchProject> getLunchProjectsList() {
		
		return LunchProjectList;
	
	}
	
	/*
	 *  Projecet 이름으로 검색 - 객체된 Project 반환하기
	 */
	public LunchProject getLunchProject(String projectName) {
		
		for(LunchProject project : lunchProjectList) {
			if (project != null && project.getLunchProjectName().equals(projectName)) {
				
					return project;
			}
		}
		
		return null;
	}

	/*
	 *  새로운 Project 추가
	 *  @param project 저장하고자 하는 새로운 프로젝트
	 */
	public void lunchProjectInsert(LunchProject project)
			throws Exception {
		
		LunchProject p = getLunchProject(project.getLunchProjectName());

		if (p != null) {
			throw new Exception("해당 project명은 이미 존재합니다. 재 확인하세요");
		}

		lunchProjectList.add(project);
////		
	}
	
	/* Project의 기부자 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 기부자 수정
	 * @param projectName 프로젝트 이름
	 * @param people      팀
	 */
	public void lunchProjectUpdate(String projectName, Team people) throws Exception {//Donator 뭘로했는지 보고 변경

		for (LunchProject project : lunchProjectList) {

			if (project != null && project.getLunchProjectName().equals(projectName)) {

				if (people != null) {
					project.setProjectTeam(people); // Donator 변경
					break;
				} else {
					throw new Exception("프로젝트 이름은 있으나 팀 정보 누락 재확인 하세요");
				}

			} else {
				throw new Exception("프로젝트 이름과 팀 정보 재 확인 하세요");
			}
		}

	}

	
	/* Project의 수혜자 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 수혜자 수정
	 * @param projectName 프로젝트 이름
	 * @param people      음식
	 */
	public void FoodProjectUpdate(String projectName, Food food) {

		for (LunchProject project : lunchProjectList) {

			if (project != null && project.getLunchProjectName().equals(projectName)) {

				project.setProjectFood(food);

				break;
			}
		}

	}

	 /* Project 삭제 - 프로젝트 명으로 해당 프로젝트 삭제
	 * @param projectName 삭제하고자 하는 프로젝트 이름
	 */
	public void LunchProjectDelete(String projectName) {
		LunchProject project = getLunchProject(projectName);

		if (project != null) {
			lunchProjectList.remove(project);
		}

	}
}