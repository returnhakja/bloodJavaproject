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
	
	// 모든 프로젝트 반환
	public ArrayList<BloodTransfusionProject> getAllProjects(){
		return null;
	}
	
	// 프로젝트 검색_
	public BloodTransfusionProject getProject(String projectName) {
		return null;
		
	}

	// 새로운 프로젝트 추가
	public void projectInsert(BloodTransfusionProject newProject) {
		return null;
	}
	
//	 프로젝트 수정 - 프로젝트 명으로 현혈자 혹은 수혈자 수정_
	public void projectUpdate(String projectName, People people) throws NotExistException{
		return null;
	}
	
	// 프로젝트 삭제_
	public void projectDelete(String projectName) throws NotExistException{
		return null;
	}	
}
