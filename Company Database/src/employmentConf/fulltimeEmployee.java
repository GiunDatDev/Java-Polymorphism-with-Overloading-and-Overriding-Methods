package employmentConf;
import configuration.*;

public class fulltimeEmployee extends companyMember{
	private int bonusDay;
	private int employeeType;
	
	public fulltimeEmployee(String name) {
		super(name);
		this.employeeType = infoConf.EMPLOYEE;
	}
	
	public fulltimeEmployee(String name, int bonusDay) {
		super(name);
		this.employeeType = infoConf.EMPLOYEE;
		this.bonusDay = bonusDay;
	}
	
	public void setEmployeeType(int employeeType) {
		this.employeeType = employeeType;
	}
	
	@Override
	public String employeeType() {
		if (employeeType == infoConf.EMPLOYEE) {
			return "Fulltime employee" + (bonusDay > 0 ? " (BONUS DAY)":"");
		}
		else {
			return "Fulltime boss" + (bonusDay > 0 ? " (BONUS DAY)":"");
		}
	}
	
	public void findSalary() {
		if (employeeType == infoConf.EMPLOYEE) {
			salary = infoConf.EMPLOYEESALARY + bonusDay * infoConf.DAYBONUSSALARY;
		}
		else if (employeeType == infoConf.BOSS) {
			salary = infoConf.BOSSSALARY + bonusDay * infoConf.DAYBONUSSALARY;
		}
	}
}
