package lunch.view;
/**
4 * PROJECT  : 점심 가게
 * NAME  :  StartView.java
 * DESC  : 실행 클래스
 * 		     기부자, 수혜자, 재능기부 종류 및 실제 진행되는 프로젝트 생성 및 CRUD 로직을 test하는 클래스
 */
import lunch.controller.LunchProjectController;
import lunch.model.dto.Food;
import lunch.model.dto.LunchProject;
import lunch.model.dto.LunchType;
import lunch.model.dto.Team;
public class StartView {
	public static void main(String[] args) {
		// 기부자 정보 - 사번, 사원명, 이메일, 기부하기를 희망하는 재능기부 종류
		Team team1 = new Team("1팀", "BTS", "아이유", "블랙핑크", "김범수", "양식");
		Team team2 = new Team("2팀", "손흥민", "황희찬", "이강인", "김민재", "중식");
		Team team3 = new Team("3팀", "유재석", "박명수", "정형돈", "정준하", "일식");
		Team team4 = new Team("4팀", "강호동", "이수근", "김종민", "은지원", "한식");
		Team team5 = new Team("5팀", "강유완", "곽병찬", "구동길", "김상민", "패스트푸드");
		// 음식 종류
		Food food1 = new Food("양식", "파스타, 피자");
		Food food2 = new Food("중식", "짜장면, 짬뽕, 탕수육");
		Food food3 = new Food("일식", "초밥, 라멘, 돈부리");
		Food food4 = new Food("한식", "칼국수, 김치찌개");
		Food food5 = new Food("패스트푸드", "롯데리아, 맥도날드, 맘스터치");
		// 가게 목록
		LunchType Western = new LunchType("양식", "달리 181", "레지아노","안농");
		LunchType China = new LunchType("중식", "모범반점", "샤오바오 ","안농");
		LunchType Japan = new LunchType("일식", "소마카츠", "오카와리","안농");
		LunchType Korean = new LunchType("한식", " 이선생", "김둘레순대국 ","안농");
		LunchType Fastfood = new LunchType("패스트푸드", "맥도날드",	"맘스터치","안농");
		// 기부자, 수혜자가 매핑된 실제 진행되는 "재능 기부 프로젝트"
		// 프로젝트명, 팀, 음식, 음식종류, 시작시간, 종료시간, 특이사항
		LunchProject WesternProject
		= new LunchProject("1번 ", "양식", team1, food1, Western, "13:00~", "14:00","Délicieux ");
							        		
		LunchProject ChinaProject
		= new LunchProject("2번 ","중식", team2, food2, China, "13:00~", "14:00", "好吃 ");
		
		LunchProject JapanProject
		= new LunchProject("3번 ","일식", team3, food3, Japan, "13:00~", "14:00", "おいしい");
		
		LunchProject KoreanProject
		= new LunchProject("4번 ","한식", team4, food4, Korean, "13:00~", "14:00", "맛있다.");
		
		LunchProject FastfoodProject
		= new LunchProject("5번 ","패스트푸드", team5, food5, Fastfood, "13:00~", "14:00", "Delicious");
		 
		// 데이터 구성 후 서비스 로직 실행
		LunchProjectController controller = LunchProjectController.getInstance();
		
		System.out.println("*** 01. Project 생성 ***");
		// 저장 시도시 이미 존재할 경우 예외 발생, 미 존재시 정상 저장 실행
		controller.TeamProjectInsert(WesternProject);
		controller.TeamProjectInsert(ChinaProject);
		controller.TeamProjectInsert(JapanProject);
		controller.TeamProjectInsert(KoreanProject);
		controller.TeamProjectInsert(FastfoodProject);
		
		System.out.println("\n*** 02. 모든 Project 검색 ***".toString());
		controller.getTeamProjectsList();
		
		System.out.println("\n*** 03. '1번' Project 검색 ***");
		controller.getTeamProject("1번 ");
		
		//한식 변경하기
		System.out.println("\n*** 04. '1번 ' Project의 팀순서 변경(수정) 후 해당 Project 검색 ***");
		controller.teamProjectUpdate("1번 ", team5);
		controller.getTeamProject("1번 ");
		
		
		//한식 삭제하기
		System.out.println("\n*** 05. '1번 ' Project 삭제 후 삭제한 Project 존재 여부 검색 ***");
		controller.teamProjectDelete("1번 ");
		controller.getTeamProject("1번 ");
		
	}
}