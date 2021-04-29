import java.util.Scanner;
import java.io.*;
class SumEle
{
	public static void main(String[] args)
	{
	int num,sum=0,n;
	Scanner ob=new Scanner(System.in);
	System.out.println("How many numbers?");
	n=ob.nextInt();
	for(int i=0;i<args.length;i++)
	{
		num=Integer.parseInt(args[i]);
		sum=num+sum;
	}
	System.out.println("Sum: "+sum);
	}
}