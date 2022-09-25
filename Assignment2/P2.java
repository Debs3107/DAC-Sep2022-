
import java.util.Scanner;
class P2{
public static void main(String args[]){
	System.out.print("Enter the no. of rows : ");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
for (int i=1;i<=n;i++){
for(int j=1;j<=i;j++)
{
	
	System.out.print(j+" ");

}
for(int j=i-1;j>=1;j--)
{
	System.out.print(j+" ");
}

System.out.println();

}

}
}