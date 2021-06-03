package subjective;

import java.util.ArrayList;

public class OrgBilling extends OrgFuntionalities{
	
	public OrgBilling() {}

	@Override
	public double getDiscountOnBill(int orgId, double amount) {
		ArrayList<Organisation> list = this.getOrganisationsList();
		double discount = 0.0;
		for(int i = 0; i < list.size(); i++) {
			Organisation organisation = list.get(i);
			if(organisation.getOrgId() == orgId) {
				if(organisation.getOrgRating() == 'A')
					discount = 0.2;
				else if(organisation.getOrgRating() == 'B')
					discount = 0.1;
				else if(organisation.getOrgRating() == 'C')
					discount = 0.05;
			}
		}
		double discountM = amount * discount;
		return amount - discountM;
	}

}
