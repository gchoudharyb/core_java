package in.design.pattern.structural.adapter.self;

public class Adapter extends CustomerExistingClass implements EmployeeInf{

	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.getName();
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return this.getId();
	}



	@Override
	public String getMonthlyIncome() {
		// TODO Auto-generated method stub
		return this.getSalary();
	}

}
