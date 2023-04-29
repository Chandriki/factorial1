package chandriki2;
import java.util.Scanner;
public class factorial1 {
	static int fact(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
			return (n*fact(n-1));
	}
	//by using iteration and for loop or without recursion
	static int fact_iterative(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		else
		{
			int i,result=1;
			for(i=1;i<=n;i++)
			{
				result*=i;
			}
			return result;
		}
	}

public static void main(String args[])
{
	System.out.println("enter the number you want factorial:");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	System.out.println(fact(x));
	System.out.println(fact_iterative(x));
}
}
