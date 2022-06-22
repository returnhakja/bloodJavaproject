package blood.transfusion.model;

import java.util.ArrayList;

import blood.transfusion.dto.BloodTransfusionProject;
import blood.transfusion.dto.Donor;
import blood.transfusion.dto.Recipient;

public class BloodTransfusionVirtualDB {
	private static BloodTransfusionVirtualDB instance = new BloodTransfusionVirtualDB();
	private ArrayList<BloodTransfusionProject> projects = new ArrayList<>();
	
	private BloodTransfusionVirtualDB() {
		projects.add(new BloodTransfusionProject("A-", "bt1",
												new Donor("donor1", "����1", 12, "M", "A-", "����"), 
												new Recipient("recipient1", "����1", 23, "F", "A-", "���"), 
												"A-������ ����"));
		
		projects.add(new BloodTransfusionProject("B-","bt2",
												new Donor("donor2", "����2", 67, "F", "B-", "�˻�"), 
												new Recipient("recipient1", "����2", 21, "F", "B-", "���"), 
												"B-������ ����"));
		
		projects.add(new BloodTransfusionProject("O-","bt3",
												new Donor("donor3", "����3", 35, "F", "O-", "����"), 
												new Recipient("recipient3", "����3", 3, "M", "O-", "����"), 
												"O-������ ����"));
	}
	
	public static BloodTransfusionVirtualDB getInstance() {
		return instance;
	}
	
	// ��� ������Ʈ ��ȯ_
	public ArrayList<BloodTransfusionProject> getProjectList(){
		return projects;
	}
	
	// ������Ʈ ����_
	public void insertProject(BloodTransfusionProject newProject) {
		projects.add(newProject);
	}
	
	// ����? 
	public void deleteProject(BloodTransfusionProject newProject) {
		projects.remove(newProject);
	}
}
