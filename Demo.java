import java.util.Scanner;
class Demo
	{
		public static void main(String[] args)
		{
			Emp e=new Emp();
			while(true)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("1.creat \n 2.display \n 3.Raise Salary \n 4.Exit");
				int i=sc.nextInt();
				if(i==4)
					break;
				switch(i)
				{
					case 1:e.create();
							break;
					case 2:e.display();
							break;
					case 3:e.raiseSalary();
							break;
				}
			}
		}
	}
