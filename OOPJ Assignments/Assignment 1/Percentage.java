// Java program to find  percentage of Five Subjects
/*
03.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
Take the obtained marks from user using Scanner class. 
Output should be in this format [ percentage marks = 99 % ]. 
Use concatenation operator here.*/
import java.util.Scanner;

public class Percentage {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int m1,m2,m3,m4,m5; 
	    float total, Percentage, Average;
		sc = new Scanner(System.in);
		
		System.out.print("Enter the Five Subjects Marks : ");
		m1 = sc.nextInt();	
		m2 = sc.nextInt();	
		m3 = sc.nextInt();	
		m4 = sc.nextInt();	
		m5 = sc.nextInt();	
		
		total = m1+m2+m3+m4+m5;
		
	    Percentage = (total / 500) * 100;
	    
	    System.out.println(" Total Marks =  " + total);

	    System.out.println(" Percentage Marks =  " + Percentage +"%");
	}
}