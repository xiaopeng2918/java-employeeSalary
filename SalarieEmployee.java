package top.yxp2918.practice;

public class SalarieEmployee extends Employee {
	private double monthlySalary;
	
	
	public SalarieEmployee() {
		super();
	}


	public SalarieEmployee(String name, Number age, MyDate birthday, double monthlySalary) {
		super(name, age, birthday);
		this.monthlySalary = monthlySalary;
	}

	

	public double getMonthlySalary() {
		return monthlySalary;
	}


	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	


	@Override
	public String toString() {
		return "SalarieEmployee [" + super.toString() + "]";
	}


	public double earnings(){
		return monthlySalary;
	}
}
