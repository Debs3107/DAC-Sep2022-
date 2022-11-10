//Gross Salary = Basic + HRA + DA + Allow – PF

/*
08.	In a company an employee is paid as under: 
If his basic salary is less than Rs. 10000, 
then HRA = 10% of basic salary and DA = 90% of basic salary. 
If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 
and DA = 98% of basic salary.
 If the employee's salary is input by the user 
 write a program to find his gross salary. 
 [ formula : GS= Basic + DA + HRA ]*/
import java.util.Scanner;
class Gs
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Employees's Salary: ");
			double basic_salary= sc.nextInt();
			
			double gs,hra,da;
			
			if (basic_salary < 10000)
			{
			 hra = 0.1 * basic_salary;
			 da = 0.9 * basic_salary;
			 
			gs= basic_salary + da + hra;
				System.out.println("Gross Salary of Employee = "+gs);
			}	
				else if(basic_salary >=	10000)
				{
					hra = 2000;
					da = 0.98 * basic_salary;
			 
					gs= basic_salary + da + hra;
					System.out.println("Gross Salary of Employee = "+gs);
				
				
				}
			else
			{
			 System.out.println("Invalid");
			
			}
		
		}

}