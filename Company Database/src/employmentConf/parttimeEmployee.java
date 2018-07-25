package employmentConf;
import configuration.infoConf;

public class parttimeEmployee extends companyMember{
	private int workingTime;
	
	public parttimeEmployee(String name, int workingTime) {
		this.name = name;
		this.workingTime = workingTime;
	}
	
	@Override
	public String employeeType() {
		return "Parttime employee";
	}
	
	public void findSalary() {
		salary = infoConf.PARTTIMEEMPLOYEESALARY * workingTime;
	}
}
