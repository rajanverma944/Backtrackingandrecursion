import java.util.*;
class arrsearch
{
	public static boolean searcharr(int arr[],int num)
	{
		if(arr.length==0)
		{
			return false ;
		}
		int arr1[]=new int[arr.length-1];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=arr[i+1];
		}
		if(arr[0]==num)
		{
			return true;
		}
		else
		{
			return searcharr(arr1,num);
		}
	}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n;
	n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	int num=s.nextInt();
	System.out.println(searcharr(a,num));
}
}