
public abstract class Employee {
	
	private String name;
	private String cpf;
	private double salary;

	public Employee() { };
	public Employee(String name, String cpf, double salary) {
		this.name = name;
		this.cpf = cpf;
		this.salary = salary;
	}
	
	public abstract double getBonus();
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
