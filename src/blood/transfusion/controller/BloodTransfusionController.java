package blood.transfusion.controller;

import blood.transfusion.dto.BloodTransfusionProject;
import blood.transfusion.dto.People;
import blood.transfusion.service.BloodTransFusionProjectService;


	public class BloodTransfusionController {
		private static BloodTransfusionController instance = new BloodTransfusionController();
		private BloodTransFusionProjectService service = BloodTransFusionProjectService.getInstance();

		private BloodTransfusionController() {}

		public static BloodTransfusionController getInstance() {
			return instance;
		}

		// 모든 프로젝트 검색
		public void projectListView() {
			return null;
		}
		
		// 특정 프로젝트 검색_
		public void projectView(String projectName) {
			return null;
			
			
		}

		// 새로운 프로젝트 저장
		public void insertProject(BloodTransfusionProject newProject) {
			return null;
		}
		
		// 존재하는 프로젝트 수정_
		public void updateProject(String projectName, People people) {
			
		}

		// 이름으로 검색한 프로젝트 삭제_
		public void deleteProject(String projectName) {
			return null;
		}
	
}
