package ps1;

import java.util.ArrayList;

public class Operations2 extends Operations{
	
	public Operations2() {}

	@Override
	public ArrayList<Account> heighestAmountPaidUsers() {
		ArrayList<Account> list = this.getAccountList();
		ArrayList<Account> list2 = new ArrayList<Account>();
		double highest = 0.0;
		int index = 0, i = 0;
		for (Account account : list) {
			if(account.getAmountToPay() > highest) {
				highest = account.getAmountToPay();
				index = i;
			}
			i++;
		}
		list2.add(list.get(index));
		return list2;
	}
	
	public void concatUserNames() {
		String userNames3G = "";
		String userNames4G = "";
		ArrayList<Account> list = this.getAccountList();
		for (Account account : list) {
			if(account.getCustomer().getType().equals("3g"))
				userNames3G += account.getCustomer().getUserName() + " "; 
			if(account.getCustomer().getType().equals("4g"))
				userNames4G += account.getCustomer().getUserName() + " ";
		}
		
		System.out.println(userNames3G + " : " + userNames4G);
	}

}
