 import java.util.Scanner;
 
 class fibonum
{
public static int fibonacii(int n)
{
	if(n==1)
	{
		return 0;
	}
	else if(n==2)
	{
		return 1;

	}
	else 
	{
		return (fibonacii(n-1)+fibonacii(n-2));
	}
}


public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	System.out.println(fibonacii(a));

}
}
