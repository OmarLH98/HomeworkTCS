package subjective;

import java.util.ArrayList;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		OrgBilling billing = new OrgBilling();
		
		String[] statuses = {"Positive", "Negative"};
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			String[] status = {"", "", "", ""};
			for(int j = 0; j < 4; j++) {
				int randInt = (rand.nextBoolean()) ? 1 : 0;
				status[j] = statuses[randInt];
			}
			Organisation org = new Organisation(
					i, "Omars company", i, status);
			
			System.out.println(org.toString());
			billing.addOrganisation(org);
		}
		
		System.out.println("------------------------------------------");
		System.out.println(billing.getRating(0));
		System.out.println(billing.getRating(1));
		System.out.println(billing.getRating(2));
		System.out.println(billing.getRating(3));
		System.out.println(billing.getRating(4));
		System.out.println(billing.getRating(5));
		System.out.println(billing.getRating(6));
		System.out.println(billing.getRating(7));
		System.out.println(billing.getRating(8));
		System.out.println(billing.getRating(9));
		
		ArrayList<Organisation> listRanked = billing.getOrgList('B');
		
		System.out.println("--------------------------------------------");
		for(int i = 0; i < listRanked.size(); i++) {
			System.out.println(listRanked.get(i).toString());
		}
		
		System.out.println("--------------------------------------------");
		System.out.println(billing.getDiscountOnBill(9, 20000));

	}

}
