package in.design.pattern.structural.adapter.self;

public class Client {
public static void main(String[] args) {
	Adapter adapter = new Adapter();
	setDetails(adapter);
	GenerateSalary generateSalary = new GenerateSalary();
	String sal = generateSalary.generateSalary(adapter);
	
	
}
public static CustomerExistingClass setDetails(CustomerExistingClass employee)
{
	employee.setId(1l);
	employee.setName("Gaurav");
	employee.setSalary("150000");
	return employee;
}
}
