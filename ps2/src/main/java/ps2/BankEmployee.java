package ps2;

public class BankEmployee {
	private int empId;
	private String empName;
	private String branchName;
	private String dept;
	private double salary;
	private boolean permanentCheck;
	
	
	
	public BankEmployee(
			int empId, String empName, 
			String branchName, String dept, 
			double salary, boolean permanentCheck) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.branchName = branchName;
		this.dept = dept;
		this.salary = salary;
		this.permanentCheck = permanentCheck;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isPermanentCheck() {
		return permanentCheck;
	}
	public void setPermanentCheck(boolean permanentCheck) {
		this.permanentCheck = permanentCheck;
	}

	@Override
	public String toString() {
		return "BankEmployee [empId=" + empId + ", empName=" + empName + ", branchName=" + branchName + ", dept=" + dept
				+ ", salary=" + salary + ", permanentCheck=" + permanentCheck + "]";
	}
	
	
	
}
