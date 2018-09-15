 import java.util.Scanner;
 import java.util.*;
 import java.io.*; 
 class sumofdigits
{
	private static int i=-1;
private static int sum(String n)
{ 
	i++;
	char a[]=n.toCharArray();
	if(i==n.length()-1)
	{
		return ((int)a[i]-48);
	}
		return(sum(n)+(int)a[i]-48);
	
}


public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String a=s.next();
	System.out.println(sum(a));

}
}
