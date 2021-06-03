package ps2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		EmployeeManagementImpl mgmt = new EmployeeManagementImpl();
		
		for(int i = 0; i < 10; i++) {
			boolean check = (i%2 == 0) ? true : false;
			String dept = (i%2 == 0) ? "Admin" : "Other";
			BankEmployee employee = new BankEmployee(
					i, "Omar", "Idk", dept, i * 10000, check);
			mgmt.addEmployee(employee);
		}
		
		HashSet<BankEmployee> hikes = mgmt.getSalaryHike();
		Iterator it = hikes.iterator();
		while(it.hasNext()) {
			BankEmployee employee = (BankEmployee) it.next();
			System.out.println(employee.getEmpName() + " " + employee.getSalary());
		}
		
		
		HashMap<Integer, BankEmployee> employees = mgmt.getEmployees();
		
		it = employees.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue().toString());
	        it.remove();
	    }

		
		
	}
}
