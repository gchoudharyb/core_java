package in.design.pattern.structural.adapter.self;

public class CustomerExistingClass {

	private String name;
	private Long id;
	private String salary;
	
	public CustomerExistingClass() {
		// TODO Auto-generated constructor stub
	}
	public CustomerExistingClass(String name, Long id, String salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "CustomerExistingClass [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
}
