package MainClass;
import employmentConf.fulltimeEmployee;
import employmentConf.parttimeEmployee;
import configuration.infoConf;

public class mainClass {
	public static void main(String args[]) {
		// Full time employees
		fulltimeEmployee BOSSWILL = new fulltimeEmployee("NGUYEN DAO THE HIEN", 100);
		fulltimeEmployee EMPLOYEESHAUN = new fulltimeEmployee("SHAUN MURPHY");
		fulltimeEmployee EMPLOYEEDEAN = new fulltimeEmployee("DEAN NGUYEN", 50);
		fulltimeEmployee EMPLOYEESAM = new fulltimeEmployee("SAM TRAN", 10);
		
		// Part time employees
		parttimeEmployee CLEANER = new parttimeEmployee("EMMA DUNNY", 1000);
		
		BOSSWILL.setEmployeeType(infoConf.BOSS);
		EMPLOYEESHAUN.setEmployeeType(infoConf.BOSS);
		
		// Find salary
		BOSSWILL.findSalary();
		EMPLOYEEDEAN.findSalary();
		EMPLOYEESHAUN.findSalary();
		EMPLOYEESAM.findSalary();
		CLEANER.findSalary();
		
		// Show all information
		BOSSWILL.showInfo();
		EMPLOYEEDEAN.showInfo();
		EMPLOYEESHAUN.showInfo();
		EMPLOYEESAM.showInfo();
		CLEANER.showInfo();
	}
}
