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
}

