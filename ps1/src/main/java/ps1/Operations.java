package ps1;

import java.util.ArrayList;

public abstract class Operations {
	
	private ArrayList<Customer> customerList = new ArrayList<Customer>();
	private ArrayList<Account> accountList = new ArrayList<Account>();
	
	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}
	public ArrayList<Account> getAccountList() {
		return accountList;
	}
	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}
	
	public boolean addCustomer(Customer customer) {
		if(!this.customerList.contains(customer)) {
			this.customerList.add(customer);
			return true;
		}
		return false;
	}
	
	public ArrayList<Account> calculateBillAndAddAccounts(int connectionId){
		int days = 30;
		int multiplier = 1;
//		System.out.println(this.customerList.size());
		for(int i = 0; i < this.customerList.size(); i++) {
			Customer customer = this.customerList.get(i);
			Account account = new Account();
			if(customer.getConnectionId() == connectionId) {
				if(customer.getType().equals("3g") && 
						customer.getPlanType() == 1)
					multiplier = 50;
				else if(customer.getType().equals("3g") && 
						customer.getPlanType() == 2)
					multiplier = 75;
				else if(customer.getType().equals("4g") && 
						customer.getPlanType() == 1)
					multiplier = 70;
				else if(customer.getType().equals("4g") && 
						customer.getPlanType() == 2)
					multiplier = 100;
				
				account.setCustomer(customer);
				account.setAmountToPay(days * multiplier);
				this.accountList.add(account);				
			}
		}
		
		return this.accountList;
	}
	
	public abstract ArrayList<Account> heighestAmountPaidUsers();

}
