package in.design.pattern.structural.adapter.self;

public class GenerateSalary {

	public String generateSalary(EmployeeInf employeeInf) 
	{
		return employeeInf.getMonthlyIncome()+"1001";
	}
}
