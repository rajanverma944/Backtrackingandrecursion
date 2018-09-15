import java.util.*;
class  revarr
{
	public static void reverseArray(int arr[],int i,int j)
	{
		if(arr.length==0)
			return;
		if(arr.length==1)
		{
			System.out.print(arr[0]);
		}
		          if(i>j)
					  return;
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
					reverseArray(arr,i+1,j-1);
				}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int arr[]=new int[a];
	for(int i=0;i<a;i++)
	{
		arr[i]=s.nextInt();
	}
	reverseArray(arr,0,a-1);
	for(int i=0;i<a;i++)
			{
				System.out.print(arr[i]+" ");
			}
}
}