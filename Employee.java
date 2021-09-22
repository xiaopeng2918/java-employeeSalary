package top.yxp2918.practice;

public abstract class Employee {
	private String name;
	private Number age;
	private MyDate birthday;
	
	
	public Employee() {
		super();
	}

	public Employee(String name, Number age, MyDate birthday) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Number getAge() {
		return age;
	}

	public void setAge(Number age) {
		this.age = age;
	}

	public MyDate getBirthday() {
		return birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}

	public abstract double earnings();
	
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", birthday=" + birthday.toDateString();
	}

}
