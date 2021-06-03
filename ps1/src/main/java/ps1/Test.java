package ps1;

import java.util.ArrayList;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Operations2 op2 = new Operations2();
		String[] types = {"3g", "4g"};
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			int randInt1 = (rand.nextBoolean()) ? 1 : 0;
			int randInt2 = (rand.nextBoolean()) ? 1 : 0;
			
			String type = types[randInt1];
			Customer customer = new Customer(
					"Omar " + i, i, type, (randInt2 + 1));
			System.out.println(customer.toString());
			op2.addCustomer(customer);
		}
		
		System.out.println("------------------------------------------");
		op2.calculateBillAndAddAccounts(0);
		op2.calculateBillAndAddAccounts(1);
		op2.calculateBillAndAddAccounts(2);
		op2.calculateBillAndAddAccounts(3);
		op2.calculateBillAndAddAccounts(4);
		op2.calculateBillAndAddAccounts(5);
		op2.calculateBillAndAddAccounts(6);
		op2.calculateBillAndAddAccounts(7);
		op2.calculateBillAndAddAccounts(8);
		op2.calculateBillAndAddAccounts(9);
		
		ArrayList<Account> list = op2.getAccountList();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		System.out.println("------------------------------------------");
		list = op2.heighestAmountPaidUsers();

		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		System.out.println("------------------------------------------");
		op2.concatUserNames();
	}
}
