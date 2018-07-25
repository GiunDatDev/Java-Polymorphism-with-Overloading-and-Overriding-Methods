package employmentConf;

public class companyMember {
	protected String name;
	protected long salary;
	
	public companyMember() {
		
	}
	
	public companyMember(String name) {
		this.name = name;
	}
	
	protected String employeeType() {
		return "";
	}
	
	public void showInfo() {
		System.out.println("==== Employee Name: " + name + "====");
		System.out.println(">>> Type of employee: " + employeeType());
		System.out.println(">>> Employee Salary: " + salary + " USD");
		System.out.println("");
	}
}
