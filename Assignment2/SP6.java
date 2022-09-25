class SP6
{
public static void main(String args[])
{
	
for(int i=1;i<=5;i++)
{
	for(int j=2*(i-1);j>=1;j--)

	{
		System.out.print(" ");
	}
	for(int k=0;k<=5-i;k++)

	{
		System.out.print(" *");
	}
	
	
	System.out.print(" ");
	
	for(int m=5-i;m>0;m--)

	{
		System.out.print("* ");
	}
		

	System.out.println();


}

}
}