package Cafe;

public class Employee {
	String name;
	int age;
	String address;
	int salary;
	String chsal;

	public Employee(String name, int age, String address, int salary, String chsal) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
		this.chsal = chsal;
	}

	public void payCheck(Employee Emname, cafeFinance caname) {
		caname.cafecash = caname.cafecash - Emname.salary;
		System.out.println(Emname.name + "���� " + Emname.chsal + "���� �����Ͽ����ϴ�.\n");
	}

}
