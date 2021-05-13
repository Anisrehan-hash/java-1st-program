import java.util.Scanner;
class Emp
{
	String name;
	int age;
	double salary;
	String job;
	Scanner sc1=new Scanner(System.in);
	void create()
	{
		System.out.println("Enter name");
		name=sc1.next();
		System.out.println("Enter Age");
		age=sc1.nextInt();
		System.out.println("Enter salary");
		salary=sc1.nextDouble();
		System.out.println("Enter Designation");
		job=sc1.next();
		
	}
	void display()
	{
		System.out.println("Name: "+name+"\nAge: "+age+"\nSalary: "+salary+"\nDesignation: "+job);
	}
	void raiseSalary()
	{
		salary=salary+1000;
		System.out.println("salary raised......!");
	}
}