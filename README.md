# java Emp program
1.This programs includes the real entities of employee in firm.

2.created two seprate class one is for main method and another one is for logic/entity.

3.Import scanner class from java package to use any of the available methods found in scanner class documentation.
       
       import java.util.Scanner;

4. Initialise the properties like name, age, salary and job.

5. Creat a method to read the properties
     
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
		
		
      -> The return type is void so, it will not return any parameter.
   
 6.To display the properties.
      
         void display()
	  {
	     	System.out.println("Name: "+name+"\nAge: "+age+"\nSalary: "+salary+"\nDesignation: "+job)
    }
  
  7. Constructor is used to creat the objects.
  
         Emp e=new Emp();
         
  8. do-while loop:-> In do while loop it will first execute the statement inside the body then check the condition.
  
  9. Switch statement:-> It is type of selection control mechanism used to allow the value of variable or expression to change the control flow of program execution.
  
  10. Break statement:-> When a break statement encountered inside a loop, the loop is immediately terminated and program control resumes at the next statement following the                              loop.
    
                     
			do{
			    System.out.println("1.creat \n 2.display \n 3.Raise Salary \n 4.Exit");
				choice=sc.nextInt();
				switch(choice)
				{
					case 1:e.create();
							b=true;
							break;
					case 2:if(b)
							e.display();
						   else
							   System.out.println("record not found..!");
							break;
					case 3:e.raiseSalary();
						    break;
				}
				
		   	}while(choice<4
