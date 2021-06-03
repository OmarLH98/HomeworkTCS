package subjective;

import java.util.ArrayList;

abstract class OrgFuntionalities {
	
	private ArrayList<Organisation> organisationsList = new ArrayList<Organisation>();
	
	public OrgFuntionalities () {}

	public OrgFuntionalities(ArrayList<Organisation> organisationsList) {
		super();
		this.organisationsList = organisationsList;
	}
	
	public boolean addOrganisation(Organisation organisation) {
		if(!this.organisationsList.contains(organisation)) {
			this.organisationsList.add(organisation);
			return true;
		}
		return false;
	}
	
	public Organisation getRating(int orgId) {
		for(int i = 0; i < this.organisationsList.size(); i++) {
			Organisation organisation = this.organisationsList.get(i);
			if(organisation.getOrgId() == orgId) {
				int count = 0; 
				for(int j = 0; j < organisation.getFinancialStatus().length; j++) {
					if(organisation.getFinancialStatus()[j] == "Positive")
						count++; 
				}
				if(count == 4) organisation.setOrgRating('A');
				else if(count >= 2) organisation.setOrgRating('B');
				else organisation.setOrgRating('C');
				return organisation;
			}
		}
		return null;
	}
	
	public ArrayList<Organisation> getOrgList(char rating){
		ArrayList<Organisation> list = new ArrayList<Organisation>();
		for(int i = 0; i < this.organisationsList.size(); i++) {
			Organisation org = this.organisationsList.get(i);
			if(org.getOrgRating() == rating)
				list.add(org);
		}
		if(list.size() > 0)
			return list;
		else
			return null;
	}
	
	public abstract double getDiscountOnBill(int orgId, double amount);

	public ArrayList<Organisation> getOrganisationsList() {
		return organisationsList;
	}

	public void setOrganisationsList(ArrayList<Organisation> organisationsList) {
		this.organisationsList = organisationsList;
	}
}
