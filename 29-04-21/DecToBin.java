//to convert decimal to binary number
import java.util.Scanner; //java.util: Package; Scanner : Class
class DecToBin
{
	public static void main(String args[])
	{
		int[] bin=new int[20];
		int num,i=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=ob.nextInt();  //for storing the value entetred by user
		while(num!=0)
		{
			bin[i]=num%2;
			num/=2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.println(bin[j]+" ");
		}
	}
	
}
