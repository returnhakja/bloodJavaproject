package blood.transfusion.dto;

public class BloodTransfusionProject {
	private String btProjectName; // ����������Ʈ �̸�
	private String btProjectId; //����������Ʈ id
	private Donor donor; // ������
	private Recipient recipient; // ������
	private String projectContenent; // ����������Ʈ ����
	
	public String getBtProjectName() {
		return btProjectName;
	}

	public void setBtProjectName(String btProjectName) {
		this.btProjectName = btProjectName;
	}

	public String getBtProjectId() {
		return btProjectId;
	}

	public void setBtProjectId(String btProjectId) {
		this.btProjectId = btProjectId;
	}

	public Donor getDonor() {
		return donor;
	}

	public void setDonor(Donor donor) {
		this.donor = donor;
	}

	public Recipient getRecipient() {
		return recipient;
	}

	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}

	public String getProjectContenent() {
		return projectContenent;
	}

	public void setProjectContenent(String projectContenent) {
		this.projectContenent = projectContenent;
	}

	public BloodTransfusionProject(String btProjectName, String btProjectId, Donor donor, Recipient recipient,
			String projectContenent) {
		super();
		this.btProjectName = btProjectName;
		this.btProjectId = btProjectId;
		this.donor = donor;
		this.recipient = recipient;
		this.projectContenent = projectContenent;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[���� ������Ʈ : ");
		builder.append(btProjectName);
		builder.append(", ������ƮID : ");
		builder.append(btProjectId);
		builder.append(", ������ : ");
		builder.append(donor);
		builder.append(", ������ : ");
		builder.append(recipient);
		builder.append(", ������Ʈ ���� : ");
		builder.append(projectContenent);
		builder.append("]");
		return builder.toString();
	}
}
