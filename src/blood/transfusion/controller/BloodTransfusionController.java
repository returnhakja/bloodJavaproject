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

		// ��� ������Ʈ �˻�
		public void projectListView() {
			return null;
		}
		
		// Ư�� ������Ʈ �˻�_
		public void projectView(String projectName) {
			return null;
			
			
		}

		// ���ο� ������Ʈ ����
		public void insertProject(BloodTransfusionProject newProject) {
			return null;
		}
		
		// �����ϴ� ������Ʈ ����_
		public void updateProject(String projectName, People people) {
			
		}

		// �̸����� �˻��� ������Ʈ ����_
		public void deleteProject(String projectName) {
			return null;
		}
	
}
