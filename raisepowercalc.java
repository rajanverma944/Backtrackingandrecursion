import java.util.*;
class raisepowercalc
{
	public static int calpower(int i,int j)
	{
		if(y==0)
{
			return 0;
}

		else if(j==1)
{
			return x;
}
		else
{
			return i*calpower(i,j-1);
}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;


		a=sc.nextInt();


		b=sc.nextInt();


		System.out.print(calpower(a,b));
	}
}