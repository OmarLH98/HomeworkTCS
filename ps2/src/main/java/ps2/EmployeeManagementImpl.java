package ps2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class EmployeeManagementImpl implements EmployeeManagement{
	
	private HashSet<BankEmployee> employeeSet = new HashSet<BankEmployee>();

	public HashSet<BankEmployee> getEmployeeSet() {
		return employeeSet;
	}

	public void setEmployees(HashSet<BankEmployee> employees) {
		this.employeeSet = employees;
	}
	
	boolean addEmployee(BankEmployee bankEmployee) {
		if(!this.employeeSet.contains(bankEmployee)) {
			this.employeeSet.add(bankEmployee);
			return true;
		}
		return false;
	}

	@SuppressWarnings("null")
	@Override
	public HashSet<BankEmployee> getSalaryHike() {
		HashSet<BankEmployee> permanents = new HashSet<BankEmployee>();
		
		Iterator<BankEmployee> it = this.employeeSet.iterator();
		while(it.hasNext()) {
			BankEmployee employee = it.next();
			double actualSalary = employee.getSalary();
			double salaryHike = 0.0;
			
			if(employee.isPermanentCheck() 
					&& actualSalary > 20000)
				salaryHike = 0.10;
			else if(!employee.isPermanentCheck() 
					&& actualSalary >  20000)
				salaryHike = 0.08;
			else
				salaryHike = 0.06;
			
			double increment = actualSalary * salaryHike;
			employee.setSalary(actualSalary + increment);
			
			if(employee.isPermanentCheck())
				permanents.add(employee);
		}
		return permanents;
	}
	
	@SuppressWarnings("null")
	public HashMap<Integer, BankEmployee> getEmployees(){
		HashMap<Integer, BankEmployee> employees = new HashMap<Integer, BankEmployee>();
		Iterator<BankEmployee> it = this.employeeSet.iterator();
		
		while(it.hasNext()) {
			BankEmployee employee = it.next();
			if(employee.getDept().equals("Admin"))
				employees.put(employee.getEmpId(), employee);
		}
		return employees;
	}
	
//	public HashSet<BankEmployee> sortPermanentEmployees(){
//		
//		List<String> list = new ArrayList<String>(set);
//        Collections.sort(list);
//		return employeeSet;
//	}

}
