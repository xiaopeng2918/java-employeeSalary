package top.yxp2918.practice;

public class HourlyEmployee extends Employee {
	// 每小时费用
	private int wage;
	// 每月工作小时数
	private int hour;
	
	
	public HourlyEmployee() {
		super();
	}



	public HourlyEmployee(String name, Number age, MyDate birthday, int wage, int hour) {
		super(name, age, birthday);
		this.wage = wage;
		this.hour = hour;
	}



	public int getWage() {
		return wage;
	}



	public void setWage(int wage) {
		this.wage = wage;
	}



	public int getHour() {
		return hour;
	}



	public void setHour(int hour) {
		this.hour = hour;
	}

	

	@Override
	public String toString() {
		return "HourlyEmployee [" + super.toString() + "]";
	}



	public double earnings(){
		return hour * wage;
	}
}
