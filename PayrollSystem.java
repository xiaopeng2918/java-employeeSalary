package top.yxp2918.practice;

import java.util.Scanner;

public class PayrollSystem {
	public static void main(String[] args) {
		// 这里并不是new了一个抽象类，而是在堆空间生成了一个存放抽象类子类实例的数组
		Employee[] employees = new Employee[2];
		// 初始化数组
		employees[0] = new SalarieEmployee("李", 25, new MyDate(2000, 12, 8), 12000);
		employees[1] = new HourlyEmployee("赵", 23, new MyDate(1998, 5, 7), 100, 240);
		// 输入当前月份
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入当前月份");
		int month = sc.nextInt();
		
		for(int i = 0;i < employees.length;i++){
			System.out.println(employees[i].toString());
			double earnings = employees[i].earnings();
			
			if(month == employees[i].getBirthday().getMonth()){
				System.out.println("生日快乐，奖励100元");
				earnings += 100;
			}
			System.out.println("月收入为" + earnings);
		}
	}
}
