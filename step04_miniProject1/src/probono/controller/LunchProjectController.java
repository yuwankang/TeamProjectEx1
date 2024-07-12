package probono.controller;

import lunch.model.dto.LunchProject;
import lunch.model.dto.LunchProjectType;
import lunch.model.dto.team;
import lunch.model.dto.food;
import lunch.service.LunchProjectService;
import lunch.view.EndView;
import lunch.view.FailView;

public class LunchProjectController {

	private static LunchProjectController instance = new LunchProjectController();

	private static LunchProjectService service = LunchProjectService.getInstance();

	private LunchProjectController() {}

	public static LunchProjectController getInstance() {
		return instance;
	}
  
	
	/**
	 * 모든 Project 검색
	 * 
	 * @return 모든 Project
	 */
	public void getTeamProjectsList() {
		EndView.projectListView(service.getTeamProjectsList());	
	}


	/**
	 * Project 이름으로 검색 - 객체된 Project 반환하기
	 * 
	 * @param projectName 프로젝트 이름
	 * @return TalentDonationProject 검색된 프로젝트
	 */
	public void getTeamProject(String projectName) {
		EndView.projectView(service.getTeamProject(projectName));
	}

	
	/**
	 * @param project 저장하고자 하는 새로운 프로젝트
	 */
	public void LunchProjectInsert(LunchProject project){
	
		String projectName = project.getTeamProjectName();
		if(projectName != null && projectName.length() != 0) {
			try {
				
				service.LunchProjectInsert(project);
				EndView.successMessage("새로운 프로젝트 등록 성공했습니다.");
				
			} catch (Exception e) {
				FailView.failViewMessage(e.getMessage()); 
				e.printStackTrace();
			}
		}else {
			FailView.failViewMessage("입력 부족, 재 확인 하세요~~");
		}
	}

	/**
	 * Project의 팀 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 기부자 수정
	 * 
	 * @param projectName 프로젝트 이름
	 * @param people      팀
	 */
	public void LaunchProjectUpdate(String projectName, Team people) {
		
		try {
			service.teamProjectUpdate(projectName, people);
		} catch (Exception e) {
			FailView.failViewMessage(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Project의 음식 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 수혜자 수정
	 * 
	 * @param projectName 프로젝트 이름
	 * @param people      음식
	 */
	public void foodProjectUpdate(String projectName, Team food) {
		service.foodProjectUpdate(projectName, food);
	}

	/**
	 * Project 삭제 - 프로젝트 명으로 해당 프로젝트 삭제
	 * 
	 * @param projectName 삭제하고자 하는 프로젝트 이름
	 */
	public void teamProjectDelete(String projectName) {
		service.teamProjectDelete(projectName);
	}

}
