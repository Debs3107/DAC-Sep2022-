
import java.util.Scanner;
class P3{
public static void main(String args[]){
	System.out.print("Enter the no. of rows : ");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	
for (int i=0;i<n;i++){
for(int j=0;j<=2*n-i;j++)
{
	if(i==j || j==2*n-i)
	{	
		System.out.print("*");
	}
	else{
		System.out.print(" ");
	}
	}
	System.out.println();
}
}
}



