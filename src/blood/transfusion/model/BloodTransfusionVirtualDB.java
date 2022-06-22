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
												new Donor("donor1", "ÇåÇ÷1", 12, "M", "A-", "ºÀ»ç"), 
												new Recipient("recipient1", "¼öÇ÷1", 23, "F", "A-", "»ç°í"), 
												"A-Çü°£ÀÇ ¼öÇ÷"));
		
		projects.add(new BloodTransfusionProject("B-","bt2",
												new Donor("donor2", "ÇåÇ÷2", 67, "F", "B-", "°Ë»ç"), 
												new Recipient("recipient1", "¼öÇ÷2", 21, "F", "B-", "»ç°í"), 
												"B-Çü°£ÀÇ ¼öÇ÷"));
		
		projects.add(new BloodTransfusionProject("O-","bt3",
												new Donor("donor3", "ÇåÇ÷3", 35, "F", "O-", "ºÀ»ç"), 
												new Recipient("recipient3", "¼öÇ÷3", 3, "M", "O-", "Áúº´"), 
												"O-Çü°£ÀÇ ¼öÇ÷"));
	}
	
	public static BloodTransfusionVirtualDB getInstance() {
		return instance;
	}
	
	// ¸ðµç ÇÁ·ÎÁ§Æ® ¹ÝÈ¯_
	public ArrayList<BloodTransfusionProject> getProjectList(){
		return projects;
	}
	
	// ÇÁ·ÎÁ§Æ® ÁÖÀÔ_
	public void insertProject(BloodTransfusionProject newProject) {
		projects.add(newProject);
	}
	
	// »èÁ¦? 
	public void deleteProject(BloodTransfusionProject newProject) {
		projects.remove(newProject);
	}
}
