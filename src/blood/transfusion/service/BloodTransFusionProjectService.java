package blood.transfusion.service;

import java.util.ArrayList;

import blood.transfusion.dto.BloodTransfusionProject;
import blood.transfusion.dto.People;
import blood.transfusion.exception.NotExistException;
import blood.transfusion.model.BloodTransfusionVirtualDB;

public class BloodTransFusionProjectService {
	private static BloodTransFusionProjectService instance = new BloodTransFusionProjectService();
	private BloodTransfusionVirtualDB projectVirtualData = BloodTransfusionVirtualDB.getInstance();

	private BloodTransFusionProjectService(){}
	public static BloodTransFusionProjectService getInstance(){
		return null;
	}
	
	// ��� ������Ʈ ��ȯ
	public ArrayList<BloodTransfusionProject> getAllProjects(){
		return null;
	}
	
	// ������Ʈ �˻�_
	public BloodTransfusionProject getProject(String projectName) {
		return null;
		
	}

	// ���ο� ������Ʈ �߰�
	public void projectInsert(BloodTransfusionProject newProject) {
		return null;
	}
	
//	 ������Ʈ ���� - ������Ʈ ������ ������ Ȥ�� ������ ����_
	public void projectUpdate(String projectName, People people) throws NotExistException{
		return null;
	}
	
	// ������Ʈ ����_
	public void projectDelete(String projectName) throws NotExistException{
		return null;
	}	
}
