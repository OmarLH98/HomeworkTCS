package subjective;

import java.util.Arrays;

public class Organisation {

	private int orgId;
	private String orgName;
	private int noOfBranches;
	private char orgRating;
	private String[] financialStatus;
	
	public Organisation() {}

	public Organisation(int orgId, String orgName, int noOfBranches, String[] financialStatus) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.noOfBranches = noOfBranches;
		this.financialStatus = financialStatus;
		this.orgRating = 'X';
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}

	public char getOrgRating() {
		return orgRating;
	}

	public void setOrgRating(char orgRating) {
		this.orgRating = orgRating;
	}

	public String[] getFinancialStatus() {
		return financialStatus;
	}

	public void setFinancialStatus(String[] financialStatus) {
		this.financialStatus = financialStatus;
	}

	@Override
	public String toString() {
		return "Organisation [orgId=" + orgId + ", orgName=" + orgName + ", noOfBranches=" + noOfBranches
				+ ", orgRating=" + orgRating + ", financialStatus=" + Arrays.toString(financialStatus) + "]";
	}
	
	
	
}
