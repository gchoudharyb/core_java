package in.design.pattern.structural.adapter.self;

public class ObjectAdapter implements EmployeeInf {

	private CustomerExistingClass cust;
	
	
	public ObjectAdapter(CustomerExistingClass cust) {
		super();
		this.cust = cust;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return cust.getName();
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return cust.getId();
	}

	@Override
	public String getMonthlyIncome() {
		// TODO Auto-generated method stub
		return cust.getSalary();
	}

}
