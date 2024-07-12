package lunch.service;

import lunch.model.dto.food;
import lunch.model.dto.team;
import lunch.model.dto.LunchProject;

public class LunchProjectService {

	// singleton을 사용하는이유
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
		
		LunchProject p = getDonationProject(project.getTalentDonationProjectName());

		if (p != null) {
			throw new Exception("해당 project명은 이미 존재합니다. 재 확인하세요");
		}

		donationProjectList.add(project);
		
	}
}

