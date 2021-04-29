import java.util.Scanner; //java.util: Package; Scanner : Class
class Prime
{
	public static void main(String args[])
	{
		int num,c=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=ob.nextInt();
		for(int i=2;i<=num-1;i++)
		{
			if (num%i==0)
			   c++;
		}
		if(c==0)
			System.out.println("prime");
		else
			System.out.println("Not Prime");
	}
	
}
