
package lunch.view;
import java.util.ArrayList;
import lunch.model.dto.LunchProject;
public class EndView {
	
	//진행중인 특정 프로젝트 출력
	public static void projectView(LunchProject project){
		if(project != null) {
			System.out.println(project);	//project.toString()	
		}else {
			System.out.println("해당 프로젝트는 존재하지 않습니다.");
		}
	}
	
	//진행중인 모든 프로젝트 출력
	public static void lunchListView(ArrayList<LunchProject> allProbonoProject){
		
		int index = 1;
		for(LunchProject project : allProbonoProject) {
			
			if(project != null){
				System.out.println("[진행 중인 project : " + (index++) + "] " + project);
			}
			
		}
	}
	public static void successMessage(String message) {
		System.out.println(message);
	}
	
}



