public class Underage extends Exception
{
int x;
Underage(int x)
{
this.x=x;
}
public String getMessage()
{
 return "Person is underage as his age is "+x;
}
}
class exceptiondemo 
{
public static void test(int x)throws underage
{
 if(x<18)
 throw new Underage(x);
 else
 System.out.println("Person is not underage");
}
public static void main(String args[])
{
 Underage obj=new Underage(16);
 Underage obj1=new Underage(19);
int y=obj.x;
 try
{
 test(y);
 }
 catch(Underage e)
 {
 System.out.println(e.getMessage());
 }
 int z=obj1.x;
 try
 {
 test(z);
 }
 catch(Underage e)
 {
 System.out.println(e.getMessage());
 }
}